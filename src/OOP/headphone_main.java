package OOP;

public class headphone_main {
    public static void main(String[] args) {
        Headphones h = new Headphones();
        System.out.println(h.charge);
        System.out.println(h.Color);
        for (int i = 0; i < h.controls.length; i++)
            System.out.println( i + "   " + h.controls[i]);

        h.powerOn();
        h.powerOff();
        h.volumeUp();
        h.volumeDown();
    }

}
