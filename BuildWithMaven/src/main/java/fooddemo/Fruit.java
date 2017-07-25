package fooddemo;

public class Fruit {
	
	private String MyName;
	
	private String definition;
	
	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

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
	
	public String talkAboutYourDefinition () {
		
		String lsReturn;
		
		if (this.definition == null || this.definition.equals("")) {
			lsReturn = "Not set";
		} else {
			lsReturn = definition;
		}
		
		return lsReturn;
	}
	
	public void destroyMethod () {
		System.out.println ("The fruit bean is about to be destroyed.");
	}
	
	public void initMethod () {
		System.out.println("The fruit bean is ready to go. " + this.definition);
	}

}
