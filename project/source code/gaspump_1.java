
import data.*;
import factory.*;
import gaspump_processor.*;

public class gaspump_1 {
	factory_abstract AF;		//store pointer to abstract factory for GP1
	datastore_abstract DS;		//store pointer to datastore for GP1
	MDAEFSM MD;					//store pointer to MDA-EFSM
	
	//set MDAEFSM pointer to object created in driver
	public void set_MDAEFSM(MDAEFSM md) {
		MD = md;
	}
	
	//set GP1 factory pointer to object created in driver
	public void set_factory(factory_abstract abs_fact) {
		AF = abs_fact;
	}
	
	//get datastore for GP1 from abstract factory
	public void set_datestore() {
		DS = AF.getDataStore();
	}
	
	public void Activate(float a, float b) {
		if ((a > 0) && (b > 0)) {
			DS.setTemp_a(a);
			DS.setTemp_b(b);
			MD.Activate();
		}
	}
	
	public void Start() {
		MD.Start();
	}
	
	public void PayCredit() {
		MD.PayType(1);
	}
	
	public void Reject() {
		MD.Reject();
	}
	
	public void PayDebit(String p) {
		DS.setTemp_p(p);
		MD.PayType(3);
	}
	
	public void Pin(String x) {
		if (DS.getPin().equals(x)) 
			MD.CorrectPin();
		else 
			MD.IncorrectPin();
	}
	
	public void Cancel() {
		MD.Cancel();
	}
	
	public void Approved() {
		MD.Approved();
	}
	
	public void Diesel() {
		MD.SelectGas(4);
	}
	
	public void Regular() {
		MD.SelectGas(1);
	}
	
	public void StartPump() {
		if (DS.getPrice() > 0) {
			MD.Continue();
			MD.StartPump();
		}
	} 
	
	public void PumpGallon() {
		MD.Pump(); 
	}
	
	public void StopPump() {
		MD.StopPump();
		MD.Receipt();
	}
	
	public void FullTank() {
		MD.StopPump();
		MD.Receipt();
	}
	
}
