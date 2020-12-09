package GameCharacters;

import Locations.*;


public class Initial implements State {
	
	Locations.CorridorALeft al;
	Locations.CorridorARight ar;
	Locations.CorridorBUp bu;
	Locations.CorridorBDown bd;
	Locations.CorridorCUp cu;
	Locations.CorridorCDown cd;
	Guard gA,gB,gC;
	boolean aleft,bUp,cUp;
	
	Location loc;
	
	
	
	@Override
	public void prev(Context context, Location l) {
		
		if(l.name==al.name) {
			
			gA.loc= new CorridorALeft();
			l.guards.add(gA);
			aleft=true;
			
		}
		
		else if(l.name==bu.name) {
			
			
			gB.loc= new CorridorBUp();
			l.guards.add(gB);
			bUp =true;
			
			}

		
		else if(l.name==al.name) {
			
			gC.loc= new CorridorCUp();
			l.guards.add(gC);
			cUp =true;
			
			}
		
		
	}

	@Override
	public void next(Context context, Location l) {
		
		l.guards.clear();
		
		gA.loc= new CorridorARight();
		l.guards.add(gA);
		
		
		
		gB.loc= new CorridorBDown();
		l.guards.add(gB);
		
		
		gC.loc= new CorridorCDown();
		l.guards.add(gC);
		
		
		
		
		
		aleft = false;
		bUp = false;
		cUp = false;
		
	}

	

	public void printStatus() {
		
		String status1,status2, status3;
		
		if(aleft) {
			status1="Guard A is on the left side of the Corridor A";
		}
		else {
			status1="Guard A is on the left side of the Corridor A";
			
		}
		
		if(bUp) {
			status2="Guard B is on the upper side of the Corridor B";
		}
		else {
			status2="Guard B is on the lower side of the Corridor B";
			
		}
		
		
		if(cUp) {
			status3="Guard C is on the upper side of the Corridor C";
		}
		else {
			status3="Guard C is on the lower side of the Corridor A";
			
		}
		
		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		
		
		
		
		
		
	}



	

	
}
