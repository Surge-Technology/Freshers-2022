package arraylist.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//public class Custom {
//	
//}
class CustomSorting1 implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        
        if(o1.length()>o2.length()) {
            return -1;
        }
        else {
            return 1;
        }    
        
    }

}



 