package com.behaviour;

import static org.junit.Assert.*;

import org.junit.Test;

import mockit.Expectations;
import mockit.NonStrictExpectations;

public class BankTest {

	 Bank bank = new Bank();
	 @Test
	 public void testRetrieveAccountHolderName() {
		 new Expectations() {
			 
			   DBManager dbManager; // variables declared here are mocked by default
			 
			   {
			    dbManager.retrieveAccountHolderName(anyInt);
			    returns("Abhi");
			   }
			  };
		   
		

	  String name = bank.processAccount(10);
	  assertEquals("Account holder Name for A/C id 10 is 'Abhi' ","Abhi",name);
	 }
}
