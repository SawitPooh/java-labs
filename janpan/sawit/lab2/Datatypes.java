package janpan.sawit.lab2;

public class Datatypes {
    public static void main(String[] args){
        String my_name= "Sawit Janpan";
        String my_student_ID = "653040463-7";
        char theFirstLetterOfmyFirstName = my_name.charAt(0);
        boolean value_true = true;
        int myLastTwoDigitsID_InOctal = 045;
        int myLastTwoDigitsID_InHexadecimal = 0x25;
        long myLastTwoDigitsID_InLong = 37L;
        float myLastTwoDigitsID_AndtheFloatFirstTwoDigitsID = 37.65f;
        double myLastTwoDigitsID__AndtheLastTwoDigitsOfCurrentYear =37.22;
        System.out.println("My name is "+my_name);
        System.out.println("My student ID was  "+my_student_ID);
        System.out.println(theFirstLetterOfmyFirstName+" "+value_true+" "+myLastTwoDigitsID_InOctal+" "+myLastTwoDigitsID_InHexadecimal);
        System.out.println(myLastTwoDigitsID_InLong+" "+myLastTwoDigitsID_AndtheFloatFirstTwoDigitsID+" "+myLastTwoDigitsID__AndtheLastTwoDigitsOfCurrentYear); 
    }

}
/*This Datatypes program is declare the variables
* my_name has firstname and lastname.
* myLastTwoDigitsID_InOctal is a variable with an octal value.
* myLastTwoDigitsID_InHexadecimal is a variable with a hexadecimal value.
* myLastTwoDigitsID_InLong is a a variable with a long value.
* myLastTwoDigitsID_AndtheFloatFirstTwoDigitsID  = theLastTwoDigitsOfYourIDNumber and has the floating point of theFirstTwoDigitsOfYourIDNumber
* myLastTwoDigitsID__AndtheLastTwoDigitsOfCurrentYear = theLastTwoDigitsOfYourIDNumber and has the floating point of theLastTwoDigitsOfCurrentYear
* Its output format is "My name is my_name
*My student ID was my_student_ID
*theFirstLetterOfmyFirstName value_true myLastTwoDigitsID_InOctal myLastTwoDigitsID_InHexadecimal
*myLastTwoDigitsID_InLong myLastTwoDigitsID_AndtheFloatFirstTwoDigitsID myLastTwoDigitsID__AndtheLastTwoDigitsOfCurrentYear
* Author: Sawit Janpan
* ID: 653040463-7
* Sec: 2
* Date: December 14, 2022
*/
