// Java code to show the
// overriding of finalize() method

import java.lang.*;

// Defining a class demo since every java class
// is a subclass of predefined Object class
// Therefore demo is a subclass of Object class
public class App {

	protected void finalize() throws Throwable
	{
		try {

			System.out.println("inside demo's finalize()");
		}
		catch (Throwable e) {

			throw e;
		}
		finally {

			System.out.println("Calling finalize method"
							+ " of the Object class");

			// Calling finalize() of Object class
			super.finalize();
		}
	}

	// Driver code
	public static void main(String[] args) throws Throwable
	{

		// Creating demo's object
		App d = new App();

		// Calling finalize of demo
		d.finalize();
	}
}