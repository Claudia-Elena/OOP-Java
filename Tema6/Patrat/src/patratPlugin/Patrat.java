package patratPlugin;

import java.util.Scanner;

import plugin_interfaces.IDrawableElement;

public class Patrat  implements IDrawableElement {

		
		private double latura = 0;
		
		
		public Patrat (double latura)
		{
			this.latura = latura;
		}
		
		public Patrat() {
			// TODO Auto-generated constructor stub
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
