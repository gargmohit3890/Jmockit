package com.mohit.jmockit.unitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mohit.jmockit.Person;

import mockit.Mock;
import mockit.MockUp;

public class PersonTestConstructor {
	
	@Test
	 public void testGetName() {
	  new MockUp<Person>() {
	   @Mock
	   public void $init() {
	     String name = "mohit";
	   }
	 
	  };
	   
	  Person p = new Person();
	  String name = p.getName();
	   
	  assertNull("Name of person is null",name);
	 }

}
