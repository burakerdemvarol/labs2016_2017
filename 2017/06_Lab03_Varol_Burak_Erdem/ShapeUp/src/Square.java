/** Square.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * Square class creates square objects and extends Rectangle class, it is subclass under the Rectangle class.
  */
public class Square extends Rectangle {

	public Square(int side){
		super(side, side);
		selected = false;
	}
	
	/* (non-Javadoc)
	 * @see Rectangle#getArea()
	 */
	public double getArea(){
		return super.getArea();
	}
	
	/* (non-Javadoc)
	 * @see Rectangle#toString()
	 */
	public String toString(){
		return "Square: " + "Side length = " + width + " Total Area = " + getArea() + " Location of Square(x,y): " + "(" + x + ", " + y + ")" + " Selected: " + this.selected ; 
	}

}
