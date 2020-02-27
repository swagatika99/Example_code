package com.cg.iter;
/**
 * This class represents a car that inherits the properties of vehicle.
 * @author Administrator
 *
 */

public class Car extends Vehicle implements Movable{

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int tyres, double cost, String type, String color) {
		super(tyres, cost, type, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car" + super.toString();	
}

	

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("the car is moving.");
	}}