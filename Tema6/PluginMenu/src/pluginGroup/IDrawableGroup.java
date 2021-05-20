package pluginGroup;


import java.util.ArrayList;
import java.util.Scanner;

import cercPlugin.Cerc;
import dreptunghiPlugin.Dreptunghi;
import patratPlugin.Patrat;
import pluginMenuApp.IMenuItem;
import pluginMenuApp.Menu;
import pluginMenuApp.MenuItem;
import plugin_interfaces.IDrawableElement;
import plugins.MenuPlugin;
import triunghiPlugin.Triunghi;



public class IDrawableGroup  {
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
				Patrat patrat = new Patrat(latura);
				elements.add(patrat);
				
	          }));
	    	optiuni.add(new MenuItem("Adaugare triunghi: ", 2, (parameters) -> {
	    	       
	    		System.out.println("Introduceti latura1");
				double latura1 = scan.nextDouble();
				System.out.println("Introduceti latura2");
				double latura2 = scan.nextDouble();
				System.out.println("Introduceti latura3");
				double latura3 = scan.nextDouble();
			    Triunghi triunghi = new Triunghi(latura1, latura2, latura3);
				elements.add(triunghi);
	           }));
	    	optiuni.add(new MenuItem("Adaugare cerc: ", 3, (parameters) -> {
	 	       
	    		System.out.println("Introduceti ox");
				double ox1 = scan.nextDouble();
				System.out.println("Introduceti oy");
				double oy1 = scan.nextDouble();
				System.out.println("Introduceti raza");
				double radius1 = scan.nextDouble();
				Cerc cerc = new Cerc(ox1, oy1, radius1);
				elements.add(cerc);
	            }));
	    	optiuni.add(new MenuItem("Adaugare dreptunghi: ", 4, (parameters) -> {
		 	       
	    		System.out.println("Introduceti latime");
				double latura1 = scan.nextDouble();
				System.out.println("Introduceti Lungime");
				double latura2 = scan.nextDouble();
				Dreptunghi dreptunghi = new Dreptunghi(latura1, latura2);
				elements.add(dreptunghi);
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

