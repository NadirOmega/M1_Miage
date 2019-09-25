package Canette;

public class Distributeur {
	private BacCanetteLongue bclo;
	private BacCanetteLarge bcla ;
	
	public Distributeur() {
		this.bclo=new BacCanetteLongue();
		this.bcla=new BacCanetteLarge();
	}
	public String toString() {

		StringBuilder tempStr=new StringBuilder("");
		tempStr.append(bclo.toString());
		tempStr.append(bcla.toString());
		return tempStr.toString();

	}
	public void addCanette(int i, Canette c ) {
		if (c instanceof CanetteLarge) {
			bcla.addCannette(c);
		}
		else {
			bclo.addCannette(c);
		}
	}

}



