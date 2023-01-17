/*1) Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

*/

public class task1 {
    public static void main(String[] args) {

        char [] grades = {'A','B','C','D','E','F'};

        System.out.println(grades [1]);

        System.out.println("-----------------------------------------------------------");

          char [ ] scores = new char[6];
          scores [0] = 'A';
          scores [1] = 'B';
          scores [2] = 'C';
          scores [3] = 'D';
          scores [4] = 'E';
          scores [5] = 'F';
        System.out.println(scores [1]);

    }
}