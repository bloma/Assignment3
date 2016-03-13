import java.util.*;

/**
 * Created by Cant-Detect on 2016/03/13.
 */
public class CollectionClass {

    public List<String> colourList(){

        List<String> colours = new ArrayList<String>();

        colours.add("Black");
        colours.add("Blue");
        colours.add("White");
        colours.add("Red");

        return colours;
    }

    public Set<String> namesSet(){
        Set<String> names = new HashSet<String>();
        names.add("Aphiwe");
        names.add("Malikah");
        names.add("Xolela");
        names.add("Songz");

        return names;
    }

    public Map<Integer,String> phoneBook(){

        Map<Integer,String> animalsNames = new HashMap<Integer, String>();
        animalsNames.put(1,"Dog");
        animalsNames.put(2,"Chicken");
        animalsNames.put(3,"Tiger");
        animalsNames.put(4,"Lion");

        return animalsNames;
    }
}
