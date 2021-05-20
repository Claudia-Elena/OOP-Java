package patratPlugin;

import plugin_interfaces.IDrawableElement;
import plugin_interfaces.IPluginApp;
public class pluginPatrat implements IPluginApp{

    @Override
    public String getName() {
        return "PatratPlugin";
    }

    @Override
    public String getDisplay() {
        return "Patrat";
    }

    @Override
    public IDrawableElement getShape() {
        return new Patrat();
    }

}
