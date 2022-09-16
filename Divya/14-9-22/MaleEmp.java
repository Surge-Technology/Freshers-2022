import java.util.ArrayList;
import java.util.List;

public class MaleEmp<E> {
    List<E> getMaleEmpName(){
       List<E> list1 = new ArrayList<>();
       E m1 = new E();
       m1.setemp_id(1000);
       //m1.setemp_name("rutik");
       list1.add(m1);
       
       E m2 = m1;
       m2.setemp_id(1200);
       //m2.setemp_name("aditya");
       list1.add(m2);
   
       
   
           System.out.println(m1==m2);
           System.out.println(m1.hashCode());
           System.out.println(m2.hashCode());
           System.out.println(m1.equals(m2));
       return list1;
       
   }
}