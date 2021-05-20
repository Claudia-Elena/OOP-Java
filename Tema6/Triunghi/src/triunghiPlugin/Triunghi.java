package triunghiPlugin;

import java.util.Scanner;

import plugin_interfaces.IDrawableElement;

public class Triunghi implements IDrawableElement {

	
	private double side1 = 0;
	private double side2 = 0;
	private double side3 = 0;
	
	
	public Triunghi(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side2 = side3;
	}
	
	
	public Triunghi() {
		// TODO Auto-generated constructor stub
	}


	public double getSide1() {
		return side1;
	}


	public void setSide1(double side1) {
		this.side1 = side1;
	}


	public double getSide2() {
		return side2;
	}


	public void setSide2(double side2) {
		this.side2 = side2;
	}


	public double getSide3() {
		return side3;
	}


	public void setSide3(double side3) {
		this.side3 = side3;
	}


	@Override
	public void draw()
	{
    System.out.println("Triangle -> s1: " + side1 + " s2: " + side2 + " s3: " + side3);
	}


	@Override
	public void modifyElement() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti ce vreti sa modificati: ");
		System.out.println("1 -> Modificati s1: ");
		System.out.println("2 -> Modificati s2: ");
		System.out.println("3 -> Modificati s3: ");
		int optiune = scan.nextInt();
		switch(optiune)
		{
		case 1: 
			{
			System.out.println("Introduceti noul s1: ");
			double s1 = scan.nextDouble();
			this.setSide1(s1);
			break;
			}
		case 2:
		{
			System.out.println("Introduceti noul s2: ");
			double s2 = scan.nextDouble();
			this.setSide2(s2);
			break;
		}
		case 3:
		{
			System.out.println("Introduceti noul s3: ");
			double s3 = scan.nextDouble();
			this.setSide3(s3);
			break;
		}
		}
	}


}
