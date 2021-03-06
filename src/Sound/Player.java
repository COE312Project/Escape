package Sound;

import javax.sound.sampled.*;
import java.io.File;
import java.util.Queue;
//import java.util.Scanner;
import java.util.LinkedList; 

public class Player implements Runnable
{
	private Clip clip;
	private AudioInputStream as;

	private Queue<String> files = new LinkedList<>(); // normal queue
	private Thread t;

	private static Player instance;

	Player() throws Exception
	{
		this.clip = AudioSystem.getClip();
		this.t = new Thread(this);
		this.t.start();
	}

	public static synchronized Player getInstance() throws Exception
	{
		if(instance == null)
		{
			instance = new Player();
		}
		return instance;
	}

	// Can play() either using URLs or using local files but overriding will be hard
	// with a run function

	// for local files

	private void playFile(String fN) throws Exception
	{

		this.as = AudioSystem.getAudioInputStream(new File("SoundEffects/"+fN + ".wav").getAbsoluteFile());

		this.clip.open(as);
		this.clip.start();

		// Wont hear the sound if you dont sleep, its playing in the background
		// and because it is sleeping, I thought I'll make it a separate thread
		Thread.sleep((clip.getMicrosecondLength()/1000) + 1500); // extra one and half second coz that much is getting clipped if we do close()
		clip.close(); //need to do close this file so next file can be opened later

	}

	public void play(String fN) {
		synchronized(this.files) {
			this.files.add(fN); // files to be played are added to queue
		}
	}

	public void run()
	{
		while(true)
		{
			String fName = null;
			synchronized(this.files)
			{
				fName = this.files.poll(); // pop front of queue
			}
				if(fName != null) {
					
					try {
						this.playFile(fName);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}			
		}
	}
	// Uncomment this main to test. You can keep typing stuff and the sounds play in the bg.
/*
	public static void main(String[] args) throws Exception {
		
		String fileName = "boo";
		Player pp = Player.getInstance();
		pp.play(fileName);
		System.out.println("one done");
		pp.play("pacman_intro");
		System.out.println("2nd done");
		Scanner cin = new Scanner(System.in);
		while(true) {
		String inp = cin.nextLine();
		System.out.println(inp);}
	}
*/
}