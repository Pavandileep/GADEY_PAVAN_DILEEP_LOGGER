package ConstructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StandardMaterial extends Materials
{
	public static Logger LOGGER = LogManager.getLogger(StandardMaterial.class);
	public float totalConstructionCost(float area_of_house) 
	{
		LOGGER.debug("Calculating total cost for StandardMaterial");
		
		float total_cost=0;
		float cost_per_square_feet=1200;
		
		total_cost=area_of_house*cost_per_square_feet;
		
		return total_cost;
	}	
}
