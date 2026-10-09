
class Nurse extends Person{
	protected  String department;
    protected  String shift;

    public  Nurse(String personId, String name, int age, String department, String shift) {
        super(personId , name, age);//Using super() constructor
        this.department = department;
        this.shift = shift;
    }

    //SPECIALIZED METHODS 
    public void assistPatient() {
        System.out.println("Nurse " + name + " is assisting patients in the " + department + " department during the " + shift + " shift.");
    }

    @Override
    public void performDuties() {
        System.out.println("Nurse " + name + " is monitoring vital signs and managing patient care.");
    }
}


