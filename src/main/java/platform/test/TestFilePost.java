package platform.test;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.FileEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.util.EntityUtils;


public class TestFilePost {
  public static void main(String[] args) throws Exception {
    HttpClient httpclient = new DefaultHttpClient();
    httpclient.getParams().setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);

    HttpPost httppost = new HttpPost("http://localhost:9002/upload.php");
    File file = new File("c:/TRASH/zaba_1.jpg");

    FileEntity reqEntity = new FileEntity(file, "binary/octet-stream");

    httppost.setEntity(reqEntity);
    reqEntity.setContentType("binary/octet-stream");
    System.out.println("executing request " + httppost.getRequestLine());
    HttpResponse response = httpclient.execute(httppost);
    HttpEntity resEntity = response.getEntity();

    System.out.println(response.getStatusLine());
    if (resEntity != null) {
      System.out.println(EntityUtils.toString(resEntity));
    }
    if (resEntity != null) {
      resEntity.consumeContent();
    }

    httpclient.getConnectionManager().shutdown();
  }
}