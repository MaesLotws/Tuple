package com.tuple.audioplayer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;

import com.tuple.tempo.Calculations;
import com.tuple.tempo.Tempo;

public class PlaySound{    
    
    public void play(String audioFilePath) {
        boolean PlayCompleted = false;
        File audioFile = new File(audioFilePath); //Grab audio file
 
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile); //Create the InputStream
 
            AudioFormat format = audioStream.getFormat(); 
     
            DataLine.Info info = new DataLine.Info(Clip.class, format); //Setup to convert to clip
    
            Clip audioClip = (Clip) AudioSystem.getLine(info); //Create clip
          
            audioClip.open(audioStream); //Open the clip
             
            audioClip.start(); //Play
            while (!PlayCompleted) {
                // wait until playback completes
                try {
                    Thread.sleep(Calculations.NoteLength*1000/Tempo.Tempo); //Delay before next sound plays
                    PlayCompleted = true; //Finish the sound
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            audioClip.close();
            
        //Error handeling
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }     
    }
}