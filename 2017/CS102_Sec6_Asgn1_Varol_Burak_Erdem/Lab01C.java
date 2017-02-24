
/*******************************************************
  /*  CS102 Lab1 - Burak Erdem Varol - (2017/02/19)  Description: C Part  *
  /*******************************************************/
import java.util.*;

public class Lab01C {

	public static void main(String[] args) {

		IntBag room = new IntBag();// room object of an IntBag class
		int option = 0;
		IntBag location = new IntBag();
		int numb = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Options: ");// options
		System.out.println(
				"1. Create a new empty collection with a specified maximum capacity (any previous values are lost!)");
		System.out.println(
				"2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.) ");
		System.out.println("3. Print the collection of values ");
		System.out.println("4. Add a value to the collection of values at a specified location ");
		System.out.println("5. Remove the value at a specified location from the collection of values ");
		System.out.println("6. Read a single test value ");
		System.out.println("7. Compute the set of locations of the test value within the collection");
		System.out.println("8. Print the set of locations");
		System.out.println("9. Quit the program ");

		while (option != 9) // quits

		{
			System.out.println();
			System.out.print("Now, Choose one of menu option between 1-9 : ");
			option = scan.nextInt();
			System.out.println();

			if (option < 1 || option > 9)// checks appropriate options
			{
				System.out.print("Please, Enter a choice between 1-9 : ");
				option = scan.nextInt();
			}
			// Choices of the menu.
			if (option == 1)// new array is declared
			{
				room = new IntBag();
				System.out.println("New Array has initialized. ");
			}

			else {

				if (option == 2)// adding values
				{
					System.out.println(
							"Enter the set of positive values (use zero to indicate all the values have been entered): ");

					int val;
					val = scan.nextInt();

					while (val != 0) {
						if (val < 0) {
							System.out.println("Invalid Input");

						} else {
							room.add(val);
						}
						val = scan.nextInt();

					}
				}

				else if (option == 3)// demonstrates collections of an array
				{
					System.out.println("Values of an array: " + room.toString());
				}

				else if (option == 4)// values are added to spesific index
				{
					int val;
					int index;
					System.out.print("Enter a value : ");
					val = scan.nextInt();
					System.out.print("Enter an index: ");
					index = scan.nextInt();
					room.add2(val, index);
				}

				else if (option == 5)// removes a given value
				{
					System.out.print("Enter the index that will be removed: ");
					room.remove(scan.nextInt());
				} else if (option == 6) {
					System.out.println("Please give number: ");
					numb = scan.nextInt();
					System.out.println(room.findAll(numb));
				} else if (option == 7) {
					location = room.findAll(numb);
					System.out.println("Computed Location");
				} else if (option == 8) {
					System.out.println(location.toString());
				}
			}
		}
		System.out.println("GoodBye Joker!!! ");
		scan.close();
	}
}
