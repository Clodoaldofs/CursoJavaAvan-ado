package entities;

public class Company extends TaxPayer {
	private int numberOfEmployees;
	
	
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double tax;
		if(numberOfEmployees <= 10) {
			tax = (anualIncome * 0.16);
		} else {
			tax = (anualIncome * 0.14);
		}
		return tax;
	}

}
