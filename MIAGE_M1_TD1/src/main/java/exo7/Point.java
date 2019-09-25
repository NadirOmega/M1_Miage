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
	
	/**
	 * GETTER AND SETTER
	 */
	
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

	/**
	 * 
	 * END GETTER AND SETTER SECTION
	 * 
	 */
	
	/**
	 * 
	 * @param dot
	 * @return
	 */
	
	public boolean isSamePoint(Point dot) {
		return (this.x == dot.x && this.y ==dot.y); 
	}
	/**
	 * Translating point
	 * @param Coods :dx , dy
	 */
	
	public void translate(int dx, int dy) {
		this.x +=dx;
		this.y +=dy;
	}
	/**
	 * TO STRING FUNCTION
	 */
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
	/**
	 * 
	 * @param firstPoint ,second point 
	 * @return distance betwen two dots
	 */
	public static double distance(Point firstPoint,Point secondPoint) {
		return Math.sqrt(Math.pow(firstPoint.getX()-secondPoint.getX(),2)
						+Math.pow(firstPoint.getY()-secondPoint.getY(),2)
						);
	}
}
