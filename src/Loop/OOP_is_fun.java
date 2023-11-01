package Loop;

public class OOP_is_fun {
}

class Pen{

    String type = "gel";
    String color = "Blue";
    int point = 10;

    static boolean clicked = false;

    public static void click(){
        clicked = true;
        System.out.println("Pen is clicked");

    }

    public static void unclicked(){
        clicked = false;
        System.out.println("Pen is unclicked");
    }
}

class main{
    public static void main(String[] args) {
        Pen p = new Pen();

        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        p.click();
        p.unclicked();
    }
}
