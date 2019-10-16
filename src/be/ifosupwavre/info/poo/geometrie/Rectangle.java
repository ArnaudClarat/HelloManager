package be.ifosupwavre.info.poo.geometrie;


public class Rectangle {
	private float width;
	private float length;
	private String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public float getArea(){
		return width*length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float height) {
		this.length = height;
	}
}
