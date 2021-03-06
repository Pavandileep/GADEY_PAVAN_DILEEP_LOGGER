package Interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ConstructionCost.AboveStandardMaterial;

public class InterestCalculation 
{
	public static Logger LOGGER = LogManager.getLogger(AboveStandardMaterial.class);
	
	public float simpleInterest(float principal_amount, float rate_of_interest, int time_period) 
	{
		LOGGER.debug("Calculating Simple Interest for the given data");
		
		float total_amount=0.0f;
		float interest_amount=(principal_amount*rate_of_interest*time_period)/100;
		total_amount=interest_amount+principal_amount;
		
		return total_amount;
	}
	
	public float compoundInterest(float principal_amount, float rate_of_interest,int number_of_times_compounded, int time_period)
	{
		LOGGER.debug("Calculating Compound Interest for the given data");
		
		float interest_amount=0.0f;
		float total_amount=0.0f;
		interest_amount=(float) (principal_amount*(Math.pow(1+((rate_of_interest/100)/number_of_times_compounded), number_of_times_compounded*time_period)));
		total_amount=interest_amount+principal_amount;
		
		return total_amount;
	}

}
