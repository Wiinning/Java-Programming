package twoDarray;

public class Practice {
    public static void main(String[] args) {
        // create 2d array that has 3 row
        // first row has no column
        // second row has 3 column
        // third row has 1 column
        String [][] names = {{}, {"apple", "banana", "coconut"}, {"logan"}};
        System.out.println("Total of row: " + names.length);
        System.out.println("Column number of first row: "+ names[0].length);
        System.out.println("column number of second row: " + names[1].length);
        System.out.println("Column number of third row: " + names[2].length);

    }
}
