package paintcmd.forms;

import java.util.ArrayList;
import java.util.Scanner;

import paintcmd.abstractions.IDrawableElement;
import paintcmd.abstractions.IMenuItem;
import paintcmd.implementation.Menu;
import paintcmd.implementation.MenuItem;

public class DrawableGroup  {
    private Scanner scan = new Scanner(System.in);
	private ArrayList<IDrawableElement> elements = new ArrayList();
	
	public void addElement(IDrawableElement elementToAdd)
	
	{
		elements.add(elementToAdd);
	}
	public void removeElement(int i)
	{
		elements.remove(i);
	}
	
	public IDrawableElement getElement(int poz)
	{
		return elements.get(poz);
	}
	
	
	
	 public Menu addForma(int i)
	 
	    {
	    	ArrayList<IMenuItem> optiuni = new ArrayList<>();
	    	optiuni.add(new MenuItem("Adaugare patrat: ", 1, (parameters) -> {
	            
				System.out.println("Introduceti latura");
				double latura = scan.nextDouble();
				DrawableSquare patrat = new DrawableSquare(latura);
				elements.add(patrat);
				
	          }));
	    	optiuni.add(new MenuItem("Adaugare triunghi: ", 2, (parameters) -> {
	    	       
	    		System.out.println("Introduceti latura1");
				double latura1 = scan.nextDouble();
				System.out.println("Introduceti latura2");
				double latura2 = scan.nextDouble();
				System.out.println("Introduceti latura3");
				double latura3 = scan.nextDouble();
				DrawableTriangle triunghi = new DrawableTriangle(latura1, latura2, latura3);
				elements.add(triunghi);
	           }));
	    	optiuni.add(new MenuItem("Adaugare cerc: ", 3, (parameters) -> {
	 	       
	    		System.out.println("Introduceti ox");
				double ox1 = scan.nextDouble();
				System.out.println("Introduceti oy");
				double oy1 = scan.nextDouble();
				System.out.println("Introduceti raza");
				double radius1 = scan.nextDouble();
				DrawableCircle cerc = new DrawableCircle(ox1, oy1, radius1);
				elements.add(cerc);
	            }));
	    	
	    	Menu menu = new Menu("Adauga forma: ", i, optiuni);
	    	
	    	return menu;
	    	
	    }

	public void draw() {
		// TODO Auto-generated method stub
		/*
		elements.forEach((element) -> {
			
		}); */
		
		 for(IDrawableElement element:elements)
		{
			element.draw();
		}
		
		/*
		for(int i=0; i<elements.size();i++)
		{
			IDrawableElement element = elements.get(i);
		} */
	}
}
