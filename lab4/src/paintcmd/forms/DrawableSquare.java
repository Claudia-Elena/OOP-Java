package paintcmd.forms;

import java.util.Scanner;

import paintcmd.abstractions.IDrawableElement;

public class DrawableSquare implements IDrawableElement {

	
	private double latura = 0;
	
	
	public DrawableSquare(double latura)
	{
		this.latura = latura;
	}
	
	public double getLatura() {
		return latura;
	}

	public void setLatura(double latura) {
		this.latura = latura;
	}

	@Override
	public void draw()
	{
    System.out.println("Square -> l: " + latura);
	}

	@Override
	public void modifyElement() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduceti latura noua: ");
		double lat = scan.nextDouble();
		this.setLatura(lat);
		}
	}
	


