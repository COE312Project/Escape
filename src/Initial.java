
public class Initial implements State {
	
	CorridorALeft al;
	CorridorARight ar;
	CorridorBUp bu;
	CorridorBDown bd;
	CorridorCUp cu;
	CorridorCDown cd;
	Guard g1,g2,g3;
	boolean aleft,bUp,cUp;

	public void prev(Context context) {
		// TODO Auto-generated method stub
		
		al.guards.add(g1);
		bu.guards.add(g2);
		cu.guards.add(g3);
		aleft=true;
		bUp =true;
		cUp =true;
		
		
	}

	public void next(Context context) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
		String status1,status2, status3;
		
		
		
	}

	

	
}
