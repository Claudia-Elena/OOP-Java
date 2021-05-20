package paintcmd.forms;

import java.util.Scanner;

import paintcmd.abstractions.IDrawableElement;

public class DrawableRectangle implements IDrawableElement{

	private double width = 0;
	private double height = 0;
	
	public DrawableRectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	@Override
	public void draw()
	{
    System.out.println("Rectangle -> w: " + width + " h: " + height);
	}

	@Override
	public void modifyElement() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti ce vreti sa modificati: ");
		System.out.println("1 -> Modificati w: ");
		System.out.println("2 -> Modificati h: ");
		int optiune = scan.nextInt();
		switch(optiune)
		{
		case 1: 
			{
			System.out.println("Introduceti noul w: ");
			double w1 = scan.nextDouble();
			this.setWidth(w1);
			break;
			}
		case 2:
		{
			System.out.println("Introduceti noul h: ");
			double h1 = scan.nextDouble();
			this.setHeight(h1);
			break;
		}
		}
	}
	
	

}
