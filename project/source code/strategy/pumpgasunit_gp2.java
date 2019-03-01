//strategy pattern

package strategy;

import data.*;

public class pumpgasunit_gp2 extends pumpgasunit_abstract {

	@Override
	public void PumpGasUnit(int M, datastore_abstract DS) {
		DS.setL(DS.getL() + 1);
		DS.setTotal(DS.getPrice() * DS.getL());
		System.out.println("\n Gas unit pumped.\n");
	}

}
