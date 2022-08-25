package test1;


class Bank  {
    int accNo;
    static String IFSC;
    
    void accept(int a, String b) {
        accNo=a;
        IFSC=b;
    }
    void display(){
        System.out.println(accNo+" "+IFSC);
    }
    static void fun() {
        System.out.println(IFSC);
        
    }
}
public class Access{
    public static void main(String[] args) {
    	
    	//rtyuio
    	
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.accept(123,"HDFC123");
        b1.display();
        Bank.fun();
        b2.accept(345,"kotak567");
        b2.display();
    }
}