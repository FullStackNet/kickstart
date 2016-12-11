/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package platform.exception;

public enum ExceptionEnum {
	/*This Error is thrown when client closes the connection
	 */
	PEER_DISCONNECTED
	{
		 public String toString() {
			 return "Peer Disconnected";
		}
	},
	/*This Error is thrown when client socket timeout
	 */
	SOCKET_TIMEOUT
	{
		 public String toString() {
			 return "Socket timeout";
		}
	},
	/*This Error is thrown when bad packet is recieved
	 */
	BAD_PACKET
	{
		 public String toString() {
			 return "Bad Packet received";
		}
	},
	/*
	 */
	INVALID_LOGICAL_OPERATOR
	{
		 public String toString() {
			 return "Invalid Logical Operator [%s]";
		}
	},
	/*
	 */
	INVALID_EXPRESSION
	{
		 public String toString() {
			 return "Invalid Expression [%s]";
		}
	},
	/*
	 */
	INVALID_RELATIONAL_OPERATOR
	{
		 public String toString() {
			 return "Invalid Relational Operator [%s]";
		}
	},
	/*
	 */
	CONNECTION_FAILED
	{
		 public String toString() {
			 return "Connection failed [%s]";
		}
	},
	/*
	 */
	WRITE_FAILED
	{
		 public String toString() {
			 return "Write Failed";
		}
	},
	/*Invalid Session. Session might be expired. Relogin. Keep in sync with M16.Constants.js::INVALID_SESSION
	 */
	INVALID_SESSION
	{
		 public String toString() {
			 return "Invalid Session. Please login again";
		}
	},
	/*This Error is thrown when Resource doesn't Exists. Keep in sync with M16.Constants.js::RESOURCE_NOT_FOUND
	 *Usage : Specify the resource type and resource name
	 */
	RESOURCE_NOT_FOUND
	{
		 public String toString() {
			 return "Resource not found [%s, %s]";
		}
	},
	/*User is trying to login when already a session exists.
	 */
	LOGIN_SESSION_ALREADY_EXISTS
	{
		 public String toString() {
			 return "A session exists already.";
		}
	},
	/*User is trying to query which is not implemented.
	 */
	INVALID_QUERY
	{
		 public String toString() {
			 return "Invalid Query";
		}
	},
	/*User is trying to do something, ehich is not supported
	 */
	NOT_SUPPORTED
	{
		 public String toString() {
			 return "Not Supported";
		}
	},
	/*Not Supported Action
	 */
	INVALID_ACTION
	{
		 public String toString() {
			 return "Invalid Action";
		}
	},
	/*Invalid User
	 */
	INVALID_USER
	{
		 public String toString() {
			 return "Invalid User";
		}
	},
	/*Invalid Request
	 */
	INVALID_REQUEST
	{
		 public String toString() {
			 return "Invalid Request";
		}
	},
	/*Invalid File Type
	 */
	INVALID_FILE_TYPE
	{
		 public String toString() {
			 return "Invalid File Type";
		}
	},
}