package Minigames;

import Sensor.TCP_Client;

public abstract class SensorMinigame {

	public TCP_Client tcp;
	protected final void setupTCP() {
		this.tcp = new TCP_Client();
	}
	protected final void printInstructions() {
		System.out.println("\n\t\t<< Get your phone ready! >>");
	}
	
	public final Boolean play()
	{
		setupTCP();
		printInstructions();
		return startGame();
	}
	
	public abstract Boolean startGame();
}
