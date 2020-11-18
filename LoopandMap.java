
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class LoopandMap {

    public static void main(String[] args){

        HashMap<String, String> cars = new HashMap<String, String>();

        cars.put("Lexus", "LFA");
        cars.put("Audi", "R8");
        cars.put("Jaguar", "iPace");
        cars.put("Audi", "R7");

        Scanner scan= new Scanner(System.in);
        System.out.println("What kind of make do you want?");
        String desiredCar = scan.nextLine();

        if (cars.containsKey(desiredCar)) {
            (System.out.println("We have a " + desiredCar + "" cars.get(desiredCar));
            else{
                System.out.println("We don't have that car unfortunately");
            }

}

}
}
