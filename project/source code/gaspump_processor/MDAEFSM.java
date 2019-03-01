package gaspump_processor;

import states.*;

public class MDAEFSM {
	
	private int M;
	state_abstract ST;
	state_abstract state_list[]; 
	
	public void setStateList(state_abstract s_list[]) {
		this.state_list = s_list;
		ST = state_list[8];
	}
	
	public void changestate(int index) {
		ST = state_list[index];
		System.out.println("state changed to = " + index);		
	}

	public void Activate() {
		ST.Activate();
	}

	public void Start() {
		M = 1;
		ST.Start();
	}

	public void PayType(int t) {
		if(t == 2)
			M = 0;
		
		ST.PayType(t);
	}

	public void Reject() {
		ST.Reject();
	}

	public void Cancel() {
		ST.Cancel();
	}

	public void Approved() {
		ST.Approved();
	}

	public void StartPump() {
		ST.StartPump(M);
	}

	public void Pump() {
		ST.Pump(M);
	}

	public void StopPump() {
		ST.StopPump();
	}

	public void SelectGas(int g) {
		ST.SelectGas(g);
	}

	public void Receipt() {
		ST.Receipt();
	}

	public void NoReceipt() {
		ST.NoReceipt();
	}

	public void CorrectPin() {
		ST.CorrectPin();
	}

	public void IncorrectPin() {
		ST.IncorrectPin();
	}

	public void Continue() {
		ST.Continue();
	}
	
}
