package chapterSixteen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<String,String[]> nigeriaStates = new HashMap<>();
        nigeriaStates.put("Benue",new String[] {"Makurdi"});
        nigeriaStates.put("Lagos", new String[] {"Ikeja"});
        nigeriaStates.put("Enugu",new String[] {"Enugu"});



        var value = nigeriaStates.get("Benue");
        System.out.println(Arrays.toString(value));

        var set = nigeriaStates.entrySet();
        set.forEach(e -> System.out.println(e.getKey() +" : "+ Arrays.toString(e.getValue())));

        System.out.println();

        nigeriaStates.keySet().forEach(k -> Arrays.sort(nigeriaStates.get(k)));

        nigeriaStates.forEach((k,v) -> System.out.println(k+" : "+ Arrays.toString(v)));


    }
}
