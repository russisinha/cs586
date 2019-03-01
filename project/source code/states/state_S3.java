//state pattern

package states;

import gaspump_processor.*;

public class state_S3 extends state_abstract {
	
	public state_S3(MDAEFSM md, output_processor op) {
		super(md, op);
	}

	public void SelectGas(int g) {
		OP.SetPrice(g);
	}
	
	public void Continue() {
		MD.changestate(4);
	}
	
	public void Cancel( ) {
		OP.CancelMsg();
		OP.ReturnCash();
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PayType(int t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StartPump(int M) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pump(int M) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CorrectPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectPin() {
		// TODO Auto-generated method stub
		
	}
	
}
