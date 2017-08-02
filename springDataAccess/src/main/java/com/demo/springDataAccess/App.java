package com.demo.springDataAccess;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.model.FoodGroup;
import com.demo.model.FoodGroupDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext appContext = new FileSystemXmlApplicationContext ("appContext.xml");
    	
    	// Toma el valor de la clase definida como bean
    	FoodGroupDAO myFoodGroupDAO = appContext.getBean("foodGroupDAO", FoodGroupDAO.class);
    	
    	// Obtiene la lista de entidades.
    	List<FoodGroup> myFoodGroupList = myFoodGroupDAO.getFoodGroups();
    	
    	// Recorre la lista de grupos de comida
    	for (FoodGroup fg: myFoodGroupList) {
    		
    		System.out.println(fg.talkAboutYourself());
    	}
    	
    	((FileSystemXmlApplicationContext) appContext).close();
    }
}
