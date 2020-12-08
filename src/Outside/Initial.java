package Outside;

public class Initial implements State {
	
	Locations.CorridorALeft al;
	Locations.CorridorARight ar;
	Locations.CorridorBUp bu;
	Locations.CorridorBDown bd;
	Locations.CorridorCUp cu;
	Locations.CorridorCDown cd;
	Guard g1,g2,g3;
	boolean aleft,bUp,cUp;

	public void prev(Context context) {
		
		al.guards.add(g1);
		bu.guards.add(g2);
		cu.guards.add(g3);
		aleft=true;
		bUp =true;
		cUp =true;
		
		
	}

	public void next(Context context) {
		
		ar.guards.add(g1);
		al.guards.remove(0);
		bd.guards.add(g1);
		bu.guards.remove(0);
		cd.guards.add(g1);
		cu.guards.remove(0);
		aleft = false;
		bUp = false;
		cUp = false;
		
	}

	public void printStatus() {
		
		String status1,status2, status3;
		
		
		
	}

	

	
}
