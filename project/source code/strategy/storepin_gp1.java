//strategy pattern

package strategy;

import data.*;

public class storepin_gp1 extends storepin_abstract {

	@Override
	public void StorePin(datastore_abstract DS) {
		DS.setPin(DS.getTemp_p());
		System.out.println("\n P saved.\n");
	}

}
