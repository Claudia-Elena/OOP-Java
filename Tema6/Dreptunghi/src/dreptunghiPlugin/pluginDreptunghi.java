package dreptunghiPlugin;
import plugin_interfaces.IDrawableElement;
import plugin_interfaces.IPluginApp;
public class pluginDreptunghi implements IPluginApp {
	  @Override
	    public String getName() {
	        return "DreptunghiPlugin";
	    }

	    @Override
	    public String getDisplay() {
	        return "Dreptunghi";
	    }

	    @Override
	    public IDrawableElement getShape() {
	        return new Dreptunghi();
	    }

}
