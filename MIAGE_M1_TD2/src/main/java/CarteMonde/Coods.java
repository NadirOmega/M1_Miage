package CarteMonde;

public class Coods {
	double c1,c2;

	public Coods(double c1, double c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	public String toString() {
		
		return new StringBuilder(" ").append("(")
				.append(this.c1)
				.append(" N,")
				.append(this.c2)
				.append(" O")
				.append(")").toString();
	}
	
}
