package hash_map_examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapExample02 {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, List<String>> capitalCities = new HashMap<>();

        List<String> citiesOfEngland = Arrays.asList("London", "Cambridge", "Newcastle", "Aston Villa");

        // Add keys and values (Country, City)
        capitalCities.put("England", citiesOfEngland);

        System.out.println(capitalCities);
    }
}