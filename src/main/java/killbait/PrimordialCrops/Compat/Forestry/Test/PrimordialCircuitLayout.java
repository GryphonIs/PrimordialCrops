package killbait.PrimordialCrops.Compat.Forestry.Test;

import forestry.api.circuits.ChipsetManager;
import forestry.api.circuits.ICircuitLayout;
import forestry.api.circuits.ICircuitSocketType;
import killbait.PrimordialCrops.Info;
import net.minecraft.client.resources.I18n;

import javax.annotation.Nonnull;

/**
 * Created by Jon on 16/04/2017.
 */
public class PrimordialCircuitLayout implements ICircuitLayout {

	private final String uid;
	private final ICircuitSocketType socketType;
	//private final Mod modid;

	public PrimordialCircuitLayout(final String uid, final ICircuitSocketType socketType) {
		this.uid = uid;
		this.socketType = socketType;
		//this.modid = modid;
		ChipsetManager.circuitRegistry.registerLayout(this);

	}

	@Nonnull
	@Override
	public String getUID() {
		return "primordialcrops.circuitlayout";
	}

	@Nonnull
	@Override
	public String getName() {
		return I18n.format(Info.MODID + ".circuit.layout");
	}

	@Nonnull
	@Override
	public String getUsage() {
		return I18n.format(Info.MODID + ".circuit.layout.usage");
	}

	@Nonnull
	@Override
	public ICircuitSocketType getSocketType() {
		return this.socketType;
	}
}
