package com.campusdual.classroom;

public class Person {
	protected String name;
	protected String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Person() {
	}

	public void getDetails(){
		System.out.println("Aqui se muestra el nombre: "+ name);
		System.out.println("Aqui se mostrará el apellido"+ surname);
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
