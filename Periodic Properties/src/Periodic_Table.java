import java.util.Comparator;
import java.util.Stack;
import java.util.ArrayList;

/**
 * @author Adish betawar
 *
 */
public class Periodic_Table extends Chemistry
{
	// global required but still in thought
	int GROUP = 0; // vertical column
	int PERIOD = 0; // horizontal row
	
	//Specific GROUP or PERIOD names
	/**
	 * Will be either in arrays or arrayLists
	 * This is an option if we want to add things into the list
	 */
//	ArrayList<Element> Alkali_metals;
//	ArrayList<Element> Alkaline_metals;
//	ArrayList<Element> Transition_metals;
//	ArrayList<Element> Halogens;
//	ArrayList<Element> Noble_gases;

	// radioactive elements
	ArrayList<Element> Lanthanides;
	ArrayList<Element> Actinides;	
	
	/**
	 * These are the lists of known elements names
	 * 
	 * e.g) 
	 * 		water = H2O
	 * 		Carbon dioxide = C02
	 * 		Nitric acid = HNO2
	 */
	// implement sort by atomic number
	// when you sort, you sort one group and group them into 
	
	/**
	 * Periodic table has been documented and will be put into action for the other portions of the project
	 */
	

	// OPTIONAL CODE \\
	public Element get_Element_From_Group(int group_Number)
	{
		// goes into group and extracts element
		return null;
	}
	
	public Element get_Element_From_Period(int period_Number)
	{
		// goes into period and extracts element
		return null;
	}


	// OPTIONAL CODE \\
	/**
	 * Stores a new elements into the periodic table
	 * This is a paid feature
	 */
	public void Insert_New_Element()
	{
		Element newElement = new Element();
		newElement.name = null;
		newElement.atomic_Mass = 0.0; // user inputs number
		// add to table
	}
		
}