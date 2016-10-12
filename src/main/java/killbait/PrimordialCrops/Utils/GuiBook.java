package killbait.PrimordialCrops.Utils;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;

//Have not tested if this will work or not, Writting the code directly into github until i clone the source, Imports are needed

// Tested + works ok

public class GuiBook extends GuiScreen {

	public static final ResourceLocation texture = new ResourceLocation("mc:textures/maingui.png");
	int xSize, ySize, left, top;

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();

		GlStateManager.color(1F, 1F, 1F);
		mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(left, top, 0, 0, xSize, ySize);

		super.drawScreen(mouseX, mouseY, partialTicks);

		String betaTest = I18n.translateToLocal("Primordial Crops");
		mc.fontRendererObj.drawStringWithShadow(betaTest, left + xSize / 2 - mc.fontRendererObj.getStringWidth(betaTest) / 2, top - 12, 0xFFFFFF);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	public void initGui() {
		xSize = 256;
		ySize = 184;
		left = (width - xSize) / 2;
		top = (height - ySize) / 2;
	}
}
