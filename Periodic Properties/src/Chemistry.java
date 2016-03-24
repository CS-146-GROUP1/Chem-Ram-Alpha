import java.util.ArrayList;

public class Chemistry 
{
	private ArrayList<String> known_Chemical_Names;
	private ArrayList<String> polyAtomicIOns;

	public void add_To_PolyatomicIons(String name)
	{
		polyAtomicIOns.add(name);
	}

	public void add_To_Chemical_Names(String name)
	{
		known_Chemical_Names.add(name);
	}


}