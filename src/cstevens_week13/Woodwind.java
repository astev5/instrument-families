package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

/* Imports */
import java.util.ArrayList;

//Begin Subclass Woodwind
public class Woodwind extends BlownInstrument {

    /* Local Variables */
    ArrayList<String> woodwind = new ArrayList<>();

    /**
     * Default constructor
     */
    public Woodwind() {
        super();
        this.name = "flute";
        this.family = "woodwind";
    }

    /**
     * Constructor for user entered data
     *
     * @param wName;
     */
    public Woodwind(String wName) {
        super();
        this.name = wName;
        this.family = "woodwind";
    }

    /**
     * Method @setNames: add names to ArrayList: woodwind
     *
     * @param wName
     */
    protected void setNames(String wName) {
        woodwind.add(wName);
    }

    /**
     * Method @getNames
     *
     * @return ArrayList: woodwind
     */
    public ArrayList getNames() {
        return woodwind;
    }

    /**
     * Override method from super class Instrument
     */
    @Override
    public void display() {
        System.out.printf("You have entered the following %s instruments:",
                family);
        for (int i = 0; i < woodwind.size(); i++) {
            System.out.println(woodwind.get(i));
        }
    }

    /**
     * Override method from super class Instrument
     */
    @Override
    public void play() {
        for (int i = 0; i < woodwind.size(); i++) {
            String w = woodwind.get(i);

            System.out.printf("A %s is a %s instrument and is played by %s.\n",
                    w, family, playMethod);
        }
    }

} //End Subclass Woodwind
