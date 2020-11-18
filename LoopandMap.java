
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoopandMap {

    public static void main(String[] args){
        // This Section is for asking user for 5 numbers
        Scanner scan= new Scanner(System.in);
        System.out.println("Can you give me five numbers?");
        int userNum = scan.nextInt(); 



        // This section is for the HashMap
        HashMap<String, String> cars = new HashMap<String, String>();

        // Adding elements to the HashMap
        cars.put("Lexus", "LFA");
        cars.put("Audi", "R8");
        cars.put("Jaguar", "iPace");
        cars.put("Audi", "R7");

        Scanner scan= new Scanner(System.in);
        System.out.println("What kind of make do you want?");
        String wantedCar = scan.nextLine();

        if (cars.containsKey(desiredCar)) {
            (System.out.println("We have a " + wantedCar + "" cars.get(wantedCar));
            else{
                System.out.println("We don't have that car unfortunately");
            }

}
}
