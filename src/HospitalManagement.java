public class HospitalManagement {
    
    ArrayList<patient> list = new ArrayList<patient>();
	
	public void showPatient() {
		for(int i=0; i<list.size(); i++) {
		    System.out.println((i + 1) + ". " + list.get(i).patientName);
			System.out.print(list.get(i).patientID);
			System.out.print(list.get(i).doctorID);
			System.out.print(list.get(i).medicineList);
       }
	}
	
	public void selectPatient() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of the patient to select: ");
		
        int selection = scanner.nextInt();
        if (selection > 0 && selection <= list.size()) {    	
        	System.out.print(list.get(selection - 1));
        } 
        
        else {
            System.out.println("Invalid selection");
        }
        
        isConsulted = True;
	}
    
    
    
    
    
    public static void main(String[] args) throws Exception {

    System.out.println("Hello World");
    
    }
}
