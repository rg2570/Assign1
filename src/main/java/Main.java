// Part - 1 // countFromTill(a,b) : List[Integer]
// Part - 2 // Map<String, List<Integer>> Even -> ....; Odd -> ....
// Part - 3 // Map<String, String> Even -> "2,4,6,", Odd -> "1,3,5,"
// Part - 4 //List<String> ("1,3,5,...", "2,4,6,8,...")
// Print

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter start number: ");
        int start = input.nextInt();
        System.out.println("Enter end number");
        int end = input.nextInt();

        List<Integer> part1 = new ArrayList<Integer>();

        for (int i = start; i <= end; i++) {
            part1.add(i);
        }
        System.out.println(part1);

        //Part-2
        HashMap<String, List<Integer>> numHash = new HashMap<String, List<Integer>>();
        numHash.put("Even",null);
        numHash.put("Odd", null);
        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> evenList = new ArrayList<Integer>();
        for (int i = start; i <= end; i++) {
            if(i % 2 == 0) evenList.add(i);
            else oddList.add(i);
        }
        numHash.put("Even", evenList);
        numHash.put("Odd", oddList);

        for(Map.Entry m : numHash.entrySet())
        {
            System.out.println(m.getKey()+ " " + m.getValue());
        }


        /////Part - 3
        HashMap<String, List<String>> strHash = new HashMap<String, List<String>>();
        strHash.put("Even", null);
        strHash.put("Odd", null);
        List<String> oddString = new ArrayList<String>();
        List<String> evenString = new ArrayList<String>();
        for(Integer o : oddList)
        {
            oddString.add(o.toString());
        }
        for(Integer e : evenList)
        {
            evenString.add(e.toString());
        }
        strHash.put("Even", evenString);
        strHash.put("Odd", oddString);

        for(Map.Entry m : strHash.entrySet())
        {
            System.out.println(m.getKey() +" "+m.getValue());
        }

        //Part - 4
        List<List> finalList = new ArrayList();
        finalList.add(oddList);
        finalList.add(evenList);
        System.out.println(finalList);
    }
}

/* Sample: [3,13]
[3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
Even [4, 6, 8, 10, 12]
Odd [3, 5, 7, 9, 11, 13]
Even [4, 6, 8, 10, 12]
Odd [3, 5, 7, 9, 11, 13]
[[3, 5, 7, 9, 11, 13], [4, 6, 8, 10, 12]]
*/

