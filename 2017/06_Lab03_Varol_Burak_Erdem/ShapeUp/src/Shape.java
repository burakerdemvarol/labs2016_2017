/** Shape.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * Shapes is abstract class and implements Locatable interface, locations.
  */
public abstract class Shape implements Locatable {
	int x, y;
	
	/**
	 * @return double
	 */
	public abstract double getArea();
	
	/* (non-Javadoc)
	 * @see Locatable#getY()
	 */
	public int getY() {
		return y;
	}

	/* (non-Javadoc)
	 * @see Locatable#setLocation(int, int)
	 */
	@Override
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/* (non-Javadoc)
	 * @see Locatable#getX()
	 */
	@Override
	public int getX() {
		return x;
	}

}