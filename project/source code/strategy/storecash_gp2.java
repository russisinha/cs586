//strategy pattern

package strategy;

import data.*;

public class storecash_gp2 extends storecash_abstract {

	@Override
	public void StoreCash(datastore_abstract DS) {
		DS.setCash(DS.getTemp_cash());
		System.out.println("\n Cash stored.\n");
	}

}
