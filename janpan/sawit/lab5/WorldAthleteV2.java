package janpan.sawit.lab5;
/*
 * This program WorldAtheleteV2 will call method with other class and use method that class.
 * This will output about biography's athlete that input. 
 * author: Sawit Janpan id:653040463-7 sec:2 date: 1/20/2023
 */
class WorldAthleteV2 {
      //This main method will use new object from  BadmintonPlayer, Footballer ,Boxer class and input parameter after will output on screen.
    public static void main(String[] args) {
        BadmintonPlayer ratchanok = new BadmintonPlayer("Ratchanok Intanon", 55, 1.68, Athlete.Gender.FEMALE, "Thai", "05/02/1995", 66.5, 4);
        Footballer tom = new Footballer("Tom Brady", 102, 1.93, Athlete.Gender.MALE, "American", "03/08/1977", "Quarterback", "New England Patriots");
        Boxer wisaksil = new Boxer("Wisaksil Wanger", 51.5, 1.60, Athlete.Gender.MALE, "Thai", "08/12/1986", "Super Flyweight", "M");
        System.out.println(ratchanok);
        System.out.println(wisaksil);
        System.out.println(tom);
        BadmintonPlayer nitchaon = new BadmintonPlayer("Nitchaon Jindapol", 52, 1.63, Athlete.Gender.FEMALE, "Thailand","31/03/1991", 67, 11);
        System.out.println("Both " + ratchanok.getName() + " and " + nitchaon.getName() + " play " + BadmintonPlayer.getSport());
        ratchanok.compareAge(tom);//compareAge method will call in BadmintonPlayer class . 
        ratchanok.compareAge(nitchaon);

        //if after if condition it's true will output wisaksil is taller than tom.
        //if else condition true it's true will output wisaksil is not taller than tom.
        if (isTaller(wisaksil, tom)) {
            System.out.println(wisaksil.getName() + " is taller than " + tom.getName());
        } else {
            System.out.println(wisaksil.getName() + " is not taller than " + tom.getName());
        }
    }

    public static boolean isTaller(Athlete athleteA, Athlete athleteB) {
        //this method will compare height athleteA and athleteB.
        //if height athleteA more than athleteB it's return true if not it's return  false.
        if (athleteA.height > athleteB.height) {
            return true;
        } else {
            return false;
        }
    }
}
