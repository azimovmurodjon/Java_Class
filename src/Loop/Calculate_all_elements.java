package Loop;

import java.util.HashMap;

public class Calculate_all_elements {

    public static void main(String[] args) {

        int num = 1234, reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while (num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}

 Calculator
class hash_maps{
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 12;

        // Hashmap comes here
        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 11);
        happy.put("c", 12);

        System.out.println(happy.get("c"));
    }
}

class hash_map_advanced{
    public static void main(String[] args) {
        HashMap<String, String> fun = new HashMap<String, String>();
        fun.put("bobbyjoe1996", "PonnyLand123");
        fun.put("helloKittyFun21", "AlohaVera333");
        fun.put("coolguyswag","password123");

//        fun.remove("coolguyswag");
        fun.replace("coolguyswag","kittycat123");

        System.out.println(fun);
    }
}

