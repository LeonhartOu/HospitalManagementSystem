import java.util.ArrayList;

public class Prescription {
	private String prescriptionID;
	private Doctor doctor;
	ArrayList <Medicine> medicineList = new ArrayList <>();
	
	public Prescription(String prescriptionID, Doctor doctor, ArrayList<Medicine> medicineList) {
		this.prescriptionID = prescriptionID;
		this.doctor = doctor;
		this.medicineList = medicineList;
	}

	public String getPrescriptionID() {
		return prescriptionID;
	}

	public void setPrescriptionID(String prescriptionID) {
		this.prescriptionID = prescriptionID;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public ArrayList<Medicine> getMedicineList() {
		return medicineList;
	}

	public void setMedicineList(ArrayList<Medicine> medicineList) {
		this.medicineList = medicineList;
	}

	
}
