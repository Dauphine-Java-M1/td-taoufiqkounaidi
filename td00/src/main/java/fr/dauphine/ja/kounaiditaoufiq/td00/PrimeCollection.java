package fr.dauphine.ja.kounaiditaoufiq.td00;

import java.util.ArrayList;
import java.util.Random;

@SuppressWarnings("unused")
public class PrimeCollection {
	
	private ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	//constructor 
	public PrimeCollection() {
		
	}
	public static void main(String[] args) {
		PrimeCollection p = new PrimeCollection();
		p.initRandom(100, 1000);
		//System.out.println(p.isPrime(72));
		System.out.println(p.printPrimes());
		
	}
	/**
	 * Ques 2 : initRandom(n, m) pour insérer dans la collection numbers n entiers entre 0 et m
	 * @param n nombre d'entiers tirés aléatoirment entre 0 et @param m
	 */
	
	public void initRandom(Integer n, Integer m) {
		Random rd = new Random();
		for (int i =0;i<n;i++) {
			numbers.add(1+rd.nextInt(m));
		}
		System.out.println(numbers);
	}
	/**
	 * isPrime(p) vérifie si le nombre passé en paramètre est un entier ou non
	 * @param p un nombre entier
	 * @return true si p est premier, false sinon
	 */
	private boolean isPrime(Integer p) {
		if (p % 2 == 0) return false;
		for (int i = 3 ; i*i <= p ; i+=2)
			{
			if (p % i == 0) return false;
			}
		return true ;
	}
	/**
	 * printPrimes() affiche que les nombres premiers dans la collection numbers
	 * @return la collection numbers contenant que des nombres entiers
	 */
	public String printPrimes() {
		ArrayList<Integer> primenumbers = new ArrayList<Integer>();
		
	/*	for ( int i = 0; i < numbers.size() ; i++) {
			if (isPrime(numbers.get(i))) {
				primenumbers.add(i);
			}
		} */
		for (Integer pn : numbers) {
			if (isPrime(pn)) {
				primenumbers.add(pn);
			}
		}
		return "Voiçi la liste contenant que les nombres premiers : " + primenumbers;
	}
	

}
