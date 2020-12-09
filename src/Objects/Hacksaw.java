package Objects;

public class Hacksaw extends Item {

	Minigame.CutWindowBar cwb;
	
	public Hacksaw(String ip, int port) {
		super("hacksaw");
		cwb = new Minigame.CutWindowBar(ip,port);
	}
	
	public void use(String verb) {
		try {
			this.cwb.cut();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
