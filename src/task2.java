/* Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).

*/

public class task2 {
    public static void main(String[] args) {
String [] names = {"Nabil","Maher","Francois","Kare","Mina"};
        System.out.println(names [2]);

        System.out.println("---------------------------------------------------");

        String [] index = new String[5];
        index [0]= "Nabil";
        index [1]= "Maher";
        index [2]= "Kare";
        index [3]= "Mina";
        index [4]= "Francois";
        System.out.println(index [4]);

    }
}