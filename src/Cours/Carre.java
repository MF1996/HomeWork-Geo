package Cours;

public class Carre implements Geometrie {

	private double cote;

	public double getCote() {

		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}

	Carre(double cote) {
		if (cote < 0)
			System.out.println("!");
		else
			this.cote = cote;

	}

	@Override
	public double surface() {

		return (cote * cote);
	}

}
