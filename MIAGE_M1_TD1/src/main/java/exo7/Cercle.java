package exo7;
import java.lang.Math;

public class Cercle {
	private Point centre;
	private int rayon;
	
	public Cercle(Point p, int rayon) {
		this.centre = p;
		this.rayon = rayon;
	}
	public Cercle( int rayon) {
		this.centre = new Point(0,0);
		this.rayon = rayon;
	}
	
	public Cercle( ) {
		this.centre = new Point(0,0);
		this.rayon = 0;
	}
	
	public String toString() {
		StringBuilder tempSB= new StringBuilder("");
		return (tempSB.append("Centre est de coods: ")
			  .append(centre.toString())
			  .append("\n est de Rayon")
			  .append(this.rayon)
			  .toString());
		
	}
	public void translate(int dx, int dy) {
		centre.translate(dx, dy);
	}
	public Point getCenter() {
		//make a copy before we send it
		return new Point(this.centre.getX(),this.centre.getY());
	}
	public double surface() {
		return (Math.PI * Math.pow(rayon, 2));
	}
	public boolean equals(Cercle a, Cercle b) {
		if (a.surface() == b.surface()) {
			return true;
		}
		return false;
	}
	public static boolean contains(Point a,Cercle ...circles) {
			   for(Cercle  c : circles){
			      if (c.contains(a))
			    	  return true;
			   }
			return false;
	}
	public boolean contains(Point a) {
		     return (distance(this.centre,a)<this.rayon);	 
}
	
	public static double distance(Point a,Point b) {
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)
						+Math.pow(a.getY()-b.getY(),2)
						);
	}
	
}