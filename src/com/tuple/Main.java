package com.tuple;

import com.tuple.audioplayer.SoundFontChoice;
import com.tuple.audioplayer.Soundbank;
import com.tuple.tempo.Tempo;
import com.tuple.tempo.TimeSig;
import com.tuple.tempo.Calculations;

public class Main {

    public static void main(String[] args){
        
        //Reads the user the rules of the metronome
        Rules.Introduction();

        //Get the user's desired soundfont
        SoundFontChoice.UserChoiceStart();
        
        //Assign the correct soundfont
        Soundbank.Assignment();

        //Grab the user's tempo
        Tempo.BPMstart();

        //Grab the user's time signature
        TimeSig.TimeSigRun();

        //Calculate the delay time
        Calculations.run();
    
        //Play the sounds
        Execution.execute();
    }
}