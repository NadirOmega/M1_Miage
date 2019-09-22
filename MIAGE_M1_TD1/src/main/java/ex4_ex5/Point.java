package ex4_ex5;

import java.util.ArrayList;

public class Point {
	private int x;
	private int y;
	static int cptInstanceOfPoints ;

	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		cptInstanceOfPoints++;

	}

	public Point(int x) {
		this.x = x;
		this.y=0;
		cptInstanceOfPoints++;

	}
	public Point() {
		this.x = 0;
		this.y = 0;
		cptInstanceOfPoints++;
	}

	boolean equals(Point dot) {
		if (! (dot instanceof Point) ) 
			return false;
		return (this.x == dot.x && this.y ==dot.y);
		
	}
	public boolean isSamePoint(Point dot) {
		return (this.x == dot.x && this.y ==dot.y); 
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(1,2);
		Point p2 = p1;
		Point p3 = new Point(1,2);
		ArrayList<Point> list= new ArrayList<Point>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p1));
		System.out.println(list.indexOf(p3));


	}
	
}
