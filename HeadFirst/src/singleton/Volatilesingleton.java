package singleton;

class Volatilesingleton {
	private volatile static Volatilesingleton volatilesingleton;
	
	private Volatilesingleton() {};
	static Volatilesingleton getInstance() {
		if (volatilesingleton == null) {
			synchronized (Volatilesingleton.class) {
				if (volatilesingleton == null) {
					volatilesingleton = new Volatilesingleton();
				}
			}
		}
		return volatilesingleton;
	}
}
