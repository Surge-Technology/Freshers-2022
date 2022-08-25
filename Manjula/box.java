 public class box
{
int length;
int breadth;
int height;
public void show()
{
	System.out.println(length+breadth+height);
	System.out.println("box name");
}
class test{
public static void main(String[] args)
{
box b=new box();
b.show();
}
}
}