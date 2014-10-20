public class Spy{
	public static int spyCount = 0;
	int spyId;

	public spyConstruct(int spyIdentification){
		this.spyID = spyIdentification;
		Spy.spyCount++;
		println("ID of this Spy: " + this.spyID);
		println("Number of spies so far: " + Spy.spyCount);
	}

	public void die{
		println("Spy " + this.spyID + " has been detected and eliminated");
		Spy.spyCount--;
		println("Number of spies so far: " + Spy.spycount);
	}
	public static void main(String[] args){

	}

}