package Thermokipio;

import java.util.ArrayList;

public class Controller {
	private ArrayList<Event> eventList = new ArrayList<>();

	public void add(Event e) {
		eventList.add(e);
	}

	public void run() {
		while (!eventList.isEmpty()) {
			for (int i = 0; i < eventList.size(); i++) {
				if (eventList.get(i).ready()) {
					eventList.get(i).action();
					eventList.remove(i);
				}
			}
		}
		System.out.println("Done!");
	}

	class LightOn extends Event {

		public LightOn(long time) {
			super(time);
		}

		public void action() {
			System.out.println("LightOn");
		}
	}

	class LightOff extends Event {

		public LightOff(long time) {
			super(time);
		}

		public void action() {
			System.out.println("LightOff");
		}
	}

	class CameraOn extends Event {

		public CameraOn(long time) {
			super(time);
		}

		public void action() {
			System.out.println("CameraOn");
		}
	}

	class CameraOff extends Event {

		public CameraOff(long time) {
			super(time);
		}

		public void action() {
			System.out.println("CameraOff");
		}
	}

	class Bell extends Event {

		public Bell(long time) {
			super(time);
		}

		public void action() {
			System.out.println("Bell");
			add(new Bell(delayTime));
		}
	}
}
