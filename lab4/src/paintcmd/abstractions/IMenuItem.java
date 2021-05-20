package paintcmd.abstractions;

/**
*
* @author catalin
*/
public interface IMenuItem {
   String getText();
   int getShortCut();    
   void render();
   void execute();
}
