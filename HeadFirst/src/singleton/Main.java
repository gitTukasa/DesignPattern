package singleton;

public class Main {
	public static void main(String... args) {
		/*
		 * Singleton singleton = new Singleton();
		 * Singletonのコンストラクタがprivateのためnewは出来ない
		 */
		
		PrecedingCreationSingleton singleton =
				PrecedingCreationSingleton.getInstance();
		PrecedingCreationSingleton singleton2 =
				PrecedingCreationSingleton.getInstance();
		//同一の参照の為ture
		printIsSomeReference(singleton, singleton2);
		
		SynchronizedSingleton singleton3 =
				SynchronizedSingleton.getInstance();
		SynchronizedSingleton singleton4 =
				SynchronizedSingleton.getInstance();
		//同一の参照の為ture
		printIsSomeReference(singleton3, singleton4);

		//参照先が当然違う為false
		printIsSomeReference(singleton, singleton4);
		
		Volatilesingleton singleton5 =
				Volatilesingleton.getInstance();
		Volatilesingleton singleton6 =
				Volatilesingleton.getInstance();
		
		//同一の参照の為ture
		printIsSomeReference(singleton5, singleton6);

	}
	
	/**
	 * System.out.println(obj1 == obj2) 
	 * @param obj1
	 * @param obj2
	 */
	static void printIsSomeReference(Object obj1, Object obj2) {
		boolean isSomereference = obj1 == obj2;
		System.out.println(
				obj1.getClass().getSimpleName() + " == " + obj2.getClass().getSimpleName() + " : "
				+ isSomereference);
	}

}
