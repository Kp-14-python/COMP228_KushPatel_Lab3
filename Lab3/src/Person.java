//This is our parent class
public class Person {
	protected String personId;
    public Person(String personId, String name, int age) {
		super(); //Using super() constructor
		this.personId = personId;
		this.name = name;
		this.age = age;
	}


	protected String name;
    protected int age;
    

    //SPECIALIZED METHODS 
    public void performDuties() {
        System.out.println(name + " is performing general hospital duties.");

    }
}





