package gaspump_processor;

import data.*;
import factory.*;
import strategy.*;

public class output_processor {
	factory_abstract AF;
	datastore_abstract DS;
	cancelmsg_abstract CM;
	displaycreditmsg_abstract DCM;
	displaymenu_abstract DM;
	enterpinmsg_abstract EPM;
	gaspumpedmsg_abstract GPM;
	initializedata_abstract ID;
	paymsg_abstract PM;
	printreceipt_abstract PR;
	pumpgasunit_abstract PGU;
	readymsg_abstract RM;
	rejectmsg_abstract RJM;
	returncash_abstract RC;
	setinitialvalues_abstract SIV;
	setprice_abstract SP;
	stopmsg_abstract SM;
	storecash_abstract SC;
	storepin_abstract SPN;
	storeprices_abstract SPR;
	wrongpinmsg_abstract WPM;
	
	public void setFactory(factory_abstract abs_fact) {
		AF = abs_fact;
	}
	public void setDataStore(datastore_abstract ds) {
		DS = ds;
	}

	public void StorePrices() { // stores price(s) for the gas from the temporary data store
		SPR = AF.getStorePrices_obj();
		SPR.StorePrices(DS);
	}

	public void PayMsg() { // displays a type of payment method
		PM = AF.getPayMsg_obj();
		PM.PayMsg();
	}

	public void StoreCash() { // stores cash from the temporary data store
		SC = AF.getStoreCash_obj();
		SC.StoreCash(DS);
	}
	
	public void DisplayCreditMsg() { //wait for approval
		DCM = AF.getDisplayCreditMsg_obj();
		DCM.DisplayCreditMsg();
	}

	public void DisplayMenu() { // display a menu with a list of selections
		DM = AF.getDisplayMenu_obj();
		DM.DisplayMenu();
	}

	public void RejectMsg() { // displays credit card not approved message
		RJM = AF.getRejectMsg_obj();
		RJM.RejectMsg();
	}

	public void SetPrice(int g) { // set the price for the gas identified by g identifier as in SelectGas(int g);
		SP = AF.getSetPrice_obj();
		SP.SetPrice(g, DS);
	}

	public void ReadyMsg() { // displays the ready for pumping message
		RM = AF.getReadyMsg_obj();
		RM.ReadyMsg();
	}

	public void SetInitialValues(int M) { // set G (or L) and total to 0;
		SIV = AF.getSetInitialValues_obj();
		SIV.SetInitialValues(M, DS);
	}

	public void PumpGasUnit(int M) { // disposes unit of gas and counts # of units disposed
		PGU = AF.getPumpGasUnit_obj();
		PGU.PumpGasUnit(M, DS);
	}

	public void GasPumpedMsg(int M) { // displays the amount of disposed gas
		GPM = AF.getGasPumpedMsg_obj();
		GPM.GasPumpedMsg(M, DS);
	}

	public void StopMsg() { // stop pump message and receipt? msg (optionally)
		SM = AF.getStopMsg_obj();
		SM.StopMsg();
	}

	public void PrintReceipt() { // print a receipt
		PR = AF.getPrintReceipt_obj();
		PR.PrintReceipt(DS);
	}

	public void CancelMsg() { // displays a cancellation message
		CM = AF.getCancelMsg_obj();
		CM.CancelMsg();
	}

	public void ReturnCash() { // returns the remaining cash
		RC = AF.getReturnCash_obj();
		RC.ReturnCash(DS);
	}

	public void WrongPinMsg() { // displays incorrect pin message
		WPM = AF.getWrongPinMsg_obj();
		WPM.WrongPinMsg();
	}

	public void StorePin() { // stores the pin from the temporary data store
		SPN = AF.getStorePin_obj();
		SPN.StorePin(DS);
	}

	public void EnterPinMsg() { // displays a message to enter pin
		EPM = AF.getEnterPinMsg_obj();
		EPM.EnterPinMsg();
	}

	public void InitializeData() { // set the value of price and cash to 0
		ID = AF.getInitializeData_obj();
		ID.InitializeData(DS);
	}

}
