package data;

public abstract class datastore_abstract {
	
	//get, set methods for variables common for GasPump 1 and GasPump 2  
	public abstract float getTemp_a();
	public abstract void setTemp_a(float temp_a);
	public abstract float getTemp_b();
	public abstract void setTemp_b(float temp_b);
	public abstract float getPrice();
	public abstract void setPrice(float price);
	public abstract float getTotal();
	public abstract void setTotal(float total);
	public abstract float getRprice();
	public abstract void setRprice(float rprice);
	
	//get, set methods for GasPump 1 variables 
	public abstract String getTemp_p();
	public abstract void setTemp_p(String temp_p);
	public abstract String getPin();
	public abstract void setPin(String pin);
	public abstract int getG();
	public abstract void setG(int g);
	public abstract float getDprice();
	public abstract void setDprice(float dprice);
	
	//get, set methods for GasPump 2 variables 
	public abstract float getTemp_c();
	public abstract void setTemp_c(float temp_c);
	public abstract float getTemp_cash();
	public abstract void setTemp_cash(float temp_cash);
	public abstract float getSprice();
	public abstract void setSprice(float sprice);
	public abstract float getPprice();
	public abstract void setPprice(float pprice);
	public abstract float getCash();
	public abstract void setCash(float cash);
	public abstract int getL();
	public abstract void setL(int l);
	
}
