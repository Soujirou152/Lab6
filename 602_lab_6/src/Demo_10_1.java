
/**
 * Write a description of class Demo_10_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demo_10_1
{
    public static String[] stooges = { "Larry Fine",
                                        "Moe Howard",
                                        "Curly Howard",
                                        "Shemp Howard",
                                        "Joe Besser",
                                        "'Curly' Joe DiRita",
                                        "Shemp 'Clone'" };

    public static void main (String[] args) throws InterruptedException
    {
		  System.out.println ("Before main() call to method1().");
		  method1(); // or Demo10_1.method1()
          System.out.println ("After main() call to method1().");
    }

    public static void method1 () throws InterruptedException
    {
        System.out.println ("Before method1() call to method2().");
        //method2(); // or Demo10_1.method2()
        method3();
        // method4();
        // method5();
        // method6();
        System.out.println ("After method1() call to method2().");
    }

    public static void method2 ()
    {
        System.out.println ("Before method2() int division.");
        int i = 1 / 1; // ArithmeticException
        System.out.println ("After method2() int division.");

        System.out.println ("Before method2() int division.");
        System.out.println (stooges[47]); // ArrayIndexOutOfBoundsException
        System.out.println ("After method2() int division.");

        //System.out.println ("Before method2() int division.");
        //Thread.sleep(1000); // InterruptedException
        //System.out.println ("Before method2() int division.");

    }

   public static void method3 () throws InterruptedException
    {
        try
        {
            System.out.println ("Before method3() int division.");
            int i = 1 / 1; // ArithmeticException
            System.out.println ("After method3() int division.");

            System.out.println ("Before method3() stooge indexing.");
            System.out.println (stooges[4]); // ArrayIndexOutOfBoundsException
            System.out.println ("After method3() stooge indexing.");

            //throw new RuntimeException();
        }
        catch (ArithmeticException ae)
        {
            System.out.println ("ArithmeticException in method3(): " + ae.toString());
            System.out.println ("Continuing...");
        }
        catch (ArrayIndexOutOfBoundsException aie)
        {
			System.out.println (aie);
			aie.printStackTrace();
		}

        System.out.println ("Before method3() sleep.");
        Thread.sleep(1000); // InterruptedException
        System.out.println ("After method3() sleep.");

    }

   public static void method4 ()
    {
        try
        {
            System.out.println ("Before method4() int division.");
            int i = 1 / 0; // ArithmeticException
            System.out.println ("Before method4() int division.");

            System.out.println ("Before method4() int division.");
            System.out.println (stooges[47]); // ArrayIndexOutOfBoundsException
            System.out.println ("Before method4() int division.");
        }
        catch (ArithmeticException ae)
        {
            System.out.println ("ArithmeticException in method4(): " + ae.toString());
            System.out.println ("Continuing...");
        }
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
            System.out.println ("ArrayIndexOutOfBoundsException in method4(): " +
                                aioobe);

            System.out.println ("Returning to caller...");

            return;
        }

        //System.out.println ("Before method4() int division.");
        //Thread.sleep(1000); // InterruptedException
        //System.out.println ("Before method4() int division.");

    }

    public static void method5 () throws InterruptedException
    {
        try
        {
            System.out.println ("Before method5() int division.");
            int i = 1 / 0; // ArithmeticException
            System.out.println ("Before method5() int division.");

            System.out.println ("Before method5() int division.");
            System.out.println (stooges[47]); // ArrayIndexOutOfBoundsException
            System.out.println ("Before method5() int division.");
        }
        catch (ArithmeticException ae)
        {
            System.out.println ("ArithmeticException in method5(): " + ae.toString());
            System.out.println ("Continuing...");
        }
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
            System.out.println ("ArrayIndexOutOfBoundsException in method5(): " +
                                aioobe);

            System.out.println ("Returning to caller...");

            return;
        }

        System.out.println ("Before method5() int division.");
        Thread.sleep(1000); // InterruptedException
        System.out.println ("Before method5() int division.");

    }

   public static void method6 () throws InterruptedException
    {
        try
        {
            System.out.println ("Before method6() int division.");
            int i = 1 / 0; // ArithmeticException
            System.out.println ("Before method6() int division.");

            System.out.println ("Before method6() int division.");
            System.out.println (stooges[47]); // ArrayIndexOutOfBoundsException
            System.out.println ("Before method6() int division.");
        }
        catch (ArithmeticException ae)
        {
            System.out.println ("ArithmeticException in method6(): " + ae.toString());
            System.out.println ("Continuing...");
        }
        catch (ArrayIndexOutOfBoundsException aioobe)
        {
            System.out.println ("ArrayIndexOutOfBoundsException in method5(): " +
                                aioobe);

            System.out.println ("Returning to caller...");

            return;
        }
        finally
        {
            System.out.println ("finally block inside method6()...");
        }

        System.out.println ("Before method6() int division.");
        Thread.sleep(1000); // InterruptedException
        System.out.println ("Before method6() int division.");

    }
}
