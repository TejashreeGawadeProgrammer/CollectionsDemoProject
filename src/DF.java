import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DF
{
	
   public static void main(String[] args)
   {
	   
       HashMap<String, String> map = new HashMap<>();
      
       map.put("1", "Ram");
       map.put("2", "Raju");
       map.put("3", "Vijay");
       System.out.println("Size of map is:- " + map.size());
       generateOuput(map);
       if (map.containsKey("2"))
       {
           String name = map.get("2");
           System.out.println("value for key 2 is: " + name);
       }
       
   }
   
   
   public static void generateOuput(HashMap<String, String> map)
   {
	   Set entrySet = map.entrySet();
	   Iterator it = entrySet.iterator();
	   while(it.hasNext()){
	       Map.Entry me = (Map.Entry)it.next();
	       System.out.println("Emp Id: "+me.getKey() +  " Emp Name: "+me.getValue());
	   }
   }
}