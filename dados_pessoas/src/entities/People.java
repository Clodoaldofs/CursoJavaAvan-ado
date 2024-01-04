package entities;

public class People {
	private double Height;
	private char Gender;
	
	public People(double height, char gender) {
		Height = height;
		Gender = gender;
	}
	public double getHeight() {
		return Height;
	}
	public void setHeight(double height) {
		Height = height;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	

}
