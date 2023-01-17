/*  Create an array of size 5 on integers and calculate the sum of all elements in an array.

*/

public class task5 {
    public static void main(String[] args) {
int sum =0;
       int nums [] = {1,2,3,4,5};
        for (int i = 0; i < nums.length; i++) {
            sum= sum+nums [i];

        }
        System.out.println(sum);
    }
}