package observer;

import java.util.ArrayList;

public class ConcreteSubject implements Subject{
	private String str;
	final private ArrayList<Observer> observers;
	
	public void setString(String str) {
		this.str = str;
		notifyObservers();
	}
	
	ConcreteSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public Subject addObserver(Observer o) {
		observers.add(o);
		return this;
	}

	@Override
	public void removeObserver(Observer o) {
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update((Subject)this);
		}
	}

	@Override
	public String toString() {
		return this.str; 
	}

}
