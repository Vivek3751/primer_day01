/*6. Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String). */

public class p6{
    public static void main(String[] args) {
        // Replace the following names with your friends' names
        String[] friends = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Harry", "Ivy", "Jack"};

        // Sorting the array using compareTo method
        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                if (friends[i].compareTo(friends[j]) > 0) {
                    // Swap names if they are in the wrong order
                    String temp = friends[i];
                    friends[i] = friends[j];
                    friends[j] = temp;
                }
            }
        }

        // Displaying the sorted names
        System.out.println("Sorted names in alphabetical order:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
