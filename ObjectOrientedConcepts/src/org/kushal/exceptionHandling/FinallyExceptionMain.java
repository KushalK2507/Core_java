package org.kushal.exceptionHandling;

public class FinallyExceptionMain {

	public static void main(String args[]) {
		int x = 10;
		try {
			System.out.println("Division " + x / 0);
		}

		// catch statement cannot be placed after the finally block.
		// We can use multiple catch with finally block
		catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Runtime Exception");
		}
		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Exception");
		}
		// finally gets executed everytime, even there is exception or not
		finally {
			System.out.println("This will be printed");
		}
	}

}
