package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

//Begin Subclass StruckInstrument
public abstract class StruckInstrument extends Instrument {

    /* Variables */
    protected String family;
    protected String playMethod = "struck";
    
    @Override
    public void play(){
        System.out.printf("A %s is a %s instrument and is %s.\n",
                name, family, playMethod);        
    }    
    
} //End Subclass StruckInstrument 
    
    
