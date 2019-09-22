package ex2;

import java.util.ArrayList;
import java.util.Random;

public class PrimeCollection {
	private ArrayList<Integer> primeCollectionList;

	public PrimeCollection() {
		primeCollectionList = new ArrayList<Integer>();
	}

	void initRandom(int n, int m) {
		Random rdTemp = new Random();
		for (int i = 0; i < n; i++) {
			primeCollectionList.add(rdTemp.nextInt(m));
		}

	}

	static boolean isPrime(int p) {
		int i=2;
		boolean temp = true;
		while( i <= Math.round(Math.sqrt(p)) && temp ) {
			if (p%i == 0) {
				temp=false;
			}
			i++;
		}
		return temp;
	}
	void printPrime() {
		System.out.println("Prime numbers are : ");
		for (Integer nb : primeCollectionList) {
			if (isPrime(nb)) {
				System.out.println(nb);
			}
		}
	}
	void printAll() {
		for (Integer nb : primeCollectionList) {

			System.out.print(" " + nb);

		}
		System.out.println("");
	}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		PrimeCollection prime = new PrimeCollection();
		prime.initRandom(100, 100);
		prime.printAll();
		prime.printPrime();

	}

}
