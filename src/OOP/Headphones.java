package OOP;

import javax.sound.midi.Soundbank;

public class Headphones {

    String charge = "Micro USB";
    String[] controls = {"Power", "Volume", "Skip", "Play/Pause"};
    String Color = "Black/Silver";

    static boolean power = false;
    static int volume = 0;

    public static void powerOn() {
        power = true;
        System.out.println("Power is On");
    }

    public static void powerOff() {
        power = false;
        System.out.println("Power is Off");
    }
    public static void volumeUp(){
         volume++;
        System.out.println("Volume is Up");
    }
    public static void volumeDown(){
        volume--;
        System.out.println("Volume is Down");
    }
}
