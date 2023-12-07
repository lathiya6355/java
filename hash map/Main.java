import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
    
        // Add keys and values (Country, City) 
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        
        // System.out.println(capitalCities.get("England")); //get method give value of key
        
        // capitalCities.remove("England"); // remove item 
        // capitalCities.clear(); //remove all item
        // System.out.println(capitalCities);

        // System.out.println(capitalCities.size()); // size of hashmap

        // loop through hashmap ============================================
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
          }
      }
}
