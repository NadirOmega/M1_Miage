package exo7;

public class Point {
	private int x;
	private int y;
	private static int cptInstanceOfPoints = 0;
	private int matricule;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
		cptInstanceOfPoints++;
		this.matricule=cptInstanceOfPoints;
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
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isSamePoint(Point dot) {
		return (this.x == dot.x && this.y ==dot.y); 
	}
	
	public void translate(int dx, int dy) {
		this.x +=dx;
		this.y +=dy;
	}
	
	public String toString() {
		StringBuilder tempSB= new StringBuilder("");
		return (tempSB.append("Point Numero : ")
					  .append(this.matricule)
					  .append(" avec les coods X :")
				      .append(this.x)
				      .append(" Y :")
				      .append(this.y)
				      .toString());
	}
	
	public static double distance(Point a,Point b) {
		return Math.sqrt(Math.pow(a.getX()-b.getX(),2)
						+Math.pow(a.getY()-b.getY(),2)
						);
	}
}
