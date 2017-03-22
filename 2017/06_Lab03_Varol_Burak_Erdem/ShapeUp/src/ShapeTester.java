/** ShapeTester.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * ShapeTester class testing other classes methods, menu part.
  */
import java.util.Scanner;

public class ShapeTester {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice, option;
		int x, y, height, width, radius = 0, side;
		ShapeContainer container = null;

		do {
			System.out.println("1. Create a empty ShapeList");
			System.out.println("2. Add a new shape");
			System.out.println("3. Compute total of all shapes area");
			System.out.println("4. Print Shapes");
			System.out.println("5. Contains or not (x,y)");
			System.out.println("6. Remove all selected");
			System.out.println("0. Close Program");
			choice = scan.nextInt();

			if (choice == 1) {
				container = new ShapeContainer();
				System.out.println("ShapeContainer Created Joker!!" + "\n");
			}

			if (choice == 2) {
				do {
					System.out.println("1. Add Rectangle");
					System.out.println("2. Add Circle");
					System.out.println("3. Add Square");
					System.out.println("0. Back to main menu");
					option = scan.nextInt();

					if (option == 1) {
						System.out.println("Please give rectangle height: ");
						height = scan.nextInt();
						System.out.println("Please give rectangle width: ");
						width = scan.nextInt();
						System.out.println("Please give x coordinate: ");
						x = scan.nextInt();
						System.out.println("Please give y coordinate: ");
						y = scan.nextInt();
						Rectangle rectangle = new Rectangle(width, height);
						rectangle.setLocation(x, y);
						container.add(rectangle);
						System.out.println("Rectangle Created Joker!! \n");
					}

					if (option == 2) {
						System.out.println("Please give Circle radius: ");
						radius = scan.nextInt();
						System.out.println("Please give x coordinate: ");
						x = scan.nextInt();
						System.out.println("Please give y coordinate: ");
						y = scan.nextInt();
						Circle circle = new Circle(radius);
						circle.setLocation(x, y);
						container.add(circle);
						System.out.println("Circle Created Joker!! \n");
					}

					if (option == 3) {
						System.out.println("Please give Square side: ");
						side = scan.nextInt();
						System.out.println("Please give x coordinate: ");
						x = scan.nextInt();
						System.out.println("Please give y coordinate: ");
						y = scan.nextInt();
						Square square = new Square(side);
						square.setLocation(x, y);
						container.add(square);
						System.out.println("Square Created Joker!! \n");
					}
				} while (option != 0);
			}

			if (choice == 3) {
				System.out.println("Computed All Area = " + container.getArea() + "\n");
			}

			if (choice == 4) {
				System.out.println(container.toString());
			}

			if (choice == 5) {
				System.out.println("Please give x coordinate: ");
				x = scan.nextInt();
				System.out.println("Please give y coordinate: ");
				y = scan.nextInt();
				for (int j = 0; j < container.shapeContainer.size(); j++) {
					System.out.println(((Selectable)(container.shapeContainer.get(j))).contains(x, y));
				}
			}
			
			if (choice == 6){
				for (int i = 0; i < container.shapeContainer.size(); i++) {
					if(((Selectable)(container.shapeContainer.get(i))).getSelected() == true){
						container.shapeContainer.remove(i--);
					}
				}
			}
		} while (choice != 0);
		scan.close();
	}
}