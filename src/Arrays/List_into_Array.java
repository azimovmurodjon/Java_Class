package Arrays;

import java.util.ArrayList;

/*
Output

List: [Java, Python, JavaScript]
Array: Java, Python, JavaScript,
In the above example, we have created an list named languages. Here, we have used the ArrayList class to implement the List.
 */
public class List_into_Array {
    public static void main(String[] args) {
        ArrayList languages = new ArrayList<>();

        // Add elements in the list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        System.out.println("ArrayList: " + languages);

        // Create a new array of String type
        String[] arr = new String[languages.size()];

        // Convert ArrayList into the string array
        languages.toArray(arr);
        System.out.print("Array: ");
        for (String item : arr) {
            System.out.print(item + ", ");
        }
    }
}
