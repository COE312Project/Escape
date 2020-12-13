package Sensor;
import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import Sound.Player;

import java.io.*;

public class TCP_Client implements Runnable {

	// ip address of the machine 
	String host = Game.Driver.IP;
	
	JSONParser parser;

	// need the port 
	int port = Game.Driver.PORT;
	public coord accel, gyro, rot;
	
	private static TCP_Client instance;
	
	public TCP_Client(){

		// no need to set the ip address and the port of the 
		// the server we will connect to.

		this.parser = new JSONParser();
		this.accel = new coord();
		this.gyro = new coord();
		this.rot = new coord();

		// make this a thread
		Thread t = new Thread(this);
		t.start();
	}

	public static synchronized TCP_Client getInstance()
	{
		if(instance == null)
		{
			instance = new TCP_Client();
		}
		return instance;
	}
	
	public void run() {
		try {
			Socket socket = new Socket(this.host, this.port);
			InputStream input = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			// -------------------------------- new reader -------------------------------
			BufferedReader br = new BufferedReader(reader);
			String line = "";
			while ((line = br.readLine()) != null) {//read line by line
			//	System.out.println(line);
				
				//parse String to JSON
				JSONObject jsonObject1 = (JSONObject) parser.parse(line);
				JSONObject jsonObject2 = (JSONObject) jsonObject1.get("accelerometer");
				JSONObject jsonObject3 = (JSONObject) jsonObject1.get("gyroscope");
				JSONObject jsonObject4 = (JSONObject) jsonObject1.get("rotationVector");

				//select a specific value using its key
				JSONArray val = new JSONArray();
				val = (JSONArray)jsonObject2.get("value");
				//print the selected value
				this.accel.x = (double)val.get(0);
				this.accel.y = (double)val.get(1);
				this.accel.z = (double)val.get(2);
				
				val = (JSONArray)jsonObject3.get("value");
				this.gyro.x = (double)val.get(0);
				this.gyro.y = (double)val.get(1);
				this.gyro.z = (double)val.get(2);
				
				val = (JSONArray)jsonObject4.get("value");
				this.rot.x = (double)val.get(0);
				this.rot.y = (double)val.get(1);
				this.rot.z = (double)val.get(2);

			}
			//----------------------------------------------------------------------------
		} catch (UnknownHostException ex) {
			System.out.println("Server not found: " + ex.getMessage());
		} catch (IOException ex) {
			System.out.println("I/O error: " + ex.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
