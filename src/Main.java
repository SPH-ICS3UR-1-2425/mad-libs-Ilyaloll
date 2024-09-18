import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*
		 * MadLibs Program
		 * Author: Elijah
		 * Class: ICS3U
		 * Date: Sept. 16, 2024
		 * Make a program that asks for 10 inputs
		 * reads them into variables, and then prints out a story
		 * Make sure to include Strings, ints, and doubles!
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Mad Libs!");
		System.out.println("What's your name?");
		String name = in.nextLine();
		System.out.println ("Give me a verb ending in ing");
		String verb = in.nextLine();
		System.out.println("Give me a place");
		String place = in.nextLine();
		System.out.println("Give me a number");
		int num1 = in.nextInt();
		in.nextLine();
		System.out.println("Give me a meal");
		String meal = in.nextLine();
		System.out.println("Create a name for a resturant");
		String resturant = in.nextLine();
		System.out.println("Give me a price for the food");
		double price = in.nextDouble();
		in.nextLine();
		System.out.println("Give me a name of a dude");
		String dude = in.nextLine();
		System.out.println("Give me a name of a film");
		String film = in.nextLine();
		System.out.println("Give me a flavour of popcorn");
		String flavour = in.nextLine();
		System.out.println("Give me a topic");
		String topic = in.nextLine();
		System.out.println("Give me a mode of transport");
		String transport = in.nextLine();             
	
		System.out.println("Yesterday, "+name+" went "+verb+" in "+place+". He did said task for "+num1+" hours, so he ate "+meal+" at the famous "+resturant+". He spent "+price+" and walked to the theater. He met a dude named "+dude+" and instantly became best friends. They watched "+film+" and ate "+flavour+" popcorn. After leaving theater, they talked about "+topic+" while drivng a "+transport+". They drove happily every after");
	}

}
