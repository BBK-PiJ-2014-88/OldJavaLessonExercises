public class Supermarket{


	public void addPerson(Person person){
		tillOne.insert(person);
	}
	public Person servePerson(){
		tillOne.retrieve();
	}
	public static void main(String[] args){
		Supermarket tillOne = new Supermarket();
		tillOne.launch();

	}
	public void launch(){
		PersonQueueImplemented tillOneQueue = new PersonQueueImplemented();
	}

}