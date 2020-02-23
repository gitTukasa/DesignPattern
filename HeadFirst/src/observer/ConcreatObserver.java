package observer;

class ConcreteObserver implements Observer{ 
	@Override
	public void update(Subject sub) {
		System.out.println(sub);
	}
}
