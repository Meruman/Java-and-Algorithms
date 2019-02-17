public abstract class Vehicle {
    private boolean wiper_active; 
    protected boolean[] doors; 
    protected boolean trunk_open;
    
    public void toggle_wiper() {
        //your implementation goes here
    	if(wiper_active) {
    		wiper_active=false;
    	}
    	else {
    		wiper_active=true;
    	}
    } 

    public boolean getWiperState() {
        //your implementation goes here
    	return wiper_active;
    }
    
    public int getNumberOfDoors() {
        //your implementation goes here
    	int number = doors.length;
    	return number;
    }
    
    public boolean getDoorState(int door) {
        //your implementation goes here
    	boolean state = doors[door];
    	return state;
    }
    
    public boolean getTrunkState() {
        //your implementation goes here
    	return trunk_open;
    }

    public abstract void unlockAllDoors(); 
    public abstract void lockAllDoors(); 
    
    public Vehicle(boolean wiperState, boolean trunkState) {
        //your implementation goes here
    	wiper_active = wiperState;
    	trunk_open = trunkState;
    }
}
