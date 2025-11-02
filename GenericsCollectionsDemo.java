package src;
import java.util.*;
class car<T ,K ,P>{
private T car_name;
private K car_id;
private P car_data;
	public car(T Mercedes, K ews, P p) {
		this.car_name=Mercedes;
		this.car_data =p;
		this.car_id=ews;
	}

public T getCar_name1(){
    return this.car_name;
}
   
public K getCar_id(){
    return this.car_id;
}


public P getCar_data(){
    return this.car_data;
}

}
public class GenericsCollectionsDemo {


static class GenericBox<T> {
private T value;


public void setValue(T value) {
this.value = value;
}

public T getValue() {
return value;
}
}


public static <T> void printArray(T[] array) {
for (T element : array) {
System.out.print(element + " ");
}
System.out.println();
}


public static void main(String[] args) {
   
   
   
   car <String, Integer, String> a = new car<>("carA", 23, "120");
   System.out.println(a.getCar_name1());
   
// ========================================
// 1️⃣ GENERIC CLASS EXAMPLE
// ========================================
System.out.println("=== Generic Class Example ===");
GenericBox<Integer> intBox = new GenericBox<>();
intBox.setValue(108);
System.out.println("Integer Value in Box: " + intBox.getValue());

GenericBox<String> strBox = new GenericBox<>();
strBox.setValue("Namaste Java!");
System.out.println("String Value in Box: " + strBox.getValue());

// ========================================
// 2️ GENERIC METHOD EXAMPLE
// ========================================
System.out.println("\n=== Generic Method Example ===");
String[] names = {"Satya", "Shivay", "Shivam", "Mohan"};
Integer[] rollNumbers = {101, 102, 103, 104};

System.out.print("Names Array: ");
printArray(names);

System.out.print("Roll Numbers Array: ");
printArray(rollNumbers);
													
System.out.println("\n=== List Example (ArrayList) ===");
List<String> nameList = new ArrayList<>();
nameList.add("Satya");
nameList.add("Shivay");
nameList.add("Shivam");
nameList.add("Mohan");
nameList.add("Shivam"); // duplicates allowed in List

System.out.println("Names in ArrayList: " + nameList);

System.out.println("\n=== LinkedList Example ===");
List<Integer> marksList = new LinkedList<>();
marksList.add(85);
marksList.add(90);
marksList.add(78);
marksList.add(92);

System.out.println("Marks in LinkedList: " + marksList);

System.out.println("\n=== Set Example (HashSet - No Duplicates) ===");
Set<String> uniqueNames = new HashSet<>();
uniqueNames.add("Satya");
uniqueNames.add("Shivay");
uniqueNames.add("Mohan");
uniqueNames.add("Satya"); 
System.out.println("Unique Names in HashSet: " + uniqueNames);

System.out.println("\n=== Combining Generics + Collections ===");
GenericBox<List<String>> listBox = new GenericBox<>();
listBox.setValue(nameList);
System.out.println("List stored inside GenericBox: " + listBox.getValue());

System.out.println("\n=== Summary ===");
System.out.println(" Generic Classes make code reusable and type-safe.");
System.out.println(" Generic Methods work with any data type.");
System.out.println(" Lists store ordered data (allow duplicates).");
System.out.println(" Sets store unique data (avoid duplicates).");
System.out.println(" Perfect for managing student or employee data safely!");

ArrayList<Integer> arr = new ArrayList<>();
}
}

