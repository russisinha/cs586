//abstract factory pattern

package factory;

import data.*;
import strategy.*;

public class factory_gp1 extends factory_abstract {
	datastore_gp1 DS;
	cancelmsg_gp1 CM;
	displaycreditmsg_gp1 DCCM;
	displaymenu_gp1 DM;
	enterpinmsg_gp1 EPM;
	gaspumpedmsg_gp1 GPM;
	initializedata_gp1 ID;
	paymsg_gp1 PM;
	printreceipt_gp1 PR;
	pumpgasunit_gp1 PGU;
	readymsg_gp1 RM;
	rejectmsg_gp1 RJM;
	returncash_gp1 RC;
	setinitialvalues_gp1 SIV;
	setprice_gp1 SP;
	stopmsg_gp1 SM;
	storecash_gp1 SC;
	storepin_gp1 SPN;
	storeprices_gp1 SPR;
	wrongpinmsg_gp1 WPM;
	
	public datastore_gp1 getDataStore() {
		if(DS == null)
			DS = new datastore_gp1();
		
		return DS;
	}
	public cancelmsg_gp1 getCancelMsg_obj() {
		if(CM == null)
			CM = new cancelmsg_gp1();
		
		return CM;
	}
	public displaycreditmsg_gp1 getDisplayCreditMsg_obj() {
		if(DCCM == null)
			DCCM = new displaycreditmsg_gp1();
		
		return DCCM;
	}
	public displaymenu_gp1 getDisplayMenu_obj() {
		if(DM == null)
			DM = new displaymenu_gp1();
		
		return DM;
	}
	public enterpinmsg_gp1 getEnterPinMsg_obj() {
		if(EPM == null)
			EPM = new enterpinmsg_gp1();
		
		return EPM;
	}
	public gaspumpedmsg_gp1 getGasPumpedMsg_obj() {
		if(GPM == null)
			GPM = new gaspumpedmsg_gp1();
		
		return GPM;
	}
	public initializedata_gp1 getInitializeData_obj() {
		if(ID == null)
			ID = new initializedata_gp1();
		
		return ID;
	}
	public paymsg_gp1 getPayMsg_obj() {
		if(PM == null)
			PM = new paymsg_gp1();
		
		return PM;
	}
	public printreceipt_gp1 getPrintReceipt_obj() {
		if(PR == null)
			PR = new printreceipt_gp1();
		
		return PR;
	}
	public pumpgasunit_gp1 getPumpGasUnit_obj() {
		if(PGU == null)
			PGU = new pumpgasunit_gp1();
		
		return PGU;
	}
	public readymsg_gp1 getReadyMsg_obj() {
		if(RM == null)
			RM = new readymsg_gp1();
		
		return RM;
	}
	public rejectmsg_gp1 getRejectMsg_obj() {
		if(RJM == null)
			RJM = new rejectmsg_gp1();
		
		return RJM;
	}
	public returncash_gp1 getReturnCash_obj() {
		if(RC == null)
			RC = new returncash_gp1();
		
		return RC;
	}
	public setinitialvalues_gp1 getSetInitialValues_obj() {
		if(SIV == null)
			SIV = new setinitialvalues_gp1();
		
		return SIV;
	}
	public setprice_gp1 getSetPrice_obj() {
		if(SP == null)
			SP = new setprice_gp1();
		
		return SP;
	}
	public stopmsg_gp1 getStopMsg_obj() {
		if(SM == null)
			SM = new stopmsg_gp1();
		
		return SM;
	}
	public storecash_gp1 getStoreCash_obj() {
		if(SC == null)
			SC = new storecash_gp1();
		
		return SC;
	}
	public storepin_gp1 getStorePin_obj() {
		if(SPN == null)
			SPN = new storepin_gp1();
		
		return SPN;
	}
	public storeprices_gp1 getStorePrices_obj() {
		if(SPR == null)
			SPR = new storeprices_gp1();
		
		return SPR;
	}
	public wrongpinmsg_gp1 getWrongPinMsg_obj() {
		if(WPM == null)
			WPM = new wrongpinmsg_gp1();
		
		return WPM;
	}
	
}
