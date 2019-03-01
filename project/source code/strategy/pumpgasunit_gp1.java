//strategy pattern

package strategy;

import data.*;

public class pumpgasunit_gp1 extends pumpgasunit_abstract {

	@Override
	public void PumpGasUnit(int M, datastore_abstract DS) {
		DS.setG(DS.getG() + 1);
		DS.setTotal(DS.getPrice() * DS.getG());
		System.out.println("\n Gas unit pumped.\n");
	}

}
