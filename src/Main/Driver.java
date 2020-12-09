package Main;
import Objects.*;
public class Driver {

	public static void main(String[] args) {

		String ip = "192.168.1.112"; int port = 23232;
		
		Basketball bb = new Basketball(ip,port);
		
		bb.use("");
	}

}
