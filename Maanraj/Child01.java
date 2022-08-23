class Parent01{
void add(){

System.out.println("hello");
}

}

public class Child01 extends Parent01{
void sub(){
System.out.println("hi");
}

public static void main(String[]args)
{
Child01 c2 = new Child01();
c2.add();
c2.sub();

}

}