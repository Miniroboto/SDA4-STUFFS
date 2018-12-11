package com.sdacademy.bucharest.group4;

public class Main {

	public static void main(String[] args) {

		Classroom myClassroom = new Classroom("Mendeleev", "D", 18);

		System.out.println("Am curs la adresa: " + myClassroom.getAddress() + " sala: " + myClassroom.getId());

		Classroom otherClassroom = new Classroom("Mendeleev", "C", 12);
		
		otherClassroom.setPlaces(15);
		
		
	}

}
