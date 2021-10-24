package com.tuple.audioplayer;

public class Soundbank{

    public static String SoundbankUpbeat[] = new String [3];
    public static String SoundbankDownbeat[] = new String[3];
    
    public static void Assignment(){
        
        //Array values calling on soundfonts
        
        //Vibes
        SoundbankDownbeat[0] = "rsrc/soundfonts/vibes/VibeDownbeat.wav";
        SoundbankUpbeat[0] = "rsrc/soundfonts/vibes/VibeUpbeat.wav";
        
        //Thwomp
        SoundbankDownbeat[1] = "rsrc/soundfonts/thwomp/ThwompDownbeat.wav";
        SoundbankUpbeat[1] = "rsrc/soundfonts/thwomp/ThwompUpbeat.wav";
        
        //Bongos
        SoundbankDownbeat[2] = "rsrc/soundfonts/bongos/BongoDownbeat.wav";
        SoundbankUpbeat[2] = "rsrc/soundfonts/bongos/BongoUpbeat.wav";
    }
}