package killbait.PrimordialCrops.Utils;

public class GuiHandler implements IGuiHandler {
    
    public static final int GUI_BOOK = 0;
    
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
         if (ID == GUI_BOOK)
        return new GuiBook();
        
        return null;
    }
}
