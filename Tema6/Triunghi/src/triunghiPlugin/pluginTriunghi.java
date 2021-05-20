package triunghiPlugin;
import plugin_interfaces.IDrawableElement;
import plugin_interfaces.IPluginApp;
public class pluginTriunghi implements IPluginApp {
	  @Override
	    public String getName() {
	        return "TriunghiPlugin";
	    }

	    @Override
	    public String getDisplay() {
	        return "Triunghi";
	    }

	    @Override
	    public IDrawableElement getShape() {
	        return new Triunghi();
	    }

}
