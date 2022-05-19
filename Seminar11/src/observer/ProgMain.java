package observer;

public class ProgMain {

	public static void main(String[] args) {
		
		RainEvent rain = new RainEvent("rain");
		
		IHandler mada = new MadaHandler();
		IHandler tibi = new TibHandler();
		IHandler radu = new RaduHandler();
		
		rain.subscribeHandler(tibi);
		rain.subscribeHandler(radu);
		rain.subscribeHandler(mada);
		
		rain.activateEvent();
	}

}
