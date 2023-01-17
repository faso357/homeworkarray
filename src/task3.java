/* Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.

*/

public class task3 {
    public static void main(String[] args) {
      String [ ] code = {"Java", "Saturday","day" , "coding", "is"};
            System.out.print(code [1]+" ");
            System.out.print(code [4]+" ");
            System.out.print(code [0]+" ");
            System.out.print(code [3]+" ");
            System.out.print(code [2]+".");
           System.out.println();

          System.out.println("-------------------------------------------------------");

            String [ ] codes = new String[5];
            codes [0] = "Saturday";
            codes [1] = "is";
            codes [2] = "Java";
            codes [3] = "coding";
            codes [4] = "day.";
        System.out.println(codes[0]+" "+codes[1]+" "+codes[2]+" "+codes[3]+" "+codes[4]);

    }
}