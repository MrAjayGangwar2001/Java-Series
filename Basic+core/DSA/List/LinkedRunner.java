package List;

public class LinkedRunner {
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insert(4);
        list.insert(12);
        list.insert(3);
        list.insert(65);
        list.insert(49);

        list.insertAtStart(25); /////// insert data at the start of the list

        list.insertAtAnyLocation(4, 57);      // insert data at the 4th position of the list

        list.DeleteAtAny(2);        // we want to delete the 2nd element of the list
        list.show();

    }
}
