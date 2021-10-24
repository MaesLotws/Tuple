package com.tuple.audioplayer;

import java.util.Scanner;

public class SoundFontChoice {
    
    public static int validuserinput;
    public static Scanner userinput = new Scanner(System.in);

    public static void UserChoice(){
        
        String soundfont = userinput.nextLine();
        
        //back and exit commands
        if(soundfont.equalsIgnoreCase("back")){
            System.out.println("There's nothing to go back to!");
            UserChoice();
        }
        
        else if(soundfont.equalsIgnoreCase("exit")){
            System.out.println("See you next time!");
            System.exit(0);
        }
        else{
            //Make sure the int is one of the given soundfonts
            try
            {
                //parse to an interger
                validuserinput = Integer.parseInt(soundfont);

                //If isn't one of the allowed soundfonts, run it again
                if((validuserinput <= 4) && (validuserinput>0)) {}
                else{
                    System.out.println("Please select one of the prompted numbers. Please try again.");
                    UserChoice();
                }
            }
            //Error handling
            catch (NumberFormatException e)
            {
                System.out.println("That is not one of the prompted options. Please try again.");
                UserChoice();
            }
        }
    }
    public static void UserChoiceStart(){
        //Allow the user to choose the soundfont
        System.out.println("Please choose a soundfont to use for your metronome:"); 
        System.out.println("    1.) Vibraphone");
        System.out.println("    2.) Twhomp");
        System.out.println("    3.) Bongos");
        UserChoice();
    }
}