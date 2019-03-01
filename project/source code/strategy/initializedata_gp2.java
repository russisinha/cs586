//strategy pattern

package strategy;

import data.*;

public class initializedata_gp2 extends initializedata_abstract {

	@Override
	public void InitializeData(datastore_abstract DS) {
		DS.setPrice(0);
		DS.setCash(0);
		System.out.println("\n Data initialized \n");
	}

}
