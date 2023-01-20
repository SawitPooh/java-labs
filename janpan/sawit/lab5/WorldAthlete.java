package janpan.sawit.lab5;
/*
 * This program WorldAthelete will call method with other class and use method that class.
 * This will output about biography's athlete that input . 
 * author: Sawit Janpan id:653040463-7 sec:2 date: 1/20/2023
 */
public class WorldAthlete {
    //This main method will write object form Athlete class and input parameter after will output on screen.
    public static void main(String[] args) {
        Athlete ratchanok = new Athlete("Ratchanok Intanon", 55, 1.68,Athlete.Gender.FEMALE, "Thai", "05/02/1995");
        Athlete wisaksil = new Athlete("Wisaksil Wangek", 51.5, 1.60, Athlete.Gender.MALE, "Thai", "08/12/1986");
        Athlete tom = new Athlete("Tom Brady", 102, 1.93,Athlete.Gender.MALE, "American", "03/08/1977");

        System.out.println(ratchanok.getName() + "'s height is " + ratchanok.getHight());
        ratchanok.setHeight(1.70);
        System.out.println(ratchanok.getName() + "'s height has increaded to  " + ratchanok.getHight());

        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
    }
}
