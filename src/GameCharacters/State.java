package GameCharacters;

import Locations.Location;

public interface State {
	
	public void State1(Context context,Location A, Location B, Location C );
	public void State2(Context context, Location A, Location B, Location C);
	public void printStatus();

}
