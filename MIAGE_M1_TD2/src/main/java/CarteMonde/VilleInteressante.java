package CarteMonde;

public class VilleInteressante extends Ville {
	
	String meilleurPointdInteret;
	public VilleInteressante(String name, Coods coods,String mpdi) {
		super(name,coods);
		this.meilleurPointdInteret=mpdi;
	}

	public VilleInteressante(String name, double c1,double c2,String mpdi) {
		super(name,c1,c2);
		this.meilleurPointdInteret=mpdi;
	}
	public String getMeilleurPointdInteret() {
		return new StringBuilder(" ").append(",")
				.append(this.meilleurPointdInteret)
				.toString();
	}
}
