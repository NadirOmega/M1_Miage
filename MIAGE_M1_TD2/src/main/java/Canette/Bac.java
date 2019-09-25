package Canette;

public class Bac {

	private Canette [] cannettes ;
	private int cpt =0;
	private int tailleMax=10;

	public Bac(int tailleMax) {
		cannettes = new Canette[tailleMax];
	}

	public Bac() {
		cannettes = new Canette[10];
	}

	public void addCannette(Canette c) {
		if (cpt < 9) {
			this.cannettes[cpt]=c;
			cpt++;
		} 
		else {
			System.out.println("Plein");
		}
	}
	public String toString() {

		StringBuilder temp = new StringBuilder("");
		for(Canette c : cannettes) {
			temp.append(c.toString());
			temp.append("\n");
		}
		return temp.toString();
	}

}
