/** Rectangle.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * Rectangle objects creates in class.
  */
public class Rectangle extends Shape implements Selectable {
	int width, height;
	boolean selected;

	/**
	 * @param width
	 * @param height
	 */
	public Rectangle(int width, int height) {
		selected = false;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 */
	public Rectangle(int width, int height, int x, int y) {
		selected = false;
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see Shape#getArea()
	 */
	public double getArea() {
		return width * height;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Rectangle: " + "Width = " + width + " Height = " + height + " Total Area = " + getArea()
				+ " Location of Rectangle(x,y): " + "(" + x + ", " + y + ")" + " Selected: " + this.selected;
	}

	/* (non-Javadoc)
	 * @see Selectable#getSelected()
	 */
	@Override
	public boolean getSelected() {
		return this.selected;
	}

	/* (non-Javadoc)
	 * @see Selectable#setSelected(java.lang.Boolean)
	 */
	@Override
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	/* (non-Javadoc)
	 * @see Selectable#contains(int, int)
	 */
	public Shape contains(int x, int y) {

		int firstControl = Math.abs(x - this.getX());
		int secondControl = Math.abs(y - this.getY());

		if ((((double) firstControl) <= ((double) this.width / 2.0))
				&& (((double) secondControl) <= ((double) this.height / 2.0))) {
			return this;
		} else {
			return null;
		}
	}
	// public Shape contains(int x, int y) {
	// if(x >= getX() && x <= getX() + this.width && y >= getY() && y <= getY()
	// + this.height){
	// this.setSelected(true);
	// return this;
	// }
	// return null;
	// }
}
