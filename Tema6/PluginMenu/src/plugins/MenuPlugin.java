package plugins;

import pluginGroup.IDrawableGroup;
import pluginMenuApp.MenuApp;

public class MenuPlugin {
	 public static void main(String[] args) 
	 
	 {
	      IDrawableGroup grup = new IDrawableGroup();
		  
		  
		  MenuApp meniu = new MenuApp();
		  meniu.load(grup);
		  meniu.execute();
	}

}
