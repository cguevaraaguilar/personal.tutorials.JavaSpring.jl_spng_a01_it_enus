package fooddemo;

import java.util.List;
import java.util.Map;

public class HelloFruitList {
	
	private List<String> fruitList;
	private Map<String, String> fruitNameMap;

	public List<String> getFruitList() {
		return fruitList;
	}

	public void setFruitList(List<String> fruitList) {
		this.fruitList = fruitList;
	}

	public Map<String, String> getFruitNameMap() {
		return fruitNameMap;
	}

	public void setFruitNameMap(Map<String, String> fruitNameMap) {
		this.fruitNameMap = fruitNameMap;
	}
	
	public String talkAboutYourself () {
		
		String speech = "Hi I am a fruit. I come from plants or trees with seeds";
		
		if (this.fruitList != null) {
			
			for (String fruit : this.fruitList) {
				speech += ". name: " + fruit;
			}
		}
		
		if (this.fruitNameMap != null) {
			speech += "\nMap: ";
			
			for (Map.Entry<String, String> fruitName : this.fruitNameMap.entrySet()) {
				speech += fruitName.getKey() + " ==> " + fruitName.getValue() + " :: ";
			}
		}
		
		return (speech);
	}

}
