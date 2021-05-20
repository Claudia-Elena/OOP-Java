package cercPlugin;
import plugin_interfaces.IDrawableElement;
import plugin_interfaces.IPluginApp;
public class pluginCerc implements IPluginApp  {

    @Override
    public String getName() {
        return "CercPlugin";
    }

    @Override
    public String getDisplay() {
        return "Cerc";
    }

    @Override
    public IDrawableElement getShape() {
        return new Cerc();
    }
}
