//strategy pattern

package strategy;

public class wrongpinmsg_gp1 extends wrongpinmsg_abstract {

	@Override
	public void WrongPinMsg() {
		System.out.println("\n Incorrect PIN. Transaction cancelled.\n");
	}

}
