import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeDetails {

	public static void main(String[] args) {
        Map<String, String> empdetails = new HashMap<>();
        empdetails.put("1", "Ram");
        empdetails.put("2", "Raju");
        empdetails.put("3", "Vijay");
        
//
//        System.out.println("Iterating..");
//        empdetails.forEach((employee, salary) -> {
//            System.out.println(employee + " => " + salary);
//        });

        System.out.println("\nOutput Is:");
        Set<Map.Entry<String, String>> employeeEntries = empdetails.entrySet();
        Iterator<Map.Entry<String, String>> employeeIterator = employeeEntries.iterator();
        while (employeeIterator.hasNext()) {
            Map.Entry<String, String> entry = employeeIterator.next();
            System.out.println("Emp ID:\t"+entry.getKey() + " Emp Name: " + entry.getValue());
        }


         
    }
}
