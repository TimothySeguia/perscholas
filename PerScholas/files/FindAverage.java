//Your Name:
//Today's Date:

/*
  Please comment above each line of code
  saying what you believe that line does.

  For an example, see line 24.
*/

public class FindAverage {

    public static void main(String[] args) {
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

        double average = total / arr.length;

        //Print out the average with 3 decimal places.
        System.out.format("The average is: %.3f", average);
    }
}
