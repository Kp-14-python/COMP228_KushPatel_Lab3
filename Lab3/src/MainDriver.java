import java.util.Scanner;

public class MainDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== HOSPITAL MANAGEMENT SYSTEM - USER INPUT ===");
        
        // 1. Taking input for Doctor
        System.out.println("\n--- Enter Doctor Details ---");
        System.out.print("Enter Person ID: ");
        String docId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String docName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int docAge = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Specialization: ");
        String docSpec = scanner.nextLine();
        System.out.print("Enter Consultation Fee: ");
        double docFee = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Doctor doc = new Doctor(docId, docName, docAge, docSpec, docFee);

        // 2. Taking input for Nurse
        System.out.println("\n--- Enter Nurse Details ---");
        System.out.print("Enter Person ID: ");
        String nurseId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String nurseName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int nurseAge = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine();
        System.out.print("Enter Shift: ");
        String shift = scanner.nextLine();

        Nurse nurse = new Nurse(nurseId, nurseName, nurseAge, dept, shift);

        // 3. Taking input for Surgeon
        System.out.println("\n--- Enter Surgeon Details ---");
        System.out.print("Enter Person ID: ");
        String surgId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String surgName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int surgAge = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Specialization: ");
        String surgSpec = scanner.nextLine();
        System.out.print("Enter Consultation Fee: ");
        double surgFee = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Surgery Type: ");
        String surgeryType = scanner.nextLine();
        System.out.print("Enter Operating Room: ");
        String opRoom = scanner.nextLine();

        Surgeon surgeon = new Surgeon(surgId, surgName, surgAge, surgSpec, surgFee, surgeryType, opRoom);

        // 4. Taking input for Emergency Doctor
        System.out.println("\n--- Enter Emergency Doctor Details ---");
        System.out.print("Enter Person ID: ");
        String erId = scanner.nextLine();
        System.out.print("Enter Name: ");
        String erName = scanner.nextLine();
        System.out.print("Enter Age: ");
        int erAge = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Specialization: ");
        String erSpec = scanner.nextLine();
        System.out.print("Enter Consultation Fee: ");
        double erFee = scanner.nextDouble();
        System.out.print("Enter Priority Level (e.g., 1, 2, 3): ");
        int priority = scanner.nextInt();

        EmergencyDoctor erDoc = new EmergencyDoctor(erId, erName, erAge, erSpec, erFee, priority);

        scanner.close();

        // ==================== EXECUTION & DEMONSTRATION ====================

        //categorize my output in different methods
        System.out.println("\n=== 1. SPECIALIZED METHODS ===");
        //Calling object 	
        doc.diagnosePatient();
        nurse.assistPatient();
        surgeon.performSurgery();
        erDoc.handleEmergency();

        //It heps to override from parent class and add new statement in our child class 
        System.out.println("\n=== 2.METHOD OVERRIDING (@Override) ===");
        doc.performDuties();
        nurse.performDuties();
        surgeon.performDuties();
        erDoc.performDuties();

        //It uses when we have same variable name in different class 
        System.out.println("\n=== 3.POLYMORPHISM (Person References) ===");
        Person person;

        person = doc;
        person.performDuties();

        person = nurse;
        person.performDuties();

        person = surgeon;
        person.performDuties();

        person = erDoc;
        person.performDuties();

        System.out.println("\n=== 4. INTERFACE METHODS ===");
        erDoc.prescribeMedication();
        erDoc.generateBill();
    }
}