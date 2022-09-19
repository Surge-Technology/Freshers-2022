package september16;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String id, name,email;
	private long phone;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
class Address{
	private String houseNo, street, city, state;
	private int pincode;
	
	public String getHouseNo() {
		return this.houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	private List<Documents> listOfDocs;

	public List<Documents> getListOfDocs() {
		return listOfDocs;
	}
	public void setListOfDocs(List<Documents> listOfDocs) {
		this.listOfDocs = listOfDocs;
	}
	
}
class Documents{
	private String documentName, documentID;

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getDocumentID() {
		return documentID;
	}

	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}
}
class Main{
	
	static Employee parentMethod() {
		Employee emp = new Employee();
		emp.setId("Psc107");
		emp.setEmail("sts172@surgetechinc.in");
		emp.setName("maanraj k");
		emp.setPhone(755038464);
		
		Address ad = new Address();
		ad.setHouseNo("46");
		ad.setStreet(" mariamman street");
		ad.setCity("redhill");
		ad.setState("tamilnadu");
		ad.setPincode(600002);
		
		emp.setAddress(ad);
		
		List<Documents> listOfDocuments = new ArrayList<Documents>();
		
		Documents docs1 = new Documents();
		docs1.setDocumentName("Aadhar No");
		docs1.setDocumentID("2233 2113 1212 ");
		listOfDocuments.add(docs1);
		
		Documents docs2 = new Documents();
		docs2.setDocumentName("Pan No");
		docs2.setDocumentID("IOBKY3244L");
		listOfDocuments.add(docs2);
		
		Documents docs3 = new Documents();
		docs3.setDocumentName("Passport");
		docs3.setDocumentID("435838");
		listOfDocuments.add(docs3);
		
		ad.setListOfDocs(listOfDocuments);
		
		return emp;
	}
	
	public static void main(String[] args) {

		System.out.println("Employee Details : ");
		System.out.println("Employee ID : "+parentMethod().getId());
		System.out.println("Name : "+parentMethod().getName());
		System.out.println("Email : "+parentMethod().getEmail());
		System.out.println("Phone Number : "+parentMethod().getPhone());
		
		Address ad = parentMethod().getAddress();
		System.out.println("Address:");
		System.out.println("House No : "+ad.getHouseNo());
		System.out.println("Street Name : "+ad.getStreet());
		System.out.println("City : "+ad.getCity());
		System.out.println("State : "+ad.getState());
		System.out.println("Pin code : "+ad.getPincode());
		
		List<Documents> docs = ad.getListOfDocs();
		System.out.println("List of Mandatory Document Details :");
		for(int i = 0; i < docs.size(); i++) {
			System.out.println(docs.get(i).getDocumentName()+" : "+docs.get(i).getDocumentID());
		}
		
		
	}
}
