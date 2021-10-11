package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

//Begin Subclass Instrument
public abstract class Instrument {

    /* Variables */
    protected String name;

    /**
     * Abstracted method to be utilized by subclasses
     */
    abstract public void play();

} //End Subclass Instrument
