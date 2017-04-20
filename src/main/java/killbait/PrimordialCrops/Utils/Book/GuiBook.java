package killbait.PrimordialCrops.Utils.Book;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiBook extends GuiScreen {

	private static final ResourceLocation texture = new ResourceLocation("mc:textures/maingui.png");
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
		drawPage();
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

		// DEBUG Stuff

		/*Object obj = "gameSettings.giuScale " + mc.gameSettings.guiScale + " , this.width= " + this.width + " , this.height = " + this.height;
		drawCenteredString(mc.fontRendererObj, obj.toString(), scalew/2, scaleh/2, Integer.parseInt("FFAA00", 16));

		Object obj2 = "Scaled Resolution width= " + scalew + " , height = " + scaleh + " , scaleFactor = " + scalef;
		drawCenteredString(mc.fontRendererObj, obj2.toString(), scalew/2, scaleh/2 + 16, Integer.parseInt("FFAA00", 16));

		Object ob3 = "GlStateManager.scale " + scale;
		drawCenteredString(mc.fontRendererObj, ob3.toString(), scalew/2, scaleh/2 + 32, Integer.parseInt("FFAA00", 16));*/
	}

	public void drawPage() {
	}

}
