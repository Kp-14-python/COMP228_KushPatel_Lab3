//This is the inheritant from person (child class)
class Doctor extends Person {
    protected String specialization;
    protected double consultationFee;

    //
    public Doctor(String personId, String name, int age, String specialization, double consultationFee) {
        super(personId, name, age); // Using super() constructor
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    //SPECIALIZED METHODS 
    public void diagnosePatient() {
        System.out.println("Dr. " + name + " is diagnosing a patient in " + specialization + ".");
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + name + " is consulting patients and reviewing medical histories.");
    }

	public void prescribeMedication() {
		// TODO Auto-generated method stub
		
	}

	public void generateBill() {
		// TODO Auto-generated method stub
		
	}
}