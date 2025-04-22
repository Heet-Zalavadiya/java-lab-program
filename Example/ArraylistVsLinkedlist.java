import java.util.*;
public class ArraylistVsLinkedlist {
     public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        
        System.out.println("ArrayList: " + arrayList);     // [A, B, C]
        System.out.println("LinkedList: " + linkedList);   // [X, Y, Z]
        
        // Random access
        System.out.println(arrayList.get(1));   // Fast
        System.out.println(linkedList.get(1));  // Slower
     }    
}
