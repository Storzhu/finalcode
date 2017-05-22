package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		double dInterestRate = 0;
		for (RateDomainModel r : rates) {
			if (GivenCreditScore > r.getiMinCreditScore()) {
				dInterestRate = r.getdInterestRate();
				}
			if (dInterestRate <= 0) {
				throw new RateException(rates.get(GivenCreditScore));
			}
		}

		
		return dInterestRate;
		
		
	}
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
