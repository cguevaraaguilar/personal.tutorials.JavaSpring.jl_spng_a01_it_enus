package fooddemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloFood {

	public static void main(String[] args) {

		// Fruit f = new Fruit ();
		// Vegetable v = new Vegetable ();
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
										
		Fruit f = appContext.getBean("fruit", Fruit.class);
		Fruit otherFruit = appContext.getBean("fruitWithName", Fruit.class);
		HelloFruitList fruitList = appContext.getBean("helloFruitList", HelloFruitList.class);
		
		Vegetable v = (Vegetable) appContext.getBean("vegetable");
		Vegetable otherVegetable = (Vegetable) appContext.getBean("vegetableWithName");
		
		((FileSystemXmlApplicationContext) appContext).close();
		
		System.out.println (f.talkAboutYourSelf());
		System.out.println (otherFruit.talkAboutYourSelf());
		
		System.out.println (fruitList.talkAboutYourself());
		
		System.out.println (v.talkAboutYourSelf());
		System.out.println (otherVegetable.talkAboutYourSelf());
	}

}
