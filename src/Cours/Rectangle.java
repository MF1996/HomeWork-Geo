package Cours;

public class Rectangle implements Geometrie {
	private double longeur;
	private double largeur;

	Rectangle(double longeur, double largeur) {
		this.longeur = longeur;
		this.largeur = largeur;
		if (longeur < 0 || largeur < 0)
			System.out.println("!");

	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		if (longeur < 0)
			System.out.println("!");
		else
			this.longeur = longeur;
	}

	public double getLargeur() {

		return largeur;
	}

	public void setLargeur(double largeur) {
		if (longeur < 0)
			System.out.println("!");
		else
			this.largeur = largeur;
	}

	@Override
	public double surface() {

		return longeur * largeur;
	}

}
