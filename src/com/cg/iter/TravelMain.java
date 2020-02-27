package com.cg.iter;

import java.util.Scanner;

public class TravelMain {

	public static void main(String[] args) {
	/**	using constructor and getter setter method
//		// TODO Auto-generated method stub
//         Car c=new Car(5,10000,"swift","blue");
//         System.out.println(c);//returns address/hashcode
//         //c.setTyres(5);
//         System.out.println("Car tyres="+c.getTyres());
//         //c.setCost(50.0);
//         System.out.println("car cost"+c.getCost());
//        // c.setType("xyz");
//         System.out.println("car tyre type"+c.getType());
//        // c.setColor("blue");
//         System.out.println("car color"+c.getColor());
//         Bus b=new Bus();
//         b.setTyres(8);
//         System.out.println("Bus tyre="+b.getTyres());
//         Vehicle v=new Car(5,10000,"swift",null);
//         Truck t=new Truck();
 *
 */
		//using String 
//        //Vehicle v1=new Vehicle();
//         System.out.println(c.equals(t));//comparing truck obj without extending it to vehicle shows erroe classcastexception
//         System.out.println(c.equals(v));//here the references are compared c==v so we need to  override it in vehicle class .
//        //here .equals cannot be used directly as these are not string type object
//	        Car c1=new Car();
//	        c1.move();
//		Movable s=new Car();
//		s.move();
		//input from user 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the type of vehicle:");
		String type=scan.nextLine();
		Movable m=Movablefactory.getInstance(type);//sometimes creating object is not needed we can directly use the name by using instance method known as getInstance
	     if(m!=null)     
		m.move();
	     else
	    	 System.out.println("not found "+type);
	    
	}
	
	
	

}
