package platform.communication;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import platform.util.ApplicationException;
import platform.util.ExceptionSeverity;
import platform.util.security.SecurityUtil;

public class HttpClient {

	private static int CONNECTION_TIMEOUT = 1000 * 30;    // timeout 20 second

	public HttpClient() {
	}

	public static String get(String urlString) throws IOException, ApplicationException {
		// System.out.println("REQUEST-URL :: " + urlString);

		InputStream is = null;
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setReadTimeout(CONNECTION_TIMEOUT);
			conn.setConnectTimeout(CONNECTION_TIMEOUT);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.connect();
			int response = conn.getResponseCode();

			if (response == 200) {
				is = conn.getInputStream();
				return readIt(is);
			}
			//System.out.println("SERVER RESPONSE CODE :: " + response);
			throw new ApplicationException(ExceptionSeverity.ERROR, "Error code : " + response);
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}


	public static String sendGetRequest(String urlString, String session_id) throws IOException, ApplicationException {
		//System.out.println("REQUEST-URL :: " + urlString);

		InputStream is = null;
		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			conn.setReadTimeout(CONNECTION_TIMEOUT);
			conn.setConnectTimeout(CONNECTION_TIMEOUT);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);

			conn.setRequestProperty("Cookie", "session_id=" + session_id);
			conn.connect();
			int response = conn.getResponseCode();

			if (response == 200) {
				is = conn.getInputStream();
				return readIt(is);
			}
			//System.out.println("SERVER RESPONSE CODE :: " + response);
			throw new ApplicationException(ExceptionSeverity.ERROR, "Error code : " + response);
		} finally {
			if (is != null) {
				is.close();
			}
		}
	}

	public static String sendGetByIdRequest(String serverURL, String namespace, String session_id, String resourceName, String id) throws IOException, ApplicationException {
		String url = serverURL + "/" + namespace + "/" + resourceName + "?id=" + id;
		return sendGetRequest(url, session_id);
	}

	public static String sendGetRequest(String serverURL, String namespace, String session_id, String resourceName, String queryId, String args) throws IOException, ApplicationException {
		String url = serverURL + "/" + namespace + "/" + resourceName + "?queryId=" + queryId
				+ "&args=" + URLEncoder.encode(args, "UTF-8");
		return sendGetRequest(url, session_id);
	}

	// Reads an InputStream and converts it to a String.
	private static String readIt(InputStream stream) throws IOException {
		BufferedReader reader = null;
		reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
		String line;
		StringBuffer response = new StringBuffer();

		while ((line = reader.readLine()) != null) {
			response.append(line);
			response.append('\r');
		}
		//System.out.println("Server Response :: " + response.toString());
		return response.toString();
	}


	// Reverse is in RestUtils.js::_escapePOSTBody()
	private static String escapePOSTBody(String postBody) {
		return postBody.replaceAll("%", "%25").replaceAll("&", "%26").replaceAll("+", "%2B");
	}

	/* public static String sendPostRequestWithFile(String serverURL, String session_id, String params, String filePath) {
        String url = "http://example.com/upload";
        String charset = "UTF-8";
        String param = "value";
        File binaryFile = new File(filePath);
        String boundary = Long.toHexString(System.currentTimeMillis()); // Just generate some unique random value.
        String CRLF = "\r\n"; // Line separator required by multipart/form-data.
        try {
            URLConnection connection = new URL(url).openConnection();
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

            OutputStream output = connection.getOutputStream();
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(output, charset), true);
            // Send normal param.
            writer.append("--" + boundary).append(CRLF);
            writer.append("Content-Disposition: form-data; name=\"param\"").append(CRLF);
            writer.append("Content-Type: text/plain; charset=" + charset).append(CRLF);
            writer.append(CRLF).append(param).append(CRLF).flush();

            // Send binary file.
            writer.append("--" + boundary).append(CRLF);
            writer.append("Content-Disposition: form-data; name=\"binaryFile\"; filename=\"" + binaryFile.getName() + "\"").append(CRLF);
            writer.append("Content-Type: " + URLConnection.guessContentTypeFromName(binaryFile.getName())).append(CRLF);
            writer.append("Content-Transfer-Encoding: binary").append(CRLF);
            writer.append(CRLF).flush();
            Files.copy(binaryFile.toPath(), output);
            output.flush(); // Important before continuing with writer!
            writer.append(CRLF).flush(); // CRLF is important! It indicates end of boundary.
            // End of multipart/form-data.
            writer.append("--" + boundary + "--").append(CRLF).flush();
            // Request is lazily fired whenever you need to obtain information about response.
            int responseCode = ((HttpURLConnection) connection).getResponseCode();
            System.out.println(responseCode);
        } catch (Exception e) {

        }
        return null;
    }
	 */
	public static String sendPostRequest(String serverURL, String session_id, String params) {
		URL url;
		HttpURLConnection connection = null;
		try {
			url = new URL(serverURL);
			System.out.println("URL -> " + serverURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");

			connection.setRequestProperty("Content-Length", "" +
					Integer.toString(params.length()));
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setRequestProperty("Cookie", "session_id=" + session_id);
			//System.out.println("Session id -> " + session_id);
			connection.setReadTimeout(CONNECTION_TIMEOUT);
			connection.setConnectTimeout(CONNECTION_TIMEOUT);
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			//Send request
			DataOutputStream wr = new DataOutputStream(
					connection.getOutputStream());
			wr.writeBytes(params);
			wr.flush();
			wr.close();

			//Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {

			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	public static String sendPostRequest(String serverURL, String session_id, String params, String cookie) {
		URL url;
		HttpURLConnection connection = null;
		StringBuffer response = new StringBuffer();
		try {
			url = new URL(serverURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");

			connection.setRequestProperty("Content-Length", "" +
					Integer.toString(params.length()));
			connection.setRequestProperty("Content-Language", "en-US");
			connection.setRequestProperty("Cookie", "session_id=" + session_id);
			//System.out.println("Session id -> " + session_id);
			connection.setReadTimeout(CONNECTION_TIMEOUT);
			connection.setConnectTimeout(CONNECTION_TIMEOUT);
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			//Send request
			DataOutputStream wr = new DataOutputStream(
					connection.getOutputStream());
			wr.writeBytes(params);
			wr.flush();
			wr.close();

			//Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;

			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();

		} catch (Exception e) {

			e.printStackTrace();
			if (response.toString().isEmpty())
				return null;
			else {
				return response.toString();
			}
		} finally {

			if (connection != null) {
				connection.disconnect();
			}
		}
	}

	public static String sendPostRequest(String serverURL, String _namespace, String session_id,
			String resourceName, String resourceString, String action) {
		String serverUrl = serverURL + "/" + _namespace + "/" + resourceName;
		// System.out.println("REQUEST URL :: " + serverUrl);
		try {
			String encyptedString; //= escapePOSTBody(resourceString);
			encyptedString = resourceString;
			// System.out.println("Data:: " + resourceString);

			//encyptedString = escapePOSTBody(resourceString);
			encyptedString = SecurityUtil.encodeBase64(encyptedString);
			String data = "resource=" + encyptedString;
			if (action != null) {
				data = data + "&action=" + action;
			}
			//System.out.println("URL Actual Data:: " + serverUrl);
			//System.out.println("Actual Data:: " + data);
			return sendPostRequest(serverUrl, session_id, data);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String sendRawJsonPostRequest(String urlstr, String data) {
		URL url;
		HttpURLConnection connection = null;
		try {
			url = new URL(urlstr);
			System.out.println("URL -> " + urlstr);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type",
					"application/json");
			connection.setRequestProperty("Content-Length", "" +
					Integer.toString(data.length()));
			connection.setRequestProperty("Content-Language", "en-US");
			//System.out.println("Session id -> " + session_id);
			connection.setReadTimeout(CONNECTION_TIMEOUT);
			connection.setConnectTimeout(CONNECTION_TIMEOUT);
			connection.setUseCaches(false);
			connection.setDoInput(true);
			connection.setDoOutput(true);

			//Send request
			DataOutputStream wr = new DataOutputStream(
					connection.getOutputStream());
			wr.writeBytes(data);
			wr.flush();
			wr.close();

			//Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is));
			String line;
			StringBuffer response = new StringBuffer();
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();

		} catch (Exception e) {

			e.printStackTrace();
			return null;

		} finally {

			if (connection != null) {
				connection.disconnect();
			}
		}
	}

}
