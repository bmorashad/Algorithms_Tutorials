import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*************************************************************************
 *  Expected output on the tinyST.txt example:
 *  L 11
 *  P 10
 *  M 9
 *  X 7
 *  H 5
 *  C 4
 *  R 3
 *  A 8
 *  E 12
 *  S 0
 *
 *************************************************************************/

/****************************************************************************
 *  Compilation within a console or terminal:  
 *  Windows version: javac -cp .;stdlib.jar SearchST.java
 *  OS / Linux version: javac -cp .:stdlib.jar SearchST.java
 *  
 *  Execution within a console or terminal:  
 *  Windows version: java -cp .;stdlib.jar SearchST < tinyST.txt
 *  OS / Linux version: javac -cp .:stdlib.jar SearchST < tinyST.txt
 *  
 *  Adaptation: Enable and disable statements where appropriately in the lines of code below.
 *  
 *  NOTE for execution within an IDE (i.e., Eclipse or NetBeans): In Eclipse, drag the corresponding input data file 
 *  tinyST.txt over the main project folder and COPY it; In NetBeans. copy-paste the tinyST.txt file into the NetBeans project
 *  directory. Accordingly, change the file name in the statement, for instance, reading data from the 
 *  tinyST.txt file:
 *  
 *  input = new Scanner(new File("tinyST.txt"));
 *  
 *  NOTE (2) for execution within an IDE: Do not forget to add the stdlib.jar to the Libraries.
 *
 *
 ****************************************************************************/

/**
 *  The <tt>SequentialSearchST</tt> class represents an (unordered)
 *  symbol table of generic key-value pairs.
 *  A symbol table implements the <em>associative array</em> abstraction:
 *  when associating a value with a key that is already in the symbol table,
 *  the convention is to replace the old value with the new value.
 *  This implementation uses a singly-linked list and sequential search.
 *  It relies on the <tt>equals()</tt> method to test whether two keys
 *  are equal. 
 * 
 */

public class SearchST {
    private int N;           
    private Node first;      

    private class Node {
        private String key;
        private Integer val;
        private Node next;

        public Node(String key, Integer val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    public SearchST() {
    }

    
    public int size() {
        return N;
    }
  
    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(String key) {
        // Implement the method by inserting the missing statements...
    }

    public Integer get(String key) {
        // Implement the method by inserting the missing statements...    
	}

    public void put(String key, Integer val) {
        // Implement the method by inserting the missing statements...    
}

    public void delete(String key) {
        first = delete(first, key);
    }

    private Node delete(Node x, String key) {
        // Implement the method by inserting the missing statements...The implementation shall be using the DELETE methid above....
    }

    public static void main(String[] args) {
        SearchST st = new SearchST();
        
     // ONLY for IDE version, remove otherwise
    	Scanner input = null;
		try {
			input = new Scanner(new File("tinyST.txt"));
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
}
