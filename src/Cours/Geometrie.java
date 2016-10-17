package Cours;

import java.util.Scanner;

public interface Geometrie {

	double surface();

	public static void main(String[] args) {
		System.out.println("forme geometrique" + "\n1)Rectangle" + "\n2)Trinangle" + "\n3)Carre" + "\n4)Cercle");
		Scanner lire = new Scanner(System.in);

		System.out.println("");
		System.out.println("=======");
		System.out.println("1)Rectangle");
		System.out.println("longeur:");
		double longeur = lire.nextDouble();
		System.out.println("largeur:");
		double largeur = lire.nextDouble();

		Rectangle rec = new Rectangle(longeur, largeur);

		System.out.println("2)Triangle");
		System.out.println("Base:");
		double base = lire.nextDouble();
		System.out.println("hauteur:");
		double hauteur = lire.nextDouble();

		Triangle tri = new Triangle(base, hauteur);
		
		System.out.println("3)Carre");
		System.out.println("coté:");
		double cote = lire.nextDouble();

		Carre car = new Carre(cote);

		System.out.println("4)Cercle");
		System.out.println("Rayon:");
		double rayon = lire.nextDouble();

		Cercle cer = new Cercle(rayon);
		Geometrie geometrie[] = { rec, tri, car, cer };

		System.out.println("==========");
		int count = 0;
		for (Geometrie forme : geometrie) {
			System.out.println("la surface de " + (count + 1) + " forme est de " + forme.surface() + " m²");

			count++;
		}
	}
}
