package pluginMenuApp;

import java.util.ArrayList;
import java.util.Scanner;



public class Menu implements IMenuItem{
    
    private ArrayList<IMenuItem> menuItems = new ArrayList();
    private boolean continueMenuLoop;
    private String text;
    private int shortCut;
    
    public Menu(String menuText, int shortCut, ArrayList<IMenuItem> menuItems)
    {
        text = menuText;
        this.shortCut = shortCut;
        
        this.menuItems.add(new MenuItem("Exit", 0, (parameters) -> {
            continueMenuLoop = false;
            System.out.println("La revedere!");
        }));
        this.menuItems.addAll(menuItems);
    }
    
   

	private void renderItems()
    {
        menuItems.forEach((item) -> {
            item.render();
        });
        
        System.out.println("Please enter your option ");
    }
    
    public void execute()
    {
        continueMenuLoop = true;
        do
        {
           renderItems();
           int option = readUserOption();
           IMenuItem selectedItem = selectMenuItem(option);
           if (selectedItem != null)
           {
               selectedItem.execute();
           }            
            
        }while(continueMenuLoop);
    }

    private int readUserOption() {
        
        Scanner consoleIn = new Scanner(System.in);
        int option = consoleIn.nextInt();
        
        return option;        
    }

    private IMenuItem selectMenuItem(int option) 
    {
        
        for(int i = 0; i < menuItems.size(); i++)
        {
            if (menuItems.get(i).getShortCut() == option)
            {
                return menuItems.get(i);
            }
        }
        
        return null;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getShortCut() {
        return shortCut;
    }

    @Override
    public void render() {
        System.out.println(""+ shortCut + ". " + text);
    }
    
    
}

