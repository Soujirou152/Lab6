
import java.io.InterruptedIOException;

/**
 * Starting code for Lab 6-2: ExceptionsLab
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class ExceptionsLab {

    public static String indent = "";
    
    public static String[] stooges = {
        "Larry Fine",
        "Moe Howard",
        "Curly Howard",
        "Shemp Howard",
        "Joe Besser",
        "'Curly' Joe DiRita",
        "Shemp 'Clone'"
    };

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Before call in main() => method1().");
		method1(); // or Demo10_1.method1()
		System.out.println("After return from call in main() => method1().");
	}

	public static void method1() throws InterruptedException
	{
		System.out.println(" Before call to method2() from within method1().");
		 //method2(); // or Lab5.method2();
		//method3();
		 //method4();
		 //method5();
		 method6();
		System.out.println(" After return from call to method2() from within method1().");
	}

	public static void method2() 
	/* throws InterruptedException */ {
		System.out.println("  Before int division in method2().");
		int i = 1 / 1; // ArithmeticException
		System.out.println("  After int division in method2() .");

		System.out.println("  Before array index in method2().");
		System.out.println(stooges[1]); // ArrayIndexOutOfBoundsException
		System.out.println("  After array index in method2().");

		//Thread.sleep(1000);

		 //throw new Exception();
	}

	public static void method3() throws InterruptedException
	{
		try
		{
			System.out.println("   Before int division in method3().");
			int i = 1 /1; // ArithmeticException
			System.out.println("   After int division in method3().");

			System.out.println("   Before array index in method3().");
			System.out.println(stooges[47]); // ArrayIndexOutOfBoundsException
			System.out.println("   After array index in method3().");

			
			//throw new RuntimeException();
		}
		catch (ArrayIndexOutOfBoundsException aie)
		{
			System.out.println(aie);
			aie.printStackTrace();
		}
		catch (ArithmeticException ae)
		{
			System.out.println("   ArithmeticException in method3(): " + ae.toString());
			System.out.println("   Continuing...");
		}

		System.out.println("   Before method3() sleep().");
		Thread.sleep(1000); // InterruptedException
		System.out.println("   After method3() sleep().");
	}

	public static void method4() throws InterruptedException
	{
		try
		{
			System.out.println("    Before method4() int division.");
			int i = 1 / 1; // ArithmeticException
			System.out.println("    After method4() int division.");

			System.out.println("    Before method4() array index.");
			System.out.println(stooges[47]); // ArrayIndexOutOfBoundsException
			System.out.println("    After method4() array index.");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("    ArithmeticException in method4(): " + ae.toString());
			System.out.println("    Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("    ArrayIndexOutOfBoundsException in method4(): " + aioobe);

			System.out.println("    Returning to caller...");

			return;
		}

		System.out.println("    Before method4() sleep().");
		Thread.sleep(1000); // InterruptedException
		System.out.println("    After method4() sleep().");
	}

	public static void method5() throws InterruptedException
	{
		try
		{
			System.out.println("     Before method5() int division.");
			int i = 1 / 1; // ArithmeticException
			System.out.println("     After method5() int division.");

			System.out.println("     Before method5() array index.");
			System.out.println(stooges[1]); // ArrayIndexOutOfBoundsException
			System.out.println("     After method5() array index.");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("     ArithmeticException in method5(): " + ae.toString());
			System.out.println("     Continuing...");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("     ArrayIndexOutOfBoundsException in method5(): " + aioobe);



			System.out.println("     Returning to caller...");

			return;
		}

		System.out.println("     Before method5() sleep().");
		Thread.sleep(1000); // InterruptedException
		System.out.println("     After method5() sleep().");
	}

	public static void method6() throws InterruptedException
	{
		try
		{
			System.out.println("      Before method6() int division.");
			int i = 1 /0; // ArithmeticException
			System.out.println("      After method6() int division.");

			System.out.println("      Before method6() array index.");
			System.out.println(stooges[-1]); // ArrayIndexOutOfBoundsException
			System.out.println("      After method6() array index.");
			
//			throw new ArithmeticException("Exception handlers can throw exceptions!");
			
		}
		catch (ArithmeticException ae)
		{
			System.out.println("      ArithmeticException in method6(): " + ae.toString());
			System.out.println("      Continuing...");
			throw new RuntimeException("Exception handlers can throw exceptions!");
		}
		catch (ArrayIndexOutOfBoundsException aioobe)
		{
			System.out.println("      ArrayIndexOutOfBoundsException in method5(): " + aioobe);

			System.out.println("      Returning to caller...");

			return;
		}
		finally
		{
			System.out.println("      finally block inside method6()...");
		}

		System.out.println("      Before method6() sleep().");
		Thread.sleep(1000); // InterruptedException
		System.out.println("      After method6() sleep().");
	}
}

