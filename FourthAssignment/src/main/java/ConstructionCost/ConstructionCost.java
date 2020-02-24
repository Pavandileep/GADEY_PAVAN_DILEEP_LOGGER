package ConstructionCost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost 
{
	public static Logger LOGGER = LogManager.getLogger(AboveStandardMaterial.class);
	
	float totalCost(float area_of_house,String materialType)
	{
		float estimatedCost=0.0f;
		float cost_per_area=0.0f;
		Materials material = null;
		
		if(materialType.equals("StandardMaterial"))
		{
			material=new StandardMaterial();
			LOGGER.info("Creating Memory for StandardMaterial");
		}
		else if(materialType.equals("AboveStandardMaterial"))
		{
			material=new AboveStandardMaterial();
			LOGGER.info("Creating Memory for AboveStandardMaterial");
		}
		else if(materialType.equals("HighStandardMaterial"))
		{
			material=new HighStandardMaterial();
			LOGGER.info("Creating Memory for HighStandardMaterial");
		}
		else if(materialType.equals("FullyAutomated"))
		{
			material=new FullyAutomated();
			LOGGER.info("Creating Memory for FullyAutomated");			
		}
		
		estimatedCost=material.totalConstructionCost(area_of_house);
		
		return estimatedCost;
	}

}
