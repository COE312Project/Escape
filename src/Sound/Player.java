package Sound;

import javax.sound.sampled.*;
import java.io.File;

public class Player implements Runnable
{
    Clip clip;
    AudioInputStream as;

    Player() throws Exception
    {
        this.clip = AudioSystem.getClip();
    }

    // Can play() either using URLs or using local files but overriding will be hard
    // with a run function

    // for local files
    void play(String fN) throws Exception
    {
        this.as = AudioSystem.getAudioInputStream(new File(fN + ".wav").getAbsoluteFile());

        this.clip.open(as);
        this.clip.start();

        // Wont hear the sound if you dont sleep, its playing in the background
        // and because it is sleeping, I thought I'll make it a separate thread
        Thread.sleep((clip.getMicrosecondLength()/1000) + 1500); // extra one and half second coz that much is getting clipped if we do close()
        clip.close(); //need to do close this file so next file can be opened later
    }

    public void run()
    {
        while(true)
        {
            //so we can call Player.play() again and again
        }
    }

    public static void main(String[] args) throws Exception {
        String fileName = "band";
    
        Player pp = new Player();
        pp.play(fileName);

        // For playing another file,
        // need to change Player.fileName
    
        pp.play("pacman_intro");
    }
}