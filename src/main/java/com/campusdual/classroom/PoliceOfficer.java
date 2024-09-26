package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	public String getSquad() {
		return squad;
	}

	public void setSquad(String squad) {
		this.squad = squad;
	}

	public void getDetails(){
		System.out.println("El nombre de policia es:"+ name);
		System.out.println("El apellido de policia es:"+ surname);
		System.out.println("El equipo del policia es:"+ squad);
	}
}
