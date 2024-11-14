package org.LernSomthing;
import java.util.ArrayList;
import java.util.List;

public class StudentSchedule {
	
	 private ArrayList<String> listOfSubjects = new ArrayList<>();
	 
	 public void addSubject(DayOfWeek day,String subject) {
		 if(!listOfSubjects.contains(subject)) {
			 listOfSubjects.add(day + ": " + subject);
		 }
	 }
	 
	 public void getListOfSubjects() {
		 System.out.println("Student schedule\n=================");
		if(!listOfSubjects.isEmpty()) {
			 for(int i = 0; i < listOfSubjects.size(); i++) {
				 System.out.println(listOfSubjects.get(i));
			 }
		}else {
			 System.out.println("----List is void----");
		}
		 System.out.println("=================");
	 }
}
