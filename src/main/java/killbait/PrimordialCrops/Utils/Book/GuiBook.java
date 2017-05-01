package killbait.PrimordialCrops.Utils.Book;

import killbait.PrimordialCrops.Info;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiBook extends GuiScreen {

	private static final ResourceLocation texture = new ResourceLocation("mc:textures/maingui.png");
	private static final ResourceLocation bookText = new ResourceLocation(Info.MODID, "book.txt");
	private int xSize = 247;
	private int ySize = 178;
	private int left, top;

	// mc.gameSettings.guiScale = 0 (Auto) , 1 (Small) , 2  (Normal) , 3 (Large)

	@Override
	public void initGui() {
		super.initGui();
	}

	@Override

	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		drawDefaultBackground();

		ScaledResolution res = new ScaledResolution(mc);
		int scalewidth = res.getScaledWidth();
		int scaleheight = res.getScaledHeight();
		int scalefactor = res.getScaleFactor();
		//int guiScale = mc.gameSettings.guiScale;

		GlStateManager.pushMatrix();

		drawBackground(scalewidth, scaleheight, scalefactor);
		drawPage(scalewidth, scaleheight, scalefactor);
		//mc.gameSettings.guiScale = guiScale;

		GlStateManager.popMatrix();

		super.drawScreen(mouseX, mouseY, partialTicks);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}


	public void drawBackground(int scalew, int scaleh, int scalef) {

		GlStateManager.color(1F, 1F, 1F);

		float scale = (float) scaleh / 240f;

		GlStateManager.pushMatrix();

		GlStateManager.scale(scale, scale, scale);
		mc.getTextureManager().bindTexture(texture);
		drawTexturedModalRect(left + ((scalew - (xSize * scale)) / (2 * scale)), top + ((scaleh - (ySize * scale)) / (2 * scale)), 0, 0, xSize, ySize);

		GlStateManager.popMatrix();


	}

	public void drawPage(int scalew, int scaleh, int scalef) {

		float scaleheight = (float) scaleh / 240f;
		float scalewidth = (float) scalew / 320f;

		// DEBUG Stuff

		// Left Justify Only = (int)((scalew / 2) / scaleheight)
		// Centered = scalew / 2

		Object obj = "gameSettings.giuScale " + mc.gameSettings.guiScale + " , this.width= " + this.width + " , this.height = " + this.height;
		drawCenteredString(mc.fontRendererObj, obj.toString(), scalew/2, scaleh/2, Integer.parseInt("FFAA00", 16));

		Object obj2 = "Scaled Resolution width= " + scalew + " , height = " + scaleh + " , scaleFactor = " + scalef;
		drawCenteredString(mc.fontRendererObj, obj2.toString(), scalew/2, scaleh/2 + 16, Integer.parseInt("FFAA00", 16));

		Object ob3 = "Height - GlStateManager.scale " + scaleheight;
		drawCenteredString(mc.fontRendererObj, ob3.toString(), scalew / 2, scaleh / 2 + 32, Integer.parseInt("FFAA00", 16));

		Object ob4 = "Width - GlStateManager.scale " + scalewidth;
		drawCenteredString(mc.fontRendererObj, ob4.toString(), scalew / 2, scaleh / 2 + 48, Integer.parseInt("FFAA00", 16));

		GlStateManager.pushMatrix();
		GlStateManager.scale(scaleheight / 2, scaleheight / 2, scaleheight / 2);

		drawString(mc.fontRendererObj, "Test Text is half the length we want to be", (int) ((scalew / 2) / scaleheight), top + (int) ((scaleh - (ySize * scaleheight)) / scaleheight) + 16, Integer.parseInt("FFAA00", 16));

		GlStateManager.popMatrix();
	}

}
