import java.util.LinkedHashSet;

public class Linkedhashset {

 public static void main(String[] args) {

     LinkedHashSet<String> linkedset = new LinkedHashSet<>();
     System.out.println("Inserting 'A','B','D' and 'C'");
     linkedset.add("A");
     linkedset.add("B");
     linkedset.add("D");
     linkedset.add("C");
     System.out.println("LinkedHashSet: "+ linkedset);
     System.out.println("Inserting 'A' and 'E' ");
     linkedset.add("A");
     linkedset.add("E");
     System.out.println("LinkedHashSet: "+ linkedset);
     
     System.out.println("Size of LinkedHashSet: "+ linkedset.size());

     System.out.println("Removing D from LinkedHashSet: "+ linkedset.remove("D"));

     System.out.println("Trying to Remove Z which is not present: " + linkedset.remove("Z"));

     System.out.println("Checking if A is present: "+ linkedset.contains("A"));
     System.out.println("Checking if Z is present: "+ linkedset.contains("Z"));  
     
     System.out.println("LinkedHashSet: "+ linkedset);
 }
}
