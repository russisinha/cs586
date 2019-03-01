//strategy pattern

package strategy;

import data.*;

public class setprice_gp1 extends setprice_abstract {

	@Override
	public void SetPrice(int g, datastore_abstract DS) {
		if (g == 1) {
			//regular:1
			DS.setPrice(DS.getRprice());
		}
		else if (g == 4) {
			//diesel:4
			DS.setPrice(DS.getDprice());
		}
		System.out.println("\n Gas price has been set.\n");

	}

}
