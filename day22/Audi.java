package day22;

public class Audi extends Car{

	String model;
	public void stop()
	{
		System.out.println("this is to stop the car");
	}
	public static void main(String[] args) {
		Audi a=new Audi();
		a.model="A4";
		a.stop();
		a.price=1111;
		a.start();
	}

}
