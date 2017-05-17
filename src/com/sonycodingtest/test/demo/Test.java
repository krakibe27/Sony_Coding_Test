package com.sonycodingtest.test.demo;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
public class Test {


	String message = "Robert";	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
	   @org.junit.Test
	   public void testPrintMessage() {	
	      System.out.println("Inside testPrintMessage()");     
	      messageUtil.printMessage();     
	   }

	   @org.junit.Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }
	
}
