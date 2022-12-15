package janpan.sawit.lab2;
/**
 * This Footballer program is to accept four arguments:note_1000,note_500,note_100,note_20
*  Its output format is 
*  Total money is (note_1000*1000+note_500*500+note_100*100+note_20*20)
*
* Author: Sawit Janpan
* ID: 653040463-7
* Sec: 2
* Date: December 15, 2022
**/
public class MoneyProcessor {
    public static void main(String[] args){
        int number_input = args.length;
        if (args.length == 4 ){
            double  note_1000 = Double.parseDouble(args[0]);
            double  note_500 = Double.parseDouble(args[1]);
            double  note_100 = Double.parseDouble(args[2]);
            double  note_20 = Double.parseDouble(args[3]);
            System.out.println("Total money is "+(note_1000*1000+note_500*500+note_100*100+note_20*20));
            }
        else{
            System.out.println("Usage:MoneyProcessor <note_1000> <note_500> <note_100> <note_20>" );
        }
    }
    
}
