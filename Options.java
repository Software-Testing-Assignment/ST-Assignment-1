package softwaretestinga1;
import java.util.*;

class MyException extends Exception
{
    String r;
	MyException(String r)
	{
		this.r=r;
	}
	public String toString()
	{
		return (r);
	}
}
public class Options {
    public static void main(String [] args)
	{
		try
		{
                    String r1,l1;

                    Scanner input=new Scanner(System.in);
                    System.out.println();
                    System.out.println("Option for Console is :");
                    System.out.println("1.PS4");
                    System.out.println("2.XBOX");
                    System.out.println("");
                    System.out.println("Option for Games is :");
                    System.out.println();
                    System.out.println("1.COD PS4");
                    System.out.println("2.COD XBOX");
                    System.out.println("");

                    System.out.println("Enter Your Console:");
                    r1=input.nextLine();

                    System.out.println("Enter Your Games:");
                    l1=input.nextLine();

                    if(r1.equals("PS4") && l1.equals("COD XBOX"))
                    {
                            throw new MyException("PS4 is not compatible with COD XBOX.");
                    }
                    else if(r1.equals("XBOX") && l1.equals("COD PS4"))
                    {
                            throw new MyException("XBOX is not compatible with COD PS4.");
                    }
                    else if(r1.equals("PS4") && l1.equals("COD PS4"))
                    {
                            throw new MyException("PS4 is compatible with COD PS4.");
                    }
                    else if(r1.equals("XBOX") && l1.equals("COD XBOX"))
                    {
                            throw new MyException("XBOX is compatible with COD XBOX.");
                    }
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
