/*  Create an array of countries. While retrieving all values from an array print capital for each country choose any five countries.

*/

public class task6 {
    public static void main(String[] args) {
        String countries[] = {"France", "Egypt", "America", "Italy", "Brazil"};
        String capital[] = {"Paris", "cairo", "washington dc", "Roma", "Braulia"};
        for (int i = 0; i < capital.length; i++) {

                System.out.println(capital[i] + " is the capital of  " + countries[i]);
            }

        }
    }
