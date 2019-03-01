//abstract factory pattern

package factory;

import data.*;
import strategy.*;

public class factory_gp2 extends factory_abstract {
	datastore_gp2 DS;
	cancelmsg_gp2 CM;
	displaycreditmsg_gp2 DCCM;
	displaymenu_gp2 DM;
	enterpinmsg_gp2 EPM;
	gaspumpedmsg_gp2 GPM;
	initializedata_gp2 ID;
	paymsg_gp2 PM;
	printreceipt_gp2 PR;
	pumpgasunit_gp2 PGU;
	readymsg_gp2 RM;
	rejectmsg_gp2 RJM;
	returncash_gp2 RC;
	setinitialvalues_gp2 SIV;
	setprice_gp2 SP;
	stopmsg_gp2 SM;
	storecash_gp2 SC;
	storepin_gp2 SPN;
	storeprices_gp2 SPR;
	wrongpinmsg_gp2 WPM;
	
	public datastore_gp2 getDataStore() {
		if(DS == null)
			DS = new datastore_gp2();
		
		return DS;
	}
	public cancelmsg_gp2 getCancelMsg_obj() {
		if(CM == null)
			CM = new cancelmsg_gp2();
		
		return CM;
	}
	public displaycreditmsg_gp2 getDisplayCreditMsg_obj() {
		if(DCCM == null)
			DCCM = new displaycreditmsg_gp2();
		
		return DCCM;
	}
	public displaymenu_gp2 getDisplayMenu_obj() {
		if(DM == null)
			DM = new displaymenu_gp2();
		
		return DM;
	}
	public enterpinmsg_gp2 getEnterPinMsg_obj() {
		if(EPM == null)
			EPM = new enterpinmsg_gp2();
		
		return EPM;
	}
	public gaspumpedmsg_gp2 getGasPumpedMsg_obj() {
		if(GPM == null)
			GPM = new gaspumpedmsg_gp2();
		
		return GPM;
	}
	public initializedata_gp2 getInitializeData_obj() {
		if(ID == null)
			ID = new initializedata_gp2();
		
		return ID;
	}
	public paymsg_gp2 getPayMsg_obj() {
		if(PM == null)
			PM = new paymsg_gp2();
		
		return PM;
	}
	public printreceipt_gp2 getPrintReceipt_obj() {
		if(PR == null)
			PR = new printreceipt_gp2();
		
		return PR;
	}
	public pumpgasunit_gp2 getPumpGasUnit_obj() {
		if(PGU == null)
			PGU = new pumpgasunit_gp2();
		
		return PGU;
	}
	public readymsg_gp2 getReadyMsg_obj() {
		if(RM == null)
			RM = new readymsg_gp2();
		
		return RM;
	}
	public rejectmsg_gp2 getRejectMsg_obj() {
		if(RJM == null)
			RJM = new rejectmsg_gp2();
		
		return RJM;
	}
	public returncash_gp2 getReturnCash_obj() {
		if(RC == null)
			RC = new returncash_gp2();
		
		return RC;
	}
	public setinitialvalues_gp2 getSetInitialValues_obj() {
		if(SIV == null)
			SIV = new setinitialvalues_gp2();
		
		return SIV;
	}
	public setprice_gp2 getSetPrice_obj() {
		if(SP == null)
			SP = new setprice_gp2();
		
		return SP;
	}
	public stopmsg_gp2 getStopMsg_obj() {
		if(SM == null)
			SM = new stopmsg_gp2();
		
		return SM;
	}
	public storecash_gp2 getStoreCash_obj() {
		if(SC == null)
			SC = new storecash_gp2();
		
		return SC;
	}
	public storepin_gp2 getStorePin_obj() {
		if(SPN == null)
			SPN = new storepin_gp2();
		
		return SPN;
	}
	public storeprices_gp2 getStorePrices_obj() {
		if(SPR == null)
			SPR = new storeprices_gp2();
		
		return SPR;
	}
	public wrongpinmsg_gp2 getWrongPinMsg_obj() {
		if(WPM == null)
			WPM = new wrongpinmsg_gp2();
		
		return WPM;
	}
	
}
