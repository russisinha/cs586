//strategy pattern

package strategy;

import data.*;

public class storeprices_gp1 extends storeprices_abstract {

	@Override
	public void StorePrices(datastore_abstract DS) {
		DS.setRprice(DS.getTemp_a());
		DS.setDprice(DS.getTemp_b());
		System.out.print("\n Prices saved.\n");
	}

}
