package datastructure;

import java.util.*;

public class UseListHashMap {
    public static void main(String[] args) {
        List<String> stateListOfUSA = new ArrayList<>();
        stateListOfUSA.add("NY");
        stateListOfUSA.add("VA");
        stateListOfUSA.add("PA");

        List<String> provinceListOfCanada = new ArrayList<>();
        provinceListOfCanada.add("TO");
        provinceListOfCanada.add("MO");
        provinceListOfCanada.add("SA");

        List<String> provinceListOfAustralia = new ArrayList<>();
        provinceListOfAustralia.add("SY");
        provinceListOfAustralia.add("MA");
        provinceListOfAustralia.add("NW");

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        map.put("USA", stateListOfUSA);
        map.put("Canada", provinceListOfCanada);
        map.put("Australia", provinceListOfAustralia);

        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

    }
}
