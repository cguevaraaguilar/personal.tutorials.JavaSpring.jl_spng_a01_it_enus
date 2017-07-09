package fooddemo;

public class Vegetable {
	
	private String MyName;
	
	public String getMyName() {
		return MyName;
	}

	public void setMyName(String myName) {
		MyName = myName;
	}

	public String talkAboutYourSelf () {
			
			String lsReturn;
			
			if (this.MyName == null || this.MyName.equals("")) {
				lsReturn = "I am a vegetable.";
			} else {
				lsReturn = "Hi! My name is " + this.MyName + ". I am a vegetable.";
			}
			
			return lsReturn;
		}

}
