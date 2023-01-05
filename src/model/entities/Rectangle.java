package model.entities;

public class Rectangle implements Shape {

	private double height;
	private double widht;

	public Rectangle(double height, double widht) {
		this.height = height;
		this.widht = widht;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidht() {
		return widht;
	}

	public void setWidht(double widht) {
		this.widht = widht;
	}

	@Override
	public double area() {
		return height * widht;
	}

}
