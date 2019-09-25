package CarteMonde;

public class Ville {
	String name;
	Coods coods;
	
	
	public Ville(String name, Coods coods) {
		super();
		this.name = name;
		this.coods = coods;
	}

	public Ville(String name, double c1,double c2) {
		super();
		this.name = name;
		this.coods= new Coods(c1,c2);
	}
	public String getMeilleurPointdInteret() {
		return "";
	}
	public String toString() {
		
		return new StringBuilder("").append("(")
				.append(this.name)
				.append(" , ")
				.append(this.coods)
				.append(this.getMeilleurPointdInteret())
				.append(")").toString();
				
	}


}
