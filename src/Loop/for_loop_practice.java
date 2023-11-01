package Loop;

import java.util.ArrayList;
import java.util.Scanner;


public class for_loop_practice {
    public static void main(String[] args) {
        System.out.println("I love loop");
    }
}


class while_loop {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 10){
//            System.out.println("a is less then number 10 a is " + a);
//            a++;
//        }
//
//        int num = 0;
//        do {
//            System.out.println("First do this code");
//        }while (num == 1);
//

        String sentence = "Jets sky are awesome";
        Scanner scan = new Scanner(sentence);
        ArrayList<String> word = new ArrayList<String>();

        while (scan.hasNext()) {
            word.add(scan.next());
            if (word.add("sky")) {
            }
            break;
        }
        System.out.println(word);
    }
}
