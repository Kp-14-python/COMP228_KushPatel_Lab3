//multi inheritance class from doctor class 

class EmergencyDoctor extends Doctor {
    private int priorityLevel;

    interface MedicalProfessional {
        void prescribeMedication();
    }
    public EmergencyDoctor(String personId, String name, int age, String specialization, double consultationFee, int priorityLevel) {
        super(personId, name, age, specialization, consultationFee); //Using super() constructor
        this.priorityLevel = priorityLevel;
    }

    ////SPECIALIZED METHODS 
    public void handleEmergency() {
        System.out.println("Emergency Dr. " + name + " is stabilizing a critical trauma patient (Priority Level: " + priorityLevel + ").");
    }

    @Override
    public void prescribeMedication() {
        System.out.println("Emergency Dr. " + name + " is urgently prescribing emergency medications.");
    }

    //INTERFACE METHODE
    @Override
    public void generateBill() {
        System.out.println("Emergency Dr. " + name + " is generating the emergency room bill. Base Fee: $" + consultationFee);
    }

  //INTERFACE METHODE
    @Override
    public void performDuties() {
        System.out.println("Emergency Dr. " + name + " is managing the ER triage and responding to trauma codes.");
    }
}
