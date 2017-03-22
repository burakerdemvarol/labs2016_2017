/** Circle.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * Circle class creates circle objects, it implements Selectable.
  */
public class Circle extends Shape implements Selectable {
	int radius;
	boolean selected;
	
	/**
	 * @param radius
	 */
	public Circle(int radius){
		this.radius = radius;
		selected = false;
	}
	
	/* (non-Javadoc)
	 * @see Shape#getArea()
	 */
	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return "Circle: " + "Radius = " + radius + " Total Area = " + getArea() +
				" Location of Circle(x,y): " + "(" + x + ", " + y + ")" + " Selected: " + this.selected; 
	}

	/* (non-Javadoc)
	 * @see Selectable#getSelected()
	 */
	@Override
	public boolean getSelected() {
		// TODO Auto-generated method stub
		return this.selected;
	}

	/* (non-Javadoc)
	 * @see Selectable#setSelected(java.lang.Boolean)
	 */
	@Override
	public void setSelected(Boolean a) {
		this.selected = true;
	}

	/* (non-Javadoc)
	 * @see Selectable#contains(int, int)
	 */
	@Override
	public Shape contains(int x, int y) {
		int distance = radius * radius - (getX() - x) * (getX() - x) - (getY() - y) * (getY() - y);
		if(distance >= 0){
			this.selected = true;
			return this;
		}else{
			return null;	
		}
	}
}
