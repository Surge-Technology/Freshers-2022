package abstraction;

abstract class Bike {
	abstract void run();
}

class KTM extends Bike {
	void run() {
		System.out.println("running safely");
	}
}
