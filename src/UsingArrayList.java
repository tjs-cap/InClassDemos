import java.util.ArrayList;
import java.util.Collections;

public class UsingArrayList {
    public static void main(String[] args) {

        //All arrays are fixed in size and can only be of one datatype
        int[] arr1 = new int[10];  //generate a blank array
        int[] arr2 = {1,2,3,4}; //generate a populated array

        //ArrayLists can be variable in size, but can only be of one datatype
        ArrayList<Integer> myList = new ArrayList<Integer>();

        //Adding an object to the arraylist
        myList.add(5);
        myList.add(2);
        myList.add(4);
        myList.add(1);

        //Adding an object to a specific index on an arraylist
        myList.add(0,10);

        //sorting an arraylist using the collections library
        Collections.sort(myList);

        //displaying all objects on the arraylist
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
        System.out.println();

        //using the enhanced for loop, providing same results as above
        for (Integer integer : myList) {
            System.out.println(integer);
        }
        System.out.println();

        ArrayList<String> myWords = new ArrayList<>();
        //Because String is implied, it doesn't need to be added to the right side of the equals
        //this can be also done with MyList
        myWords.add("Fred");
        myWords.add("Barney");
        myWords.add("Wilma");
        myWords.add("Betty");

        for (String str : myWords){
            System.out.println(str);
        }
        System.out.println();


        Collections.sort(myWords);
        for (String str : myWords){
            System.out.println(str);
        }
        System.out.println();

        myWords.remove("Fred"); //will remove Fred from the arraylist
        Collections.sort(myWords);
        for (String str : myWords){
            System.out.println(str);
        }
        System.out.println();

        myWords.remove(0); //will remove whatever object is located at index 0
        Collections.sort(myWords);
        for (String str : myWords){
            System.out.println(str);
        }
        System.out.println();

    }
}
