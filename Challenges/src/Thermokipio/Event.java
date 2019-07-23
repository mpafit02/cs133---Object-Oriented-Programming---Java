package Thermokipio;

public abstract class Event {
	public long delayTime;
	public long eventTime;

	public Event(long time) {
		delayTime = time;
		start();
	}

	public void start() {
		eventTime = System.currentTimeMillis() + delayTime;
	}

	public boolean ready() {
		return System.currentTimeMillis() >= eventTime;
	}

	public abstract void action();
}
