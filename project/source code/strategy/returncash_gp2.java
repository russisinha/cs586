//strategy pattern

package strategy;

import data.*;

public class returncash_gp2 extends returncash_abstract {

	@Override
	public void ReturnCash(datastore_abstract DS) {
		System.out.println("\n Return cash: " + (DS.getCash() - DS.getTotal()) + "\n");
	}

}
