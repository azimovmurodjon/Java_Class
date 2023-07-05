package referance;

import java.time.LocalDate;

public class Referance_type {
    public static void main(String[] args) {
        int max = 18;
        int ali = 21;

        boolean isMaxOlderThenAli = max >= ali;
        boolean isAliOlderThenMax = max < ali;
        System.out.println(isMaxOlderThenAli);
        System.out.println(isAliOlderThenMax);

    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }


}
