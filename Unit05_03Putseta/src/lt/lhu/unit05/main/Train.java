package lt.lhu.unit05.main;

public class Train {

	private String destination;
	private int number;
	private int time;
	
	public Train(String _destination, int _number, int _time) {
		this.destination = _destination;
		this.number = _number;
		this.time = _time;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", number=" + number + ", time=" + time + "]";
	}
	
}
