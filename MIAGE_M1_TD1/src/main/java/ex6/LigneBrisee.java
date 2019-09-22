package ex6;

import ex4_ex5.Point;
import java.util.LinkedList;

public class LigneBrisee {
	private int maxNbDot;
	private int cptAddDot = 0;
	private Point[] tabDepoints;
	
	private LinkedList<Point> listDePoints;
	
	public LigneBrisee(int capacity) {
		this.maxNbDot=capacity;
		this.tabDepoints = new Point[capacity];
	}

	public LigneBrisee() {
		this.listDePoints= new LinkedList<Point>();
	}
	
	
	
	
	public void add(Point point) {
		if (listDePoints!=null) {
			listDePoints.add(point);
			}
		else {
			if (maxNbDot == cptAddDot) {
				 System.err.println("full");
			}
			else {
				tabDepoints[cptAddDot++]=point;
			
			}
		}
		
	}
	
	
	public int nbPoints() {
		
		if (listDePoints!=null)
		return this.listDePoints.size(); 
		return this.maxNbDot;
	}
	
	public boolean contains(Point p) {
		if (this.listDePoints!=null) return  this.listDePoints.contains(p);
		for (Point pTemp : tabDepoints) {
			if (pTemp.equals(p))
					return true;
		}
		return false;
	}
}