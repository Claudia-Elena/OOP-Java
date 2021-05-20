package paintcmd.forms;

import java.util.Scanner;

import paintcmd.abstractions.IDrawableElement;

public class DrawableCircle implements IDrawableElement {

	private double ox = 0;
	private double oy = 0;
	private double radius = 0;
	public DrawableCircle(double ox, double oy, double radius)
	{
		this.ox = ox;
		this.oy = oy;
		this.radius = radius;
	}
	
	public double getOx() {
		return ox;
	}
	public void setOx(double ox) {
		this.ox = ox;
	}
	public double getOy() {
		return oy;
	}
	public void setOy(double oy) {
		this.oy = oy;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void draw()
	{
    System.out.println("Circle -> ox: " + ox + " oy: " + oy + " radius: " + radius);
	}

	@Override
	public void modifyElement() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti ce vreti sa modificati: ");
		System.out.println("1 -> Modificati ox: ");
		System.out.println("2 -> Modificati oy: ");
		System.out.println("3 -> Modificati raza: ");
		int optiune = scan.nextInt();
		switch(optiune)
		{
		case 1: 
			{
			System.out.println("Introduceti noul ox: ");
			double ox1 = scan.nextDouble();
			this.setOx(ox1);
			break;
			}
		case 2:
		{
			System.out.println("Introduceti noul oy: ");
			double oy1 = scan.nextDouble();
			this.setOy(oy1);
			break;
		}
		case 3:
		{
			System.out.println("Introduceti noua raza: ");
			double r1 = scan.nextDouble();
			this.setOx(r1);
			break;
		}
		}
		
	}

}
