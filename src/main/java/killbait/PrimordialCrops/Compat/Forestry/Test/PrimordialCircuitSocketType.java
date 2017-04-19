package killbait.PrimordialCrops.Compat.Forestry.Test;

import forestry.api.circuits.ICircuitSocketType;

/**
 * Created by Jon on 16/04/2017.
 */
public class PrimordialCircuitSocketType implements ICircuitSocketType {

	private String uid;

	public PrimordialCircuitSocketType(String uid) {
		this.uid = uid;
	}

	@Override
	public String getUid() {
		return this.uid;
	}

	@Override
	public boolean equals(ICircuitSocketType socketType) {
		return uid.equals(socketType.getUid());
	}
}
