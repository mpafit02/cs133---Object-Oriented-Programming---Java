package Thermokipio;

public class TestThermokipio {

	public static void main(String[] args) {
		Controller control = new Controller();
		control.add(control.new LightOn(300));
		control.add(control.new LightOff(500));
		control.add(control.new CameraOn(400));
		control.add(control.new CameraOff(800));
		control.add(control.new Bell(300));
		control.run();
	}

}
