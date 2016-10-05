package killbait.PrimordialCrops.Utils;

public class GuiBook extends GuiScreen {

@Override
public void drawScreen(int mouseX, int mouseY, float partialTicks) {
    this.drawDefaultBackground();
    super.drawScreen(mouseX, mouseY, partialTicks);
}

@Override
public boolean doesGuiPauseGame() {
    return false;
}



}
