public class Billing {
	private String billID;
	private String billingDate;
	
	private Patient patient;
	private Doctor doctor;
	private Pharmacist pharmacist;
	private Prescription prescription;
	
	private int totalPrice;

	public Billing(String billID, String billingDate, Patient patient, Doctor doctor, Pharmacist pharmacist, Prescription prescription, int totalPrice){
		this.billID = billID;
		this.billingDate = billingDate;
		
		this.patient = patient;
		this.doctor = doctor;
		this.pharmacist = pharmacist;
		this.prescription = prescription;

		this.totalPrice = totalPrice;
	}
	
	public String getbillID() {
		return billID;
	}
	
	public String billingDate() {
		return billingDate;
	}
	
	public Patient patient() {
		return patient;
	}
	
	public Doctor doctor() {
		return doctor;
	}
	
	public Pharmacist pharmacist() {
		return pharmacist;
	}

	public Prescription prescription() {
		return prescription;
	}
	
	public int totalPrice() {
		return totalPrice;
	}
    
}
