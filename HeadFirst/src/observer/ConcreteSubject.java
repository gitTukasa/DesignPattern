package observer;

import java.awt.List;
import java.util.ArrayList;

public class ConcreteSubject implements Subject{
	private String str;
	final private ArrayList<Observer> observers;
	
	public void setString(String str) {
		this.str = str;
		notifyObservers();
	}
	
	ConcreteSubject() {
		// TODO 自動生成されたコンストラクター・スタブ
		observers = new ArrayList<>();
	}

	@Override
	public Subject addObserver(Observer o) {
		observers.add(o);
		return this;
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO 自動生成されたメソッド・スタブ
		if (observers.contains(o)) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO 自動生成されたメソッド・スタブ
		for(Observer o : observers) {
			o.update((Subject)this);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName(); 
	}

}
