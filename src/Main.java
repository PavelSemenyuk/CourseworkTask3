public class Main {

    public static void main(String[] args) {



        task3("КУРСОВАЯ");


    }


    //ЗДАЧА БИЛЕТ3
    //Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
    public static void task3(String line) {
        String line1 = "";
        String line2 = "";
        for (int i = 0; i < line.length() / 2; i++) {
            line1 = line1 + line.charAt(i);
        }
        for (int i = line.length()/2; i < line.length() ; i++) {
            line2= line2 + line.charAt(i);
        }
        System.out.println( line1 +"  "+ line2);
    }

}