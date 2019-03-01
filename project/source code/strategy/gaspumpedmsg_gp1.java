//strategy pattern

package strategy;

import data.*;

public class gaspumpedmsg_gp1 extends gaspumpedmsg_abstract {

	@Override
	public void GasPumpedMsg(int M, datastore_abstract DS) {
		System.out.println("\n G= " + DS.getG() + "; Total= " + DS.getTotal() + "\n");
	}

}
