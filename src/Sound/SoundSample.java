package Sound;
import javax.sound.sampled.*;
import java.io.File;
//import java.net.URL;

public class SoundSample
{
    void play(String fileName) throws Exception
    {
        //Can do either using URLs or using local files
        //URL url = new URL("https://file-examples-com.github.io/uploads/2017/11/file_example_WAV_1MG.wav");
        Clip clip = AudioSystem.getClip();
        //AudioInputStream as = AudioSystem.getAudioInputStream(url);
        AudioInputStream as = AudioSystem.getAudioInputStream(new File(fileName+".wav").getAbsoluteFile());
        clip.open(as);
        clip.start();
        Thread.sleep(clip.getMicrosecondLength());
    }
    public static void main(String[] args) throws Exception
    {
        (new SoundSample()).play("sample");
    }
}