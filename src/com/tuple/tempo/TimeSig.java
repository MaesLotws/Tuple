package com.tuple.tempo;

import com.tuple.audioplayer.SoundFontChoice;

public class TimeSig {
    
    public static int TimeSigTop;
    public static int TimeSigBottom;

    public static void TimeSigInputOne(){
        //Grab the user input for the numerator of the time signature
        String TimeSigOne = SoundFontChoice.userinput.nextLine();

        //back and exit commands
        if(TimeSigOne.equalsIgnoreCase("back")){
            Tempo.BPMstart();
        }
        if(TimeSigOne.equalsIgnoreCase("exit")){
            System.out.println("See you next time!");
            System.exit(0);
        }
        else{
            try
            {
                //Parse to an integer
                TimeSigTop = Integer.parseInt(TimeSigOne);
                //Check if it's a positive integer
                if(TimeSigTop<=0){
                    System.out.print("Please input a positive integer: ");
                    TimeSigInputOne();
                }
            }
            catch(NumberFormatException e)
            {
                System.out.print("Please input a number: ");
                TimeSigInputOne();
            }
        }
    }
    public static void TimeSigInputTwo(){
        //Grab the user input for the denominator of the time signature
        String TimeSigTwo = SoundFontChoice.userinput.nextLine();
        
        //back and exit commands
        if(TimeSigTwo.equals("back")){
            TimeSigInputOne();
        }
        else if(TimeSigTwo.equalsIgnoreCase("exit")){
            System.out.println("See you next time!");
            System.exit(0);
        }
        else{
            try
            {
                //Parse to an integer
                TimeSigBottom = Integer.parseInt(TimeSigTwo);
                //Check if it is one of the allowed numbers
                if((TimeSigBottom == 1) || (TimeSigBottom == 2) || (TimeSigBottom == 4) || (TimeSigBottom == 8) || (TimeSigBottom == 16)){}
                else{
                    System.out.print("Please input one of the above numbers: ");
                    TimeSigInputTwo();
                }
            }
            //Error Handling
            catch(NumberFormatException e)
            {
                System.out.print("Please input a number: ");
                TimeSigInputTwo();
            }     
        }
    }
    public static void TimeSigRun(){
        System.out.print("Please input the top number of your time signature: ");
        TimeSigInputOne();
        System.out.print("Please input the bottom number of your time signature (1, 2, 4, 8, 16): ");
        TimeSigInputTwo();
    }
}