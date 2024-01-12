package lambda;

import java.util.ArrayList;
import java.util.List;


public class CascadingForEachExample {
	
	public static void main(String[] args) {
		Address billingAddress1 = new Address(10,"Downing Street","678XA");
		Address shippingAddress1 = new Address(17,"Beverly Hills","900AX");
		
		Address billingAddress2 = new Address(20,"5th cross street","678XA");
		Address shippingAddress2 = new Address(127,"Madison sqaure","900AX");
		
		ArrayList arList1 = new ArrayList();
		arList1.add(billingAddress1);
		arList1.add(shippingAddress1);
		
		ArrayList arList2 = new ArrayList();
		arList2.add(billingAddress2);
		arList2.add(shippingAddress2);
		
		
		AddressInfo addressInfo1 = new AddressInfo("Albert",arList1);
		AddressInfo addressInfo2 = new AddressInfo("Paul",arList2);
		
		List<AddressInfo> addressInfoList1 = new ArrayList<>();
		addressInfoList1.add(addressInfo1);
		
		List<AddressInfo> addressInfoList2 = new ArrayList<>();
		addressInfoList2.add(addressInfo2);
		
		CustomerInfo custInfo = new CustomerInfo (100,addressInfoList1);
		//CustomerInfo cust2 = new CustomerInfo (200,addressInfoList2);
		
		custInfo.getAddressInfo().forEach(addressInfo -> {
			addressInfo.getAddress().forEach(address ->{
				System.err.println("------------xxxxxx-----------");
				System.err.println("Door No"+address.getDoorNo());
				System.err.println("Street No"+address.getStreet());
				System.err.println("Pin No"+address.getPin());
			});
		});
		
		
		
		
	}
	
}


class CustomerInfo {
    int id;
    List<AddressInfo> addressInfo;

    public List<AddressInfo> getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(List<AddressInfo> addressInfo) {
		this.addressInfo = addressInfo;
	}

	public CustomerInfo(int id, List<AddressInfo> addressInfoList1) {
        this.id = id;
        this.addressInfo = addressInfoList1;
    }  

}

class AddressInfo {
    String custName;
    List<Address> address;

	
	  public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	public AddressInfo(String custName, List<Address> address) { this.custName =
	  custName; this.address = address; }
	 
}

class Address{
	int doorNo;
	String street;
	String pin;
	
	public Address(int doorNo, String street,String pin) {
		this.doorNo = doorNo;
		this.street = street;
		this.pin = pin;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}







