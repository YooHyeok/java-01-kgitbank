package third;

public interface ICustomerManager {
	
	void insertCustomerData();
	Customer selectCustomerData() throws InterruptedException;
	void readCustomerData(Customer cus);
	void updateCustomerData(Customer cus);
	void deleteCustomerData(Customer cus);	
	
}
