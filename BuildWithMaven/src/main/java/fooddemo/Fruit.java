package fooddemo;

public class Fruit {
	
	private String MyName;
	
	public String getMyName() {
		return MyName;
	}

	public void setMyName(String myName) {
		MyName = myName;
	}

	public Fruit () {}
	
	public Fruit (String myName) {
		this.setMyName(myName);
	}
	
	public String talkAboutYourSelf () {
		
		String lsReturn;
		
		if (this.MyName == null || this.MyName.equals("")) {
			lsReturn = "I am a fruit.";
		} else {
			lsReturn = "Hi! My name is " + this.MyName + ". I am a fruit.";
		}
		
		return lsReturn;
	}

}
