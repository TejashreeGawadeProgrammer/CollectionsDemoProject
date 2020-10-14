import java.util.*; 
  
public class ArrayListDemo { 
    public static void main(String[] argv) throws Exception 
    { 
        try { 
  
            
            ArrayList<String> arrlist = new ArrayList<String>(); 
  
             
            arrlist.add("California"); 
            arrlist.add("Texas"); 
            arrlist.add("Oregon"); 
            arrlist.add("New York"); 
            arrlist.add("Nevada"); 
            arrlist.add("Florida"); 
            arrlist.add("Arizona"); 
            arrlist.add("New Jersey");
            arrlist.add("Hawai"); 
            arrlist.add("Minesota");
  
           
            System.out.println("ArrayList: "
                               + arrlist); 
  
            ListIterator<String> 
                iterator = arrlist.listIterator(); 
  
            
            System.out.println("\nUsing ListIterator:\n"); 
            while (iterator.hasNext()) { 
                System.out.println("State Name : "
                                   + iterator.next()); 
            } 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 