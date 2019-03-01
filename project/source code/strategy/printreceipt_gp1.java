//strategy pattern

package strategy;

import data.*;

public class printreceipt_gp1 extends printreceipt_abstract {

	@Override
	public void PrintReceipt(datastore_abstract DS) {
		System.out.println("\n Receipt");
		System.out.println(" -------------");
		System.out.println(" G = " + DS.getG());
		System.out.println(" Total = " + DS.getTotal());
		System.out.println(" -------------\n");
	}

}
