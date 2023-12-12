// Java Program to Find IP address of Own Device

// Importing input output class
import java.io.*;
// Importing InetAddress class from java.net package
import java.net.InetAddress;

// Main class
public class IpAddress {

	// Main driver method
	public static void main(String[] args)
	{

		// Try block to check for exceptions
		try {

			// Creating an object of InetAddress class to
			// get the Ip address
			InetAddress myIP = InetAddress.getLocalHost();

			// Display message only
			System.out.println("My IP Address is : ");

			// Print and display the IP address
			System.out.println(myIP.getHostAddress());
		}

		// Catch block to handle the exceptions
		catch (Exception e) {

			// Display message to be printed on console
			// as the exception occurs
			System.out.println("Some Error Occurred");
		}
	}
}

