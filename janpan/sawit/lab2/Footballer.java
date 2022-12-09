package janpan.sawit.lab2;
 
public class Footballer{
    public static void main(String[] args){
        int numArguments = args.length;
        if(numArguments == 3){
        String footballer_name = args[0];
        String nationality = args[1];
        String football_club = args[2];
        System.out.println("My favorite football player is "+footballer_name);
        System.out.println("His nationality is "+nationality);
        System.out.println("He plays for "+football_club);
        }
        else{
        System.out.print("Usage:java Footballer <footballer_name> <nationality> <football_club>");
        }
    }
}