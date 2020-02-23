package observer;

public class Main {

	public static void main(String[] args) {
		System.out.println("Observer Method Start");
		// TODO 自動生成されたメソッド・スタブ
		
		Observer o = new ConcreteObserver();
		Observer o1 = new ConcreteObserver();
		Observer o2 = new ConcreteObserver();
		
		Subject sub = new ConcreteSubject()
			.addObserver(o) 
			.addObserver(o1)
			.addObserver(o2);
		
		((ConcreteSubject) sub).setString("settest");
		
//		System.err.println("End");
		

	}
}
