import java.util.HashMap;
import java.util.Map;

public class DictionariesPractice {
    public static void main(String[] args) {
        //English to Spanish Dictionary
/*
Key|Value pairs
With Dictionaries, we can Insert,Find,Delete and NO restraints on size.
So, dictionaries don't exactly exist in Java, it is an abstract class so other things call dictionaries
Mapping keys to values
Hashmap is a type of map and map is an interface
  */
        Map<String,String> engSpanDict = new HashMap<String,String>();
        //Putting things inside our dictionary
        engSpanDict.put("Monday","Lunes");
        engSpanDict.put("Tuesday","Martes");
        engSpanDict.put("Wednesday","Miercoles");
        engSpanDict.put("Thursday","Jueves");
        engSpanDict.put("Friday","Viernes");
        engSpanDict.put("Saturday","Sabado");
        engSpanDict.put("Sunday","Domingo");
       //Retrieving things from our dictionary, dfferent from array as u don't want to put any index to retrieve
        System.out.println(engSpanDict.get("Monday"));
        System.out.println(engSpanDict.get("Tuesday"));
        //Print out all keys
        System.out.println("Notice one thing, there is NO ordering"+"\n"+engSpanDict.keySet());
        //Print out all values
        System.out.println(engSpanDict.values());
        //Print out size
        System.out.println("The size of our dictionary is "+engSpanDict.size());
        System.out.println();
        System.out.println();

        //Shopping list, Using boolean --> do I need this ? yes/no
/*
    If you use boolean in lower case, then it throws error as it does not have enough size and no pointer or, reference to it
    Rather Boolean in upper case, it makes an object that has reference to it
*/
        Map<String,Boolean> shoppingList=new HashMap<String, Boolean>();
        //Put some stuff in dictionary
        shoppingList.put("Icecream",true);
        shoppingList.put("eggs",Boolean.FALSE);
        shoppingList.put("oreos",Boolean.TRUE);
        shoppingList.put("chocolates",Boolean.TRUE);
        shoppingList.put("Sugar",Boolean.FALSE);
        //retrieve item
        System.out.println(shoppingList.get("Sugar"));
        System.out.println(shoppingList.get("sugar"));//as it is not present in the list
        System.out.println(shoppingList.get("oreos"));
        //key-value pairs
        System.out.println(shoppingList.toString());
        System.out.println("is Empty? "+shoppingList.isEmpty());
        System.out.println(shoppingList.remove("eggs"));
        System.out.println(shoppingList.replace("oreos",Boolean.FALSE));
        System.out.println("Now check"+shoppingList.toString());

        //clear our dictionary
       //System.out.println(shoppingList.clear()); //throwing error inside print statement
        shoppingList.clear();
        System.out.println("Clearing dictionary "+shoppingList.toString());
        System.out.println("is Empty? "+shoppingList.isEmpty());

    }
}
