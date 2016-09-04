
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;            // array size
        HighArray arr;                // reference to array
        arr = new HighArray(maxSize); // create the array
        long[] sortedArr = new long[maxSize];

        arr.insert(77);               // insert 10 items
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();                // display items

        System.out.println("Max value : " + arr.getMax());  //
//        arr.delete(arr.getMax());
        int j;
        for (j = arr.getnElem(); j > 0; j--) {              // fill sorted array using getMax()
            sortedArr[j - 1] = arr.getMax();
            arr.delete(arr.getMax());
        }
        System.out.println("sorted array: ");
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print(sortedArr[i] + " ");
        }


        int searchKey = 35;           // search for item
        if (arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

//        arr.delete(00);               // delete 3 items
//        arr.delete(55);
//        arr.delete(99);

        arr.display();                // display items again
    }  // end main()
}  // end class HighArrayApp


