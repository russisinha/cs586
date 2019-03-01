//strategy pattern

package strategy;

import data.*;

public class setinitialvalues_gp2 extends setinitialvalues_abstract {

	@Override
	public void SetInitialValues(int M, datastore_abstract DS) {
		if(M == 0) {
			DS.setL(0);
		}
		else if(M == 1) {
			DS.setPrice((float) (DS.getPrice() * 1.1));
			DS.setL(0);
		}
		System.out.println("\n Initial value has been set\n");
		
	}

}
