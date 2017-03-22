/** ShapeContainer.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * ShapeContainer saving shapes objects and it compiles all shape in ArrayList.
  */
import java.util.ArrayList;

public class ShapeContainer {
	ArrayList<Shape> shapeContainer = new ArrayList<Shape>();
	
	/**
	 * @param shapes
	 */
	public void add(Shape shapes){
		shapeContainer.add(shapes);
	}
	
	/**
	 * Computes area of shape
	 * @return double
	 */
	public double getArea(){
		double allArea = 0;
		for(int i = 0; i < shapeContainer.size(); i++){
			allArea += shapeContainer.get(i).getArea();
		}
		return allArea;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String toString = "";
		for(int i = 0; i < shapeContainer.size(); i++){
			toString += shapeContainer.get(i).toString() + "\n";
		}
		return toString;
	}
}
