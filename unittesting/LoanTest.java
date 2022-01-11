package com.revature.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoanTest {
  Loan l;
	@BeforeEach
	void setUp() throws Exception {
		l=new Loan();
		System.out.println("setup method");
	}

	@AfterEach
	void tearDown() throws Exception {
		l=null;
		System.out.println("tear down method");
	}

	@Test
	void testGetEmi() {
		//fail("Not yet implemented");
		//Loan l=new Loan();
		int emi=l.getEmi(60000);//actual
		int expected=5000; //expected
		assertEquals(expected,emi);
		
		
	}

}
