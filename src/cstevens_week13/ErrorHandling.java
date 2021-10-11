package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

//Begin ErrorHandling Subclass
public class ErrorHandling {

    //Declarations
    private boolean FLAG;

    /**
     * Method @setYesNo: Set result for checking entry of Yes or No answers
     *
     * @param answer
     */
    public void setYesNo(String answer) {
        if (!(answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N"))) {
            System.err.print("Exception!\nPlease enter only a Y for Yes or "
                    + "an N for No: ");
            FLAG = false;
        } else if (answer.equalsIgnoreCase("y")) {
            System.out.println();
            FLAG = true;
        } else {
            FLAG = true;
        }
    } //End setYesNo method

    /**
     * Method @getYesNo
     *
     * @return boolean value for Yes or No answers
     */
    public boolean getYesNo() {
        return FLAG;
    } //End getYesNo method

    /**
     * Method @setValidateRange: Validate a range of choices
     *
     * @param x
     * @param minVal
     * @param maxVal
     */
    public void setValidateRange(int x, int minVal, int maxVal) {
        if ((x < minVal) || (x > maxVal)) {
            System.err.printf("Exception!\nPlease limit your choice to "
                    + "between %d and %d: ", minVal, maxVal);
            FLAG = false;
        } else {
            FLAG = true;
        }
    }

    /**
     * Method @getRange
     *
     * @return Boolean value for checking range
     */
    public boolean getRange() {
        return FLAG;
    }

    /**
     * Method @setValidateInt: Validate choices are of type integer
     *
     * @param x
     */
    public void setValidateInt(int x) {
        if (x <= 0) {
            System.err.println("Exception!\nPlease enter only positive "
                    + "numbers.");
            FLAG = false;
        } else {
            FLAG = true;
        }
    }

    /**
     * Method @getValidateInt
     *
     * @return Boolean value for checking type integer
     */
    public boolean getValidateInt() {
        return FLAG;
    }

} //End ErrorHandling Subclass
