package paintcmd.app;

import paintcmd.abstractions.IDrawableElement;
import paintcmd.forms.DrawableCircle;
import paintcmd.forms.DrawableGroup;
import paintcmd.forms.DrawableRectangle;
import paintcmd.forms.DrawableSquare;
import paintcmd.forms.DrawableTriangle;

public class PaintCmd {
 public static void main(String[] args) 
 
 {
      DrawableGroup grup = new DrawableGroup();
	  
	  
	  MeniuApp meniu = new MeniuApp();
	  meniu.load(grup);
	  meniu.execute();
}
}
