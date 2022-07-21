
// Project 2: Map Exercise

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapExercise {

	public static void main(String[] args) {
//		1. creates hash map of vehicles (model : company)
//		2. ask customer for model.
//		3. return statement about availability
		
		
		//NOTE: used a TreeMap over HashMap to make key lookup case-insensitive
			//With HashMap, inputting "CAMRY' or "camry" will not get the value "Toyota"
		Map<String, String> dealership = new TreeMap <>(String.CASE_INSENSITIVE_ORDER);
		//adding key:values to map
		dealership.put("Camry", "Toyota");
		dealership.put("Accord", "Honda");
		dealership.put("Silverado", "Chevy");
		dealership.put("Wrangler", "Jeep");
		dealership.put("Escalade", "Cadillac");
	
		
		try(Scanner input = new Scanner(System.in)){
			//asks for system input 
			System.out.println("Which car model are you interested in?");
			String customer = input.nextLine();
			
			//if else to check for key and get value if true
			if (dealership.containsKey(customer)) {
				System.out.printf("Interested in our %s? Our %s selection is over here!", customer, dealership.get(customer));
			} else {
				System.out.printf("Sorry, it seems we don't have any %s models at the moment.", customer);
			}
			
		};

	};

};
