/** Selectable.java
  * Lab03
  * @Author : Burak Erdem Varol
  * @Date : 22.03.2017
  * Selectable interface has methods but these methods implemented classes.
  */
public interface Selectable {
	public boolean getSelected();
	public void setSelected(Boolean a);
	public Shape contains(int x, int y);
}
