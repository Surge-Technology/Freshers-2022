package september16;
import java.security.KeyStore.Entry;
import java.util.HashMap;

	  public class Employee1 
	  {
		private int    empid;
		private String empname;
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
	  
		
		public static void main(String[] args) {
			
			HashMap<Integer,Employee1> h1=new HashMap<>();
				Employee1 s= new Employee1();
				s.setEmpid(1);
				s.setEmpname("Madan");
				h1.put(1, s);
				Employee1 s1= new Employee1();
				s1.setEmpid(2);
				s1.setEmpname("maanraj");
				h1.put(2, s1);
				System.out.println(h1);	
				
				
			for(java.util.Map.Entry<Integer, Employee1> entry :h1.entrySet() ) {
				System.out.println(entry.getValue().getEmpid()+" "+entry.getValue().getEmpname());
				
			}
			
		}	
}
