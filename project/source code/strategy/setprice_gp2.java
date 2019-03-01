//strategy pattern

package strategy;

import data.*;

public class setprice_gp2 extends setprice_abstract {

	@Override
	public void SetPrice(int g, datastore_abstract DS) {
		if (g == 1) {
			//regular:1
			DS.setPrice(DS.getRprice());
		}
		else if (g == 2) {
			//super:2
			DS.setPrice(DS.getSprice());
		}
		else if (g == 3) {
			//premium:3
			DS.setPrice(DS.getPprice());
		}
		System.out.println("\n Gas price has been set.\n");
		
	}

}
