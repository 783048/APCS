package forLoops;

public class BoxWord {
	public static void box(String in)
	{
		int len = in.length();
		for(int i = 1; i <= in.length(); i++)
		{
			System.out.println(in);
		}
		System.out.println("\nTiling Word!\n");
		for(in.length(); len >= 0 ;len--)
		{
			System.out.println(in.substring(0, len));
		}
	}

}
