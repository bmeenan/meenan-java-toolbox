package com.bmeenan.challenge;

/**
 * This class was written while taking an online challenge from hackerrank.com
 * as part of a job interview. The challenge asked to you implement three
 * different implementations of shape (a rectangle, square, and circle), each
 * with specific behavior.
 * 
 * The class is tested by hackerrank.com by comparing your System.out
 * information with expected output!
 */
interface Shape {
	float getArea();

	float getPerimeter();

	String toString();
}

public class ShapeChallenge {

	class Rectangle implements Shape {

		float length;
		float width;
		boolean logOutput;

		public Rectangle(float length, float width) {
			logOutput = true;
			this.length = length;
			this.width = width;
		}

		@Override
		public float getArea() {
			if (logOutput) {
				System.out.println("Finding area of rectangle with length = " + length + " and width = " + width);
			}
			return length * width;
		}

		@Override
		public float getPerimeter() {
			if (logOutput) {
				System.out.println("Finding perimeter of rectangle with length = " + length + " and width = " + width);
			}
			return 2 * (length + width);
		}

		@Override
		public String toString() {
			logOutput = false;
			String rtn = "Rectangle = [length: " + length + ", width: " + width + ", area: " + getArea()
					+ ", perimeter: " + getPerimeter() + "]";
			logOutput = true;
			return rtn;
		}

	}

	class Square extends Rectangle {

		public Square(float side) {
			super(side, side);
		}

		@Override
		public float getArea() {
			if (logOutput) {
				System.out.println("Finding area of square with side = " + length);
			}
			return super.getArea();
		}

		@Override
		public float getPerimeter() {
			if (logOutput) {
				System.out.println("Finding perimeter of square with side = " + length);
			}
			return super.getPerimeter();
		}

		@Override
		public String toString() {
			logOutput = false;
			String rtn = "Square = [side: " + length + ", area: " + getArea() + ", perimeter: " + getPerimeter() + "]";
			logOutput = true;
			return rtn;
		}

	}

	class Circle implements Shape {

		float radius;
		boolean logOutput;

		public Circle(float radius) {
			this.radius = radius;
			logOutput = true;
		}

		@Override
		public float getArea() {
			if (logOutput) {
				System.out.println("Finding area of circle with radius = " + radius);
			}
			return 3.14F * radius * radius;
		}

		@Override
		public float getPerimeter() {
			if (logOutput) {
				System.out.println("Finding perimeter of circle with radius = " + radius);
			}
			return 6.28F * radius;
		}

		@Override
		public String toString() {
			logOutput = false;
			String rtn = "Circle = [radius: " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter()
					+ "]";
			logOutput = true;
			return rtn;
		}

	}
}
