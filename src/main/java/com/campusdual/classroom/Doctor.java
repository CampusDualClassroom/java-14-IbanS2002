package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	public void getDetails(){
		System.out.println("El nombre del doctor es:"+ name);
		System.out.println("El apellido del doctor es:"+ surname);
		System.out.println("La especialización del docotr es:"+specialization);
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
