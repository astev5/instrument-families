package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

//Begin Subclass BlownInstrument
public abstract class BlownInstrument extends Instrument {

    /* Variables */
    protected String family;
    protected String playMethod = "mouth";

    @Override
    public void play() {
        System.out.printf("A %s is a %s instrument and is played by %s.\n",
                name, family, playMethod);
    }
    
} //End Subclass BlownInstrument 
    
    
