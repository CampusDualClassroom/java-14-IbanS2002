package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void getDetails(){
		System.out.println("El nombre del profesor es:"+ name );
		System.out.println("El nombre de policia es:"+ surname);
		System.out.println("El nombre de policia es:"+ area);
	}
}
