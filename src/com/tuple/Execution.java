package com.tuple;

import com.tuple.tempo.TimeSig;
import com.tuple.audioplayer.SoundFontChoice;
import com.tuple.audioplayer.Soundbank;
import com.tuple.audioplayer.PlaySound;

public class Execution {
    
    //Grab the correct soundfont
    public static String Downbeat = new String(Soundbank.SoundbankDownbeat[SoundFontChoice.validuserinput - 1]);
    public static String Upbeat = new String(Soundbank.SoundbankUpbeat[SoundFontChoice.validuserinput - 1]);
    public static PlaySound player = new PlaySound();
    public static String audioFilePath;
    public static boolean Running = true;

    public static void execute(){
        
        //The amount of beat after the downbeat
        int UpbeatCount = TimeSig.TimeSigTop - 2;
        
        //Play the sounds
        while(Running == true){
            audioFilePath = Downbeat;
            player.play(audioFilePath);
            audioFilePath = Upbeat;
            for(int beat = 0; beat <= UpbeatCount; beat++){
                player.play(audioFilePath);
            }
        }
    }
}