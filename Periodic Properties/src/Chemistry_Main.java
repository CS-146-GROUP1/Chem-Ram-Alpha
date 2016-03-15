import java.util.Scanner;
/**
 * This class is made to test for chemical reactions, other chemical properties, etc.
 * @author Adish
 *
 */
public class Chemistry_Main 
{

	public static void main(String[] args) 
	{
//		Scanner in = new Scanner(System.in);
//		PresentMenu(in);
//		in.close();
		
		Element sample = new Element("sample", "Sa", 34, (float) 43.25, null, null);
		System.out.println(sample);
	}

	/**
	 * Presents a scanner that will determine the number or string element
	 * @param in
	 */
	public static void PresentMenu(Scanner in)
	{
		System.out.print("1. ADD ELEMENT");		
		System.out.print("2. VIEW PERIODIC TABLE");
		System.out.print("3. BALENCE REACTION");
		System.out.print("4. CALCULATE ATOMIC MASS");
		int menu_Option = in.nextInt();
	}
}