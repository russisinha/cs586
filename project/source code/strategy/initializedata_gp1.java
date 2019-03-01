//strategy pattern

package strategy;

import data.*;

public class initializedata_gp1 extends initializedata_abstract {

	@Override
	public void InitializeData(datastore_abstract DS) {
		DS.setPrice(0);
		System.out.println("\n Data initialized \n");
	}

}
