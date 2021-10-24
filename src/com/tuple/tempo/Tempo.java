package com.tuple.tempo;

import com.tuple.audioplayer.SoundFontChoice;

public class Tempo {
    
    public static int Tempo;
    
    //Creates the quarter note unicoce character
    public static String Unicode = "2669";
    public static String QuarterNote = String.valueOf(Character.toChars(Integer.parseInt(Unicode, 16)));
    
    public static void BPMInput(){

        //Grab user input for the bpm
        String UserBPM = SoundFontChoice.userinput.nextLine();
        
        //back and exit commands
        if(UserBPM.equalsIgnoreCase("back")){
            SoundFontChoice.UserChoice();
        }
        else if(UserBPM.equalsIgnoreCase("exit")){
            System.out.println("See you next time!");
            System.exit(0);
        }
        else{
            try
            {
                //parse to an interger for the bpm
                Tempo = Integer.parseInt(UserBPM);
            }
            //Error Handling
            catch (NumberFormatException e)
            {
                System.out.print("Please input a number for your BPM. " + QuarterNote + " = ");
                BPMInput();
            }    
        }
    }
    public static void BPMstart(){
        System.out.print("Please input a number for your BPM. " + QuarterNote + " = ");
        BPMInput();
    }
}