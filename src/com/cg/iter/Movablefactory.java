package com.cg.iter;

public class Movablefactory {

	public static Movable getInstance(String type) {
		// TODO Auto-generated method stub
		int age=18;//local  variable
		Movable m=null;
		if("Car".equalsIgnoreCase(type))
		{
			m=new Car();
		}
		else if("Bus".equalsIgnoreCase(type))
		{
			m=new Bus();
		}
		else if("Truck".equalsIgnoreCase(type))//to ignore the case sensitivity
		{
			m=new Truck();
		}
		else
		{
			//m=new UnknownVehicle();
			m=new Movable() {
//anonymous class and the scope is only within the else
				@Override
				public void move() {
					// TODO Auto-generated method stub
					//we can not change the local variable in side the inner class i.e age ++ shows error,age is a constant and called as effectively final
					System.out.println(age);//anonymous class can access local variable
					System.out.println("anon vehicle moving  ....");
				}
				
			}	;	
		}
		
//		switch (type) {
//		case "Car":
//			m=new Car();
//			
//			break;
//       case "Bus":
//    	   m=new Bus();
//			
//			break;
//       case "Truck":
//    	   m=new Truck();
//	
//	break;
//
//		default:
//			break;
//		}
		return m;
	}
 private static class UnknownVehicle implements Movable{
//inner class can not be accessed by any of the methods outside
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Unknownvehicle moving :");
	}
	 
 }
}
