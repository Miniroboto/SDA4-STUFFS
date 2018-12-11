package com.sdacademy.bucharest.group4;

public class Classroom {

	private String address;
	private String id;
	private int places;

	public Classroom(String address, String id, int places) {
		this.address = address;
		this.id = id;
		this.places = places;
	}

	public String getAddress() {
		return address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPlaces() {
		return places;
	}

	public void setPlaces(int places) {
		if ((places >= 0) && (places <= 25)) {
			this.places = places;
		}
	}

}
