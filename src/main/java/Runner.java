import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
        System.out.println("TASK 1: Add Coll --> "+ scottishIslands);

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");
        System.out.println("TASK 2: Add Tiree --> "+ scottishIslands);

//        3. Add "Islay" after "Jura" and before "Mull"
        for (int i = 0; i < scottishIslands.size(); i++){
            if(scottishIslands.get(i) == "Jura"){
                scottishIslands.add(i+1,"Islay");
                break;
            }
        }
        System.out.println("TASK 3: Add Islay after Jura and before Mull --> "+ scottishIslands);

//        4. Print out the index position of "Skye"
        System.out.println("TASK 4: The Index position is --> "+scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
        System.out.println("TASK 5: remove Tresco by name -->  " +scottishIslands);

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(scottishIslands.indexOf("Arran"));
        System.out.println("TASK 6: remove Arran by index -->  " +scottishIslands);

//        7. Print the number of islands in your arraylist
        System.out.println("TASK 7: Print the no of Islands --> "+scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("TASK 8: Alphabetical sort --> "+scottishIslands);

//        9. Print out all the islands using a for loop
        System.out.println("TASK 9: Print islands using for loop");
        for (String island: scottishIslands) {
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        ArrayList evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 == 0){
                evenNumbers.add(numbers.get(i));
            }
        }
        System.out.println("TASk EX 1: print even numbers --> "+evenNumbers);

//        2. Print the difference between the largest and smallest value
        //Collections.sort(numbers);
        System.out.println("TASK EX2: Difference --> " +(numbers.get(numbers.size()-1)-numbers.get(0)));


//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean sameNumber;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>1 && numbers.get(i) == numbers.get(i-1)){
                sameNumber = true;
                System.out.println("Task EX3: Print true if 1 next to 1 --> "+ sameNumber);
                break;
            }
        }
//        4. Print the sum of the numbers,
        int sum = 0;
        for (int number:numbers) {
            sum+=number;
        }
        System.out.println("TASK EX4: SUM --> " + sum);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        int sum_EX5 = 0;
        int nextNumber = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i)>1 && numbers.get(i-1) == 13 || numbers.get(i) == 13){
                continue;
            }
            sum_EX5 += numbers.get(i);
        }
        System.out.println("TASK EX5: sum without 13 and after --> " + sum_EX5);
    }
}
