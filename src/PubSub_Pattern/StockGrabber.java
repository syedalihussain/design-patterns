package PubSub_Pattern;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		int index = this.observers.indexOf(observer);
		System.out.println("Observer removed: " + (index + 1));
		this.observers.remove(observer);
	}

	@Override
	public void notifyObserver() {

		for (Observer obs : observers) {
			obs.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	public void setIbmPrice(int ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setAaplPrice(int aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public void setGoogPrice(int googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}
}
