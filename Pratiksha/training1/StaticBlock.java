package training1;

public class StaticBlock {
	
public static void main(String[] args) {
	System.out.println("Main method is calling");
}
static {
	System.out.println("Static block is calling");
}
}
