//Inharitant class from Doctor
class Surgeon extends Doctor {
    private String surgeryType;
    private String operatingRoom;

    //Function of surgeon 
    public Surgeon(String personId, String name, int age, String specialization, double consultationFee, String surgeryType, String operatingRoom) {
        super(personId, name, age, specialization, consultationFee); //Using super() constructor
        this.surgeryType = surgeryType;
        this.operatingRoom = operatingRoom;
    }

  //SPECIALIZED METHODS 
    public void performSurgery() {
        System.out.println("Surgeon " + name + " is performing " + surgeryType + " surgery in Operating Room " + operatingRoom + ".");
    }

    //Override function 
    @Override
    public void performDuties() {
        System.out.println("Surgeon " + name + " is conducting operations and performing pre/post-op evaluations.");
    }
}
