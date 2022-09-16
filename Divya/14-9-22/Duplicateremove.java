import java.util.HashMap;
	import java.util.Map.Entry;
public class Duplicateremove {
		    public HashMap<Integer,String> company(){
		        HashMap<Integer,String> h1 = new HashMap<>();
		        HashMap<String,Integer> h2= new HashMap<>();
		        h1.put(1, "TCS");
		        h1.put(2, "Infosys");
		        h1.put(3, "Capg");
		        h1.put(4, "Wipro");
		        h1.put(5, "HCL");
		        h1.put(6, "TCS");
		        System.out.println(h1);
		        System.out.println(h1.keySet());
		        System.out.println(h1.values());
		        String x,y;
		        
		        for(Entry<Integer,String> entry : h1.entrySet()) {
		            //System.out.println(entry.getKey()+" "+entry.getValue());
		            x=entry.getValue();
		            int count =0;
		            for(Entry<Integer,String> entryset : h1.entrySet()) {
		            y=entryset.getValue();
		            //System.out.println("addition:"+x+y);
		          
		            if(x==y) {
		              count++;
		            }
		            h2.put(y, count);
		            System.out.println(h2);
		            
		        }
		        System.out.println(x+" "+count);
		        
		        }
		        return h1;
		        
		    }
		    
		    public static void main(String[] args) {
		        Duplicateremove list = new Duplicateremove();
		        list.company();
		    }



		}
}
