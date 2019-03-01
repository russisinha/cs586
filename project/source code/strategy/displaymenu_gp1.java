//strategy pattern

package strategy;

public class displaymenu_gp1 extends displaymenu_abstract {

	@Override
	public void DisplayMenu() {
		System.out.println("\n Select gas type:");
		System.out.println(" ---------");
		System.out.println(" Regular");
		System.out.println(" Diesel");
		System.out.println(" ---------\n");
	}

}
