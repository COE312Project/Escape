package GameCharacters;

public class Patrol implements State {

	int dir = 1;

	public void next(Context context) {

		if(dir == 1) {
			context.g.loc.guards.remove(context.g);
			context.g.loc = context.g.loc.east;
			context.g.loc.guards.add(context.g);
		}
		else if(dir == 2 || dir == 3) {
			context.g.loc.guards.remove(context.g);
			context.g.loc =context.g.loc.south;
			context.g.loc.guards.add(context.g);
		}
		else if(dir == 4 || dir == 5) {
			context.g.loc.guards.remove(context.g);
			context.g.loc = context.g.loc.west;
			context.g.loc.guards.add(context.g);
		}
		else if(dir == 0 || dir == 6 || dir == 7) {
			context.g.loc.guards.remove(context.g);
			context.g.loc = context.g.loc.north;
			context.g.loc.guards.add(context.g);
		}
		dir = (dir+1)%8;
	}




}

