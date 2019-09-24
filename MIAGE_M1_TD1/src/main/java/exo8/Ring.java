package exo8;
import exo7.Cercle;
import exo7.Point;

public class Ring {
	Point centre;
	double rayon;
	double rayon_interne;
	
	public Ring(Point p, double rayon, double rayon_interne) {
		super();
		this.centre = p;
		this.rayon = (rayon>rayon_interne)? rayon : rayon_interne;
		this.rayon_interne = (rayon<rayon_interne)? rayon : rayon_interne;
	}
	public String toString() {
		/**
		 * KEEP CODING THIS PART
		 */
		return "Unfinished toString()";
	}
	public boolean contains(Point p) {
		
		return (Point.distance(centre,p)>this.rayon && 
				Point.distance(centre,p)<this.rayon_interne);
	}
	
	public static boolean contains(Point a,Ring ...rings) {
		   for(Ring  r : rings){
		      if (r.contains(a))
		    	  return true;
		   }
		return false;
}

}
