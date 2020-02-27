package com.cg.iter;

public abstract class Vehicle {
	//abstract class can not be instantiated
	private int tyres;
	private double cost;
	private String type;
	private String color;
	/**
	 * returns the number of tyres.
	 * @return
	 */
	
	public int getTyres() {
		return tyres;
	}
	//@Override
	//bypassing the compiler
	public boolean equals(Object obj) {
		// obj is the object of object class may be car,bus which we pass in equals method with vehicle obj
		Vehicle compared=(Vehicle)obj;//type casted  object to an vehicle using vehicle data type
		return tyres==compared.getTyres()&&cost==compared.getCost()&&type.equals(compared.getType());
	//compares the values inside the obj of vehicle with cars obj.
	}
	
	
	public Vehicle(int tyres, double cost, String type, String color) {
		super();
		this.tyres = tyres;
		this.cost = cost;
		this.type = type;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicle [tyres=" + tyres + ", cost=" + cost + ", type=" + type + ", color=" + color + "]";
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setTyres(int tyres) {
		this.tyres = tyres;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
