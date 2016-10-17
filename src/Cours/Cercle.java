package Cours;

public class Cercle implements Geometrie {
	private double rayon;

	Cercle(double rayon) {
		if (rayon < 0)
			System.out.println("!");
		else
			this.rayon = rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		if (rayon < 0)
			System.out.println("!");
		else
			this.rayon = rayon;
	}

	@Override
	public double surface() {

		return (rayon * rayon * Math.PI);
	}
}
