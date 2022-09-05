package ar.edu.unq.po2.tp3;

public class Punto {
	
	private float x;
	private float y;
	
	public Punto(float x, float y) {
		setXY(x, y);
	}
	
	public void setXY(float x, float y) {
		setX(x);
		setY(y);
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setX(float x) {
		this.x = x; 
	}
	
	public void setY(float y) {
		this.y= y;
	}
}
