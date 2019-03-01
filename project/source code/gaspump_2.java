
import data.*;
import factory.*;
import gaspump_processor.*;

public class gaspump_2 {
	factory_abstract AF;		//store pointer to abstract factory for GP2
	datastore_abstract DS;		//store pointer to datastore for GP2
	MDAEFSM MD;					//store pointer to MDA-EFSM
	
	//set MDAEFSM pointer to object created in driver
	public void set_MDAEFSM(MDAEFSM md) {
		MD = md;
	}

	//set GP2 factory pointer to object created in driver
	public void set_factory(factory_abstract abs_fact) {
		AF = abs_fact;
	}
	
	//get datastore for GP2 from abstract factory
	public void set_datestore() {
		DS = AF.getDataStore();
	}
	
	public void Activate(float a, float b, float c) {
		if ((a > 0) && (b > 0) && (c > 0)) {
			DS.setTemp_a(a);
			DS.setTemp_b(b);
			DS.setTemp_c(c);
			MD.Activate();
			MD.Start();
		}
	}
	
	public void PayCash(float c) {
		if (c > 0) {
			DS.setTemp_cash(c);
			MD.PayType(2);
		}
	}
	
	public void PayCredit() {
		MD.PayType(1);
	}
	
	public void Reject() {
		MD.Reject();
	}
	
	public void Approved() {
		MD.Approved();
	}
	
	public void Cancel() {
		MD.Cancel();
	}
	
	public void Super() {
		MD.SelectGas(2);
		MD.Continue();
	}
	
	public void Premium() {
		MD.SelectGas(3);
		MD.Continue();
	}
	
	public void Regular() {
		MD.SelectGas(1);
		MD.Continue();
	}
	
	public void StartPump() {
		MD.StartPump();
	}
	
	public void PumpLiter() {
		if (DS.getCash() > 0 && (DS.getCash() < DS.getPrice() * (DS.getL() + 1)))
			MD.StopPump();
		else 
			MD.Pump();
	}
	
	public void Stop() {
		MD.StopPump();
	}
	
	public void Receipt() {
		MD.Receipt();
	}
	
	public void NoReceipt() {
		MD.NoReceipt();
	}

	
}
