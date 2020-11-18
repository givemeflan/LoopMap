
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class LoopandMap {

    public static void main(String[] args){
        // This Section is for asking user for 5 numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Can you give me five numbers?");

        // ParseInt-ing here because the numbers from the user will first come out as strings. 
        ArrayList<Integer> numArray = new ArrayList();
        int userNum;
        for(int i = 0; i < numArray.size(); i++){
        userNum = Integer.parseInt(scan.nextLine()); 
            numArray.add(userNum);
        }

        // Sorting numbers: largest to smallest 
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numArray.size(); i ++){
            if(numArray.get(i) > max){
                max = numArray.get(i);
            }
        // Sorting numbers: smallest to largest
            int min = Integer.MAX_VALUE;
        for (int i = 0; i < numArray.size(); i ++){
            if(numArray.get(i) < min){
                min = numArray.get(i);
            }


        // Finding the sum of the numbers
            int sum = 0;
            for (int i =0; i < numArray.size(); i++){
                sum+= numArray.get(i);
            }

             // Finding the product
             int product = 1;
             for (int i =0; i < numArray.size(); i++){
                 product*= numArray.get(i);
             }
        }


        // This section is for the HashMap
        HashMap<String, String> cars = new HashMap<String, String>();

        // Adding elements to the HashMap
        cars.put("Lexus", "LFA");
        cars.put("Audi", "R8");
        cars.put("Jaguar", "iPace");
        cars.put("Audi", "R7");
        System.out.println("What kind of make do you want?");
        String wantedCar = scan.nextLine();

        if (cars.containsKey(desiredCar)) {
            (System.out.println("We have a " + wantedCar + "" cars.get(wantedCar));
            else{
                System.out.println("We don't have that car unfortunately");
            }

}
}
