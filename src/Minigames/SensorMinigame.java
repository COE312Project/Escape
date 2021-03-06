package Minigames;

import java.util.Scanner;

import Sensor.TCP_Client;

public abstract class SensorMinigame {

	public TCP_Client tcp;
	protected final void setupTCP() {
		this.tcp = TCP_Client.getInstance();
	}
	protected final void printInstructions() {
		System.out.println("\n\t\t<< GET YOUR PHONE READY >>");
		//(new Scanner(System.in)).nextLine();
	}
	
	public final Boolean play()
	{
		printInstructions();
		gameInstructions();
		setupTCP();
		return startGame();
	}
	
	public abstract void gameInstructions();
	
	public abstract Boolean startGame();
}
