package Arrays;

/*
Output

The average is: 27.69
In the above program, the numArray stores the floating-point values whose average is to be found.

Then, to calculate the average, we need to first calculate the sum of all elements in the array. This is done using a for-each loop in Java.

Finally, we calculate the average by the formula:

average = sum of numbers / total count
In this case, the total count is given by numArray.length.

Finally, we print the average using format() function so that we limit the decimal points to only 2 using "%.2f"
 */
public class Average {
    public static void main(String[] args) {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (double num: numArray) {
            sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }

}
