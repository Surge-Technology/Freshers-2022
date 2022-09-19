package akshay;

import java.util.HashMap;
class Semester {
	
	HashMap<String,Integer> marks;

	public HashMap<String, Integer> getMarks() 
	{
		return marks;
	}

	public void setMarks(HashMap<String, Integer> marks)
	{
		this.marks = marks;
	}
}
	
class Student 
{	
		HashMap<String, Semester> sem;

		public HashMap<String, Semester> getSem()
		{
			return sem;
		}

		public void setSem(HashMap<String, Semester> sem)
		{
			this.sem = sem;
		}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> myMarks = new HashMap<String, Integer>();
		HashMap<String, Semester> semMap = new HashMap<String, Semester>();

		Semester sem1 = new Semester();
		myMarks.put("maths", 70);
		myMarks.put("epl", 60);
		myMarks.put("english", 80);
		myMarks.put("cn", 90);
		sem1.setMarks(myMarks);
		semMap.put("marksForSem1", sem1);
		
		Semester sem2=new Semester();
		myMarks.put("Maths1", 74);
		myMarks.put("Chemistry", 60);
		myMarks.put("Physics", 80);
		myMarks.put("c", 90);
		sem1.setMarks(myMarks);
		semMap.put("marksForSem2", sem2);
		
		HashMap<String, Student> stuMap = new HashMap<String, Student>();
		Student s1 = new Student();
		Student s2=new Student();
		
		s1.sem = semMap;
		s2.sem=semMap;
		
		stuMap.put("Shreyas", s1);
		stuMap.put("lia",s2);
		
		System.out.println("Student hashmap.........." + stuMap);
		System.out.println("Student name.."+stuMap);
		//Get Values of marks
		
		Student firstStudent = stuMap.get("Shreyas");
		Student secondStudent =stuMap.get("lia");
		
		
		HashMap<String, Semester> semisterMap = firstStudent.getSem();
		HashMap<String, Semester> semisterMap1 = secondStudent.getSem();

		
		
		
		Semester marksForSem1 = semisterMap.get("marksForSem1");
		Semester marksforsem2 = semisterMap1.get("marksForSem2");
		
		
		
		HashMap<String, Integer> hh = marksForSem1.getMarks();
		HashMap<String, Integer> h1 = marksforsem2.getMarks();

		
		Integer getMark = hh.get("english");
		Integer getMark1 = h1.get("Chemistry");

		System.out.println("Marks for English......." + getMark);
		System.out.println("Marks for Chemistry......." + getMark1);

	}

	
	


	}


