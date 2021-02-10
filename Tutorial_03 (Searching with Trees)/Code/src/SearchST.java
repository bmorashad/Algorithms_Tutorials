import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchST {

    private int N;           // number of key-value pairs
    private Node first;      // the first Node

    public SearchST() {
        // Empty Constructor
    }

    public static void main(String[] args) {
        SearchST st = new SearchST();

        // ONLY for IDE version, remove otherwise
        Scanner input = null;
        try {
            input = new Scanner(new File("D:/IIT/2nd Year/Alogrithm/Tutorials/Tutorial_03 (Searching with Trees)/tinyST.txt"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // END of IDE version

        // for (int i = 0; !StdIn.isEmpty(); i++) {     <- For console/terminal version only
        for (int i = 0; input.hasNext(); i++) {
            String key = input.next();
            st.put(key, Integer.valueOf(i));
        }

        // Your display of the contents...
        for (Node x = st.first; x != null; x = x.next) {
            StdOut.println(x.key + " " + x.val);
        }

        // Your search of the contents...

        // Insert the statements, which, given a character as input, the position of its last occurrence on the string, as of the input data file, shall be returned....For instance, "Character R has been found lastly appearing at position 3".
        // get input from command line
        // measure time taken to find.

    }

    public int size() {
        // Returns the number of key-value pairs in this symbol table.
        return N;
    }

    public boolean isEmpty() {
        // Returns true if this symbol table is empty.
        return size() == 0;
    }

    public boolean contains(String key) {
        // Returns true if this symbol table contains the specified key.
        if (key == null) {
            throw new IllegalArgumentException("argument to contains() is null");
        }
        return get(key) != null;
    }

    public Integer get(String key) {
        // Returns the value associated with the given key in this symbol table.
        if (key == null) {
            throw new IllegalArgumentException("argument to get() is null");
        }
        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }

    public void put(String key, Integer val) {
        // 'Inserts' the specified key-value pair into the symbol table, 'overwriting the old '
        // value with the 'new value 'if the symbol table 'already' contains the 'specified key.'
        // 'Deletes' the specified key (and its associated value) from this symbol table
        // if the specified value is {@code null}.

        if (key == null) {
            throw new IllegalArgumentException("first argument to put() is null");
        }

        if (val == null) {
            delete(key);
            return;
        }

        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }

        first = new Node(key, val, first);
        N++;
    }

    public void delete(String key) {
        // Removes the specified key and its associated value from this symbol table.
        // (if the key is in this symbol table).
        if (key == null) {
            throw new IllegalArgumentException("argument to delete() is null");
        }
        first = delete(first, key);
    }

    private Node delete(Node x, String key) {
        // delete key in linked list beginning at Node x
        //  warning: function call stack too large if table is large
        if (x == null) return null;
        if (key.equals(x.key)) {
            N--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }

    // Node creating class
    private class Node {
        private String key;
        private Integer val;
        private Node next;

        public Node(String key, Integer val, Node next) {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
}

/**
 * Expected output on the tinyST.txt example:
 * L 11
 * P 10
 * M 9
 * X 7
 * H 5
 * C 4
 * R 3
 * A 8
 * E 12
 * S 0
 * <p>
 * <p>
 * The {SequentialSearchST} class represents an (unordered) symbol table of generic key-value pairs.
 * It supports the usual 'put', 'get', 'contains','delete', 'size', and 'is-empty' methods.
 * It also provides a 'keys' method for iterating over all of the keys.
 * A symbol table implements the 'associative array' abstraction:
 * when associating a value with a key that is already in the symbol table, the convention is to replace the
 * old value with the new value.
 * The class also uses the convention that values cannot be {null}. Setting the value associated with a key
 * to {null} is equivalent to deleting the key from the symbol table.
 * <p>
 * It relies on the {equals()} method to test whether two keys are equal. It does not call either the {compareTo()} or
 * {hashCode()} method.
 * <p>
 * This implementation uses a 's 'singly linked list' andequential search'.
 * The 'put' and 'delete' operations take O(n).
 * The 'get' and 'contains' operations takes O(n) time in the worst case.
 * The 'size', and 'is-empty' operations take O(1) time.
 * Construction takes O(1) time.
 * <p>
 * The {SequentialSearchST} class represents an (unordered) symbol table of generic key-value pairs.
 * It supports the usual 'put', 'get', 'contains','delete', 'size', and 'is-empty' methods.
 * It also provides a 'keys' method for iterating over all of the keys.
 * A symbol table implements the 'associative array' abstraction:
 * when associating a value with a key that is already in the symbol table, the convention is to replace the
 * old value with the new value.
 * The class also uses the convention that values cannot be {null}. Setting the value associated with a key
 * to {null} is equivalent to deleting the key from the symbol table.
 * It relies on the {equals()} method to test whether two keys are equal. It does not call either the {compareTo()} or
 * {hashCode()} method.
 * This implementation uses a 's 'singly linked list' andequential search'.
 * The 'put' and 'delete' operations take O(n).
 * The 'get' and 'contains' operations takes O(n) time in the worst case.
 * The 'size', and 'is-empty' operations take O(1) time.
 * Construction takes O(1) time.
 * <p>
 * The {SequentialSearchST} class represents an (unordered) symbol table of generic key-value pairs.
 * It supports the usual 'put', 'get', 'contains','delete', 'size', and 'is-empty' methods.
 * It also provides a 'keys' method for iterating over all of the keys.
 * A symbol table implements the 'associative array' abstraction:
 * when associating a value with a key that is already in the symbol table, the convention is to replace the
 * old value with the new value.
 * The class also uses the convention that values cannot be {null}. Setting the value associated with a key
 * to {null} is equivalent to deleting the key from the symbol table.
 * It relies on the {equals()} method to test whether two keys are equal. It does not call either the {compareTo()} or
 * {hashCode()} method.
 * This implementation uses a 's 'singly linked list' andequential search'.
 * The 'put' and 'delete' operations take O(n).
 * The 'get' and 'contains' operations takes O(n) time in the worst case.
 * The 'size', and 'is-empty' operations take O(1) time.
 * Construction takes O(1) time.
 **/

/**
 *  The {SequentialSearchST} class represents an (unordered) symbol table of generic key-value pairs.
 *  It supports the usual 'put', 'get', 'contains','delete', 'size', and 'is-empty' methods.
 *  It also provides a 'keys' method for iterating over all of the keys.
 *  A symbol table implements the 'associative array' abstraction:
 *  when associating a value with a key that is already in the symbol table, the convention is to replace the
 *  old value with the new value.
 *  The class also uses the convention that values cannot be {null}. Setting the value associated with a key
 *  to {null} is equivalent to deleting the key from the symbol table.
 *  It relies on the {equals()} method to test whether two keys are equal. It does not call either the {compareTo()} or
 *  {hashCode()} method.
 *  This implementation uses a 's 'singly linked list' andequential search'.
 *  The 'put' and 'delete' operations take O(n).
 *  The 'get' and 'contains' operations takes O(n) time in the worst case.
 *  The 'size', and 'is-empty' operations take O(1) time.
 *  Construction takes O(1) time.
 **/
// https://algs4.cs.princeton.edu/31elementary/SequentialSearchST.java.html
// https://algs4.cs.princeton.edu/30searching/