package Enums;

public class EnumTutorial {
    /*
    Enum is Predefind set of values.
    all Enum Classes is extends from java.lang.enum class
     */
    public static void main(String[] args) {


        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;

        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("Yay it is almost Friday!");
        }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
            System.out.println(myDay);
        }
    }
}

class EnumTutorial2 {
    public static void main(String[] args) {
        System.out.println("Level of Deliciousness " + Cereals.FROOT_LOOPS.levelOfDeliciousness);
        System.out.println("Price " + Cereals.FROOT_LOOPS.price);
        System.out.println("Level of Deliciousness " + Cereals.REESES_PUFFS.levelOfDeliciousness);
        System.out.println("Price " + Cereals.REESES_PUFFS.price);
        System.out.println("Level of Deliciousness " + Cereals.CAPTAIN_CRUNCH.levelOfDeliciousness);
        System.out.println("Price " + Cereals.CAPTAIN_CRUNCH.price);
        System.out.println("Level of Deliciousness " + Cereals.COCOA_PUFFS.levelOfDeliciousness);
        System.out.println("Price " + Cereals.COCOA_PUFFS.price);
    }
}
