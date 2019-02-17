public class Bus extends Vehicle implements Trunk{

	public Bus(boolean wiperState, boolean trunkState) {
		super(wiperState, trunkState);
		// TODO Auto-generated constructor stub
		super.doors= new boolean[]{true,true};
	}

	@Override
	public void unlockAllDoors() {
		// TODO Auto-generated method stub
		super.doors = new boolean[] {false,false};
		
	}

	@Override
	public void lockAllDoors() {
		// TODO Auto-generated method stub
		super.doors = new boolean[] {true,true};
	}
    //your implementation goes here
	public void openTrunk() {
		super.trunk_open=true;
	}
	public void closeTrunk() {
		super.trunk_open=false;
	}
}
