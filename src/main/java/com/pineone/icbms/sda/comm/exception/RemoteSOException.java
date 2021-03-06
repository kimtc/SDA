package com.pineone.icbms.sda.comm.exception;

import org.springframework.http.HttpStatus;

public class RemoteSOException extends Exception {
	final static long serialVersionUID = 3L;
	private HttpStatus httpStatus;
	private String msg;
	  
    public RemoteSOException(HttpStatus httpStatus, String msg) {
    	this.httpStatus = httpStatus;
    	this.msg = msg;
    }

    public RemoteSOException(HttpStatus httpStatus) {
    	this.httpStatus = httpStatus;
    }

    public String getMsg() {
 	   if(msg == null || msg.equals("")) {
		   return httpStatus.getReasonPhrase();		   
	   } else {
		   return msg;
	   }
    }
   
   public int getCode() {
      return httpStatus.value();
   }
  
 }
 