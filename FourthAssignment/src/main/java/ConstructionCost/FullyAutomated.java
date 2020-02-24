package ConstructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FullyAutomated extends Materials 
{
	public static Logger LOGGER = LogManager.getLogger(FullyAutomated.class);
	public float totalConstructionCost(float area_of_house) 
	{
		LOGGER.debug("Calculating total cost for FullyAutomated");
		
		float total_cost=0;
		float cost_per_square_feet=2500;
		
		total_cost=area_of_house*cost_per_square_feet;
		
		return total_cost;
	}	
}
