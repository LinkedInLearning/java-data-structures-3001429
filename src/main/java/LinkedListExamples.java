import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {

  public static void main(String[] args) {

    LinkedList<String> shoppingList = new LinkedList<>();
    shoppingList.add("apple");
    shoppingList.add("banana");
    shoppingList.add("pear");
    System.out.println(shoppingList);

    shoppingList.add(1, "mango");
    System.out.println(shoppingList);

    shoppingList.removeFirst();
    System.out.println(shoppingList);

    List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList);
    System.out.println(synchronizedShoppingList);
    
  }

}
