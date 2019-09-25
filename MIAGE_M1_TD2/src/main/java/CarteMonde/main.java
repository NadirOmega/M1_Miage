package CarteMonde;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v = new Ville("PARIS", 48.85, 2.34) ;
		System.out.println(v.toString());
		VilleInteressante  v2 = new VilleInteressante ("PARIS", 48.85, 2.34, "TOUR EIFFEL");
		System.out.println(v2.toString());
	}

}
