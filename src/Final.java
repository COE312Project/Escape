
public class Final implements State {
	
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
		
		ar.guards.add(g1);
		bd.guards.add(g2);
		cd.guards.add(g3);
		aleft=false;
		bUp =false;
		cUp =false;
		
		
	}

	public void next(Context context) {
		// TODO Auto-generated method stub
		
		al.guards.add(g1);
		ar.guards.remove(0);
		bu.guards.add(g1);
		bd.guards.remove(0);
		cu.guards.add(g1);
		cd.guards.remove(0);
		aleft = true;
		bUp = true;
		cUp = true;
		
	}

	public void printStatus() {
		// TODO Auto-generated method stub
		
		String status1,status2, status3;
		
		
		
	}

}
