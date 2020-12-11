package GameCharacters;

import Locations.*;

public class AllStates implements State {
	
	
	boolean aleft,bUp,cUp;
	
	
	@Override
	public void State1(Context context, Location A, Location B, Location C) {
		// TODO Auto-generated method stub
		if(A.name=="CorridorALeft"){
			//A.guards.get(0).loc.name="CorridorAright";
			aleft = false;
		}
		else if(B.name=="CorridorBUp"){
			//B.guards.get(0).loc.name="CorridorBDown";
			bUp = false;
		}
		
		else if(C.name=="CorridorCUp"){
			//C.guards.get(0).loc.name="CorridorCDown";
			cUp = false;
		}
		
	}

	@Override
	public void State2(Context context, Location A, Location B, Location C) {
		// TODO Auto-generated method stub
		
		//A.guards.get(0).loc.name="CorridorALeft";
		//B.guards.get(0).loc.name="CorridorBUp";
		//C.guards.get(0).loc.name="CorridorCUp";
		aleft = true;
		bUp = true;
		cUp = true;
		
		
	}
	
	
	


	public void printStatus() {
		
		String status1 = null,status2 = null, status3 = null;
		
		if(aleft) {
			status1="Guard A is on the left side of the Corridor A";
		}
		else if(!aleft) {
			status1="Guard A is on the Right side of the Corridor A";
			
		}
		
		if(bUp) {
			status2="Guard B is on the upper side of the Corridor B";
		}
		else if(!bUp) {
			status2="Guard B is on the lower side of the Corridor B";
			
		}
		
		
		if(cUp) {
			status3="Guard C is on the upper side of the Corridor C";
		}
		else if (!cUp) {
			status3="Guard C is on the lower side of the Corridor C";
		
		
		
		}
		
		System.out.println(status1 + "\n");
		System.out.println(status2 + "\n");
		System.out.println(status3 + "\n");

	
		
	}

	

}

