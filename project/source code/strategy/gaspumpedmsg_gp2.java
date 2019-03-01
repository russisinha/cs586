//strategy pattern

package strategy;

import data.*;

public class gaspumpedmsg_gp2 extends gaspumpedmsg_abstract {

	@Override
	public void GasPumpedMsg(int M, datastore_abstract DS) {
		if(M == 0)
			System.out.println("\n L= " + DS.getL() + "\n");
		else if(M == 1)
			System.out.println("\n L= " + DS.getL() + "; Total= " + DS.getTotal() + "\n");
	}

}
