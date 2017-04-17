package killbait.PrimordialCrops.Compat.Forestry.Test;

import forestry.api.circuits.ChipsetManager;
import forestry.api.circuits.ICircuit;
import forestry.api.circuits.ICircuitLayout;
import forestry.api.farming.FarmDirection;
import forestry.api.farming.IFarmHousing;
import killbait.PrimordialCrops.Compat.Forestry.PrimordialFarmLogicCrop;
import killbait.PrimordialCrops.Utils.LogHelper;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Jon on 15/04/2017.
 */
public class PrimordialCircuit implements ICircuit {

	private String uid;
	private PrimordialFarmLogicCrop farmLogic;

	public PrimordialCircuit(String id, ICircuitLayout layout, ItemStack itemStack) {
		LogHelper.info("Circuit Init!!");
		this.uid = "primordialcrops.circuit." + id;
		ChipsetManager.circuitRegistry.registerCircuit(this);
		if (itemStack != null) {
			ChipsetManager.solderManager.addRecipe(layout, itemStack, this);
		}


	}


	@Override
	public String getUID() {
		return this.uid;
	}

	@Override
	public boolean requiresDiscovery() {
		return false;
	}

	@Override
	public int getLimit() {
		return 0;
	}

	@Override
	public String getUnlocalizedName() {
		return this.uid;
	}

	@Override
	public boolean isCircuitable(Object tile) {
		return tile instanceof IFarmHousing;
	}

	@Nullable
	private IFarmHousing getCircuitable(Object tile) {
		if (!isCircuitable(tile)) {
			return null;
		}
		return (IFarmHousing) tile;
	}

	@Override
	public void onInsertion(int slot, Object tile) {
		/*IFarmHousing housing = getCircuitable(tile);
		if (housing == null) {
			return;
		}

		//logic.setManual(isManual);

		housing.setFarmLogic(FarmDirection.values()[slot], logic);*/

	}

	@Override
	public void onLoad(int slot, Object tile) {
		onInsertion(slot, tile);
	}

	@Override
	public void onRemoval(int slot, Object tile) {
		IFarmHousing farmHousing = getCircuitable(tile);
		if (farmHousing == null) {
			return;
		}

		farmHousing.resetFarmLogic(FarmDirection.values()[slot]);
	}

	@Override
	public void onTick(int slot, Object tile) {

	}

	@Override
	public void addTooltip(List<String> list) {
	}
}
