package sep15;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> myMarks = new HashMap<String, Integer>();
		HashMap<String, Semester> semMap = new HashMap<String, Semester>();

		Semester sem1 = new Semester();
		myMarks.put("ssc", 70);
		myMarks.put("GD", 60);
		myMarks.put("cpr", 80);
		myMarks.put("Cad", 90);
		sem1.setMarks(myMarks);
		semMap.put("marksForSem1", sem1);
		Semester sem2 = new Semester();
		myMarks.put("Hmt", 80);
		myMarks.put("Mom", 90);
		myMarks.put("Edc", 89);
		myMarks.put("Fom", 60);
		sem2.setMarks(myMarks);
		HashMap<String, Student> stuMap = new HashMap<String, Student>();
		Student s1 = new Student();
		s1.sem = semMap;
		stuMap.put("Shreyas", s1);
		//System.out.println("Student hashmap.........." + stuMap);
		Student firstStudent = stuMap.get("Shreyas");
		HashMap<String, Semester> semisterMap = firstStudent.getSem();
		Semester marksForSem1 = semisterMap.get("marksForSem1");
		HashMap<String, Integer> hh = marksForSem1.getMarks();
		Integer getMark = hh.get("cad");
		System.out.println("Marks for cad" + getMark);
	}
}
