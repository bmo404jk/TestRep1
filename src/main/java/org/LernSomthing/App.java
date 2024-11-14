package org.LernSomthing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
	  //loop();
	  StudentSchedule studentSchedule = new StudentSchedule();
	  studentSchedule.addSubject(DayOfWeek.MONDAY, "Math");
	  studentSchedule.addSubject(DayOfWeek.FRIDAY, "Physics");
	  studentSchedule.addSubject(DayOfWeek.SUNDAY, "History");
	  studentSchedule.addSubject(DayOfWeek.TUESDAY, "Biology");
	  studentSchedule.addSubject(DayOfWeek.WEDNESDAY, "Art");
	  studentSchedule.getListOfSubjects();
	  loop();
  }
public static void loop() {
	  Map<String,Integer> myMap = new HashMap<>();
	  Scanner scanner = new Scanner(System.in);
	  
	  System.out.println("Input map size: ");
	  int sizeMap = scanner.nextInt();
	  scanner.nextLine();   
	  
	 for(int i = 0; i < sizeMap; i++) {
		 System.out.println("Enter key value № " + i);
		 String key = scanner.nextLine().trim();
		    
		 System.out.println("Enter a value for the values № " + i);
		 int value = scanner.nextInt();
		 scanner.nextLine();   
		 
		myMap.put(key, value);
	 }
	 System.out.println("\n");
	 for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
     }
	 System.out.println("Map size---> " + myMap.size());
	 scanner.close();
  }
}

