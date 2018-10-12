
public class overloading 
{

	public static void main(String[] args) 
	{
		overloading obj=new overloading();
		obj.message();
		
		obj.message("Pass");
		
	}
	
	public void message()
	{
		System.out.println("Success");
	}

	public void message(String str)
	{
		System.out.println(str);
	}
}
