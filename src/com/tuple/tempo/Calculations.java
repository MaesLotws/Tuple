package com.tuple.tempo;

public class Calculations {

    public static int NoteLength;
    //Calculate the delay between sounds

    public static void run(){
        
        //Assign the correct note length based on the denominator value of the time signature        
        switch(TimeSig.TimeSigBottom){
            case 1:
                NoteLength = 240;
                break;
            case 2:
                NoteLength = 120;
                break;
            case 4:
                NoteLength = 60;
                break;
            case 8:
                NoteLength = 30;
                break;
            case 16:
                NoteLength = 15;
                break;
            default:
                //Error handling
                System.out.println("Error raised: non-standard denominator value");
                System.exit(0);
                break;
        }
    }
}