
/**
 * Fundamentals in balancing chemical reaction is that you must have 
 * the same number of elements on the reactants side as the product
 * @author Adish
 *
 */

public class Chemical_Reaction extends Chemistry
{
	
	class Normal_Reaction
	{
		Object reactants;
		Object products;
		
		public String PerformReaction()
		{
			return "";
		}
	}
	
	class Redox_Reaction
	{
		Object reactants;
		Object products;
		int charge;
		
		int oxidation_Number;
		public String PerformReaction()
		{
			return "";
		}

	}
	
	class Acid_Base_Reaction
	{
		Object reactants;
		Object products;
		
		public String PerformReaction()
		{
			return "";
		}

	}
	
	
	/**
	 * identifies what object are we trying to createyo
	 */
	public void Identify_Reaction_Type()
	{
		
	}

}