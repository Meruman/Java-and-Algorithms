public class Clock {

	private int h,m;
	public Clock(int hour, int minute) {
        //your implementation goes here
		h=hour;
		m=minute;
		while (m>59) {
			h=h+(m/60);
			m=m%60;
			}
		while (h>23) {
			h=h%24;
		}
	}

	public Clock(int minute) {
        //your implementation goes here
		h=0;
		m=minute;
		while (m>59) {
			h=h+(m/60);
			m=m%60;
			}
		while (h>23) {
			h=h%24;
		}
	}

	public Clock(String hourmin) {
        //your implementation goes here
		String[] parts = hourmin.split(":");
		h=Integer.parseInt(parts[0]);
		m=Integer.parseInt(parts[1]);
		while (m>59) {
			h=h+(m/60);
			m=m%60;
			}
		while (h>23) {
			h=h%24;
		}
	}

	public int getMin() {
        //your implementation goes here
		return m;
	}

	public int getH() {
        //your implementation goes here
		return h;
	}

	public Clock add(int min) {
        //your implementation goes here
		Clock temp = new Clock(h,m+min);
		return temp;
	}

	public Clock add(Clock c) {
        //your implementation goes here
		Clock temp = new Clock(h+c.getH(),m+c.getMin());
		return temp;
		
	}

	public String toString() {
        //your implementation goes here
		String hora="",min="";
		if (h<10) {
			hora = "0" + h;
		}else {hora=hora + h;}
		if (m<10) {
			min = "0"+ m;
		}else {min=min + m;}
		String time= ""+ hora + ":" +min;;
		return time;
	}
}
