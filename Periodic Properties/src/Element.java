import java.util.Comparator;
import java.util.Stack;

public class Element extends Periodic_Table implements Comparator<Element> 
	{
		String name; // long form of the name of an element
		String chemical_Symbol; // chemical symbol of atomic element
		
		int atomic_Number; // number of protons in atom
		Stack<String> known_Isotopes;
		double atomic_Mass;
	
		// LinkedList like implementation
		Element previous_Element;
		Element next_Element;
		
		/**
		 * default constructor
		 */
		public Element()
		{
			name = "Unknown";
			chemical_Symbol = "";
			atomic_Number = 0;
			atomic_Mass = 0.0;
			known_Isotopes = new  Stack<String>(); // add the isotopes in this stack
			previous_Element = null; // in default constructor
			next_Element = null; // in default constructor			
		}
		
		
		
		public Element(String ele_name, String symbol, int number, float mass, Element next, Element previous)
		{
			name = ele_name;
			chemical_Symbol = symbol;
			atomic_Number = number;
			atomic_Mass = mass;
			known_Isotopes = new  Stack<String>(); // add the isotopes in this stack
			next_Element = next;
			previous_Element = previous;
		}
			
		/** @return name            **/
		String get_Name()
		{
			return name;
		}
		
		
		/** @return chemical symbol **/
		String get_Chemical_Symbol()
		{
			return chemical_Symbol;
		}
		
		/** @return atomic number   **/		
		int get_Atomic_Number()
		{
			return atomic_Number;
		}
		
		/** @return atomic mass **/
		double get_Atomic_Mass()
		{
			return atomic_Mass;
		}
		
		
		/**
		 * Sorts the stack when we add in the isotopes
		 * @param s
		 */
		void sortStack(Stack<String> s)
		{
			if(!known_Isotopes.isEmpty())
			{
				String temp = s.pop();
				sortStack(s);
				sortedInsert(temp);
			}
		}

		/**
		 * Helper method for when we insert isotopes of an element into the Stack 
		 * @param element_Isotope: the element isotope that you are looking at
		 * @param isotope_Number: the number as extracted by the element name
		 */
		void sortedInsert(String element_Isotope)
		{
			int isotope_Number = find_IsotopeNumber(element_Isotope);
			if (known_Isotopes.isEmpty() || element_Isotope.compareTo(known_Isotopes.pop()) > 0)
			{
				known_Isotopes.push(element_Isotope);
			}
			else
			{
				String temp = known_Isotopes.pop();
				sortedInsert(element_Isotope);
				known_Isotopes.push(element_Isotope);
			}
		}		
		
		/**
		 * Finds the isotope of an element in the name of the isotope such as Carbon-12, or URANIUM-238
		 * @param element_Isotope
		 * @return the number of the isotope
		 */
		private int find_IsotopeNumber(String element_Isotope) 
		{
			String truncated_Name = element_Isotope.substring(element_Isotope.indexOf('-') + 1);
			System.out.println("in method Result: " + truncated_Name);
			int result = Integer.parseInt(truncated_Name);
			return result;
		}

		
		@Override
		/**
		 * Overrides the comparator interface compare method to accept the ELement type. The comparisions will be made based on the   
		 */
		public int compare(Element e1, Element e2)
		{
			if (e1.atomic_Number > e2.atomic_Number)
			{
				return 1;
			}
			else if (e1.atomic_Number < e2.atomic_Number)
			{
				return -1;
			}
			else
				return 0;
		}
		
		
		
		public String toString()
		{
			return chemical_Symbol + "\n"
					+ "Element name: " + name + "\n"
					+ "Atomic number: " + atomic_Number
					+ "Atomic mass: " + atomic_Mass + "\n"
					+ "Known isotopes: " +  known_Isotopes.toString();
			
		}
}