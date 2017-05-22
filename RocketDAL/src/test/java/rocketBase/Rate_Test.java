package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void test1() throws Exception {
		ArrayList<RateDomainModel> rate = RateDAL.getAllRates();
		System.out.println("Rates size: " + rate.size());
		assert(rate.size()> 0);
				assert(1==0);
	}
}
