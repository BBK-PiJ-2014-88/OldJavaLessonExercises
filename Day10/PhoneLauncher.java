public class PhoneLauncher{
	public static void main(String[] args){
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch(){
		SmartPhone smartPhoneTester = new SmartPhone();
		smartPhoneTester.call("999");
		smartPhoneTester.playGame();
		smartPhoneTester.ringAlarm("Wake up!");
		smartPhoneTester.printLastNumbers();
		smartPhoneTester.browseWeb("www.google.com");
		smartPhoneTester.findPosition();
	}
}