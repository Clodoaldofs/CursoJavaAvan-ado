package entities;

public class Notas {
	public String name;
	public double note1, note2, note3;

	public double notaTotal() {
		return note1+note2+note3;

	}
	public String toString() {
		if(notaTotal() < 60) {
			double falta = 60 - notaTotal();
			return "FINAL GRADE = " + String.format("%.2f\n", notaTotal())
					+ "FAILED\n"
					+ "MISSING " + String.format("%.2f", falta) + " POINTS";
		}
		return "FINAL GRADE = " + String.format("%.2f\n", notaTotal()) 
				+ "PASS";
	}

}
