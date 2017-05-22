package rocketBase;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import exceptions.RateException;

public class rate_test {
	
	public void RateTest1() throws RateException {
		assertEquals(RateBLL.getRate(300),3.0,0.001);
	}
	
	@Test 
	public void RateTest2() throws RateException {
		RateBLL.getRate(400);
	}
	
	@Test
	public void GetPaymentTest() throws RateException{
		double pmt= RateBLL.getPayment(0.04/12,360,300000,0, false);
		
		assertEquals(-1432.25,pmt,0.01);
		}
}
