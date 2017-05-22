package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	private RateDomainModel ratedomainmodel;

	public RateDomainModel getRate_domain_model() {
		return ratedomainmodel;
	}

	
	public RateException(RateDomainModel rate_domain_model){
		this.ratedomainmodel = ratedomainmodel;
	}
	

}

