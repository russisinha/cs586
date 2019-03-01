//strategy pattern

package strategy;

import data.*;

public class printreceipt_gp2 extends printreceipt_abstract {

	@Override
	public void PrintReceipt(datastore_abstract DS) {
		System.out.println("\n Receipt");
		System.out.println(" -------------");
		System.out.println(" L = " + DS.getL());
		System.out.println(" Total = " + DS.getTotal());
		System.out.println(" -------------\n");
	}

}
