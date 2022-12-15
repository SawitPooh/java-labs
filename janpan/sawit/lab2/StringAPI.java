package janpan.sawit.lab2;
    /**
 * This Footballer program is to accept one argument: schoolname 
*  
*  Its output format is 
* <schoolName> is a university or
* <schoolName> is a college  or
* <schoolName> is neither a university nor a college or
*"Usage:StringAPI <schoolName>"
* Author: Sawit Janpan
* ID: 653040463-7
* Sec: 2
* Date: December 15, 2022
**/
public class StringAPI {
     public static void main(String[] args) {
    int numArguments = args.length;
    if(numArguments == 1){
    String schoolName = args[0];
        if (schoolName.toLowerCase().indexOf("university")>0){
            System.out.println(schoolName+" is a university");
        }
        else if(schoolName.toLowerCase().indexOf("college")>0){
            System.out.println(schoolName+" is a college");
        }
        else{
            System.out.println(schoolName+" is neither a university nor a college");
        }
    }
    else{
    System.out.println("Usage:StringAPI <schoolName>");
    }
    }
}
