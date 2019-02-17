public class Clock implements Comparable<Clock> {
	int hour;
	int minute;

	public Clock(int hour, int minute) {
		this(hour * 60 + minute);
	}

	public Clock(int minute) {
		this.hour = (minute / 60) % 24;
		this.minute = minute % 60;
	}

	public Clock(String hourmin) {
		String[] parts = hourmin.split(":");

		hour = Integer.parseInt(parts[0]);
		minute = Integer.parseInt(parts[1]);
	}

	public int getMin() {
		return minute;
	}

	public int getH() {
		return hour;
	}

	public Clock add(int min) {
		return new Clock(hour * 60 + minute + min);
	}

	public Clock add(Clock c) {
		return add(c.hour * 60 + c.minute);
	}

	public String toString() {
		return String.format("%02d", hour) + ":" + String.format("%02d", minute);
	}
	
	public int compareTo(Clock t) {
        int this_mins = hour * 60 + minute;
        int that_mins = t.getH() * 60 + t.getMin();
        
        if (this_mins > that_mins)
            return 1;
        if (this_mins < that_mins)
            return -1;
        return 0;
	}
}
