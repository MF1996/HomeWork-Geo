package Cours;

public class Triangle implements Geometrie {
	private double hauteur;
	private double base;

	public double getHauteur() {
		if (base < 0)
			System.out.println("!");
		return hauteur;
	}

	Triangle(double base, double hauteur) {
		this.base = base;
		this.hauteur = hauteur;
		if (hauteur < 0 || base < 0)
			System.out.println("!");

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		if (base < 0)
			System.out.println("!");
		else
			this.base = base;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	@Override
	public double surface() {

		return (hauteur * base / 2);
	}
}
