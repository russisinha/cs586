//strategy pattern

package strategy;

import data.*;

public class storeprices_gp2 extends storeprices_abstract {

	@Override
	public void StorePrices(datastore_abstract DS) {
		DS.setSprice(DS.getTemp_a());
		DS.setRprice(DS.getTemp_b());
		DS.setPprice(DS.getTemp_c());
		System.out.print("\n Prices saved.\n");
	}

}
