package pm;

public class Taxi implements Meter {

	@Override
	public void start() {

	}

	@Override
	public int stop(int distance) {
		// TODO Auto-generated method stub
		int fare = distance * 2;
		return fare;
	}

}
