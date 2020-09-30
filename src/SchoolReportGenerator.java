import java.util.ArrayList;
import java.util.HashMap;

public class SchoolReportGenerator {
    public static String write(String scores) {
        ArrayList<String> results = new ArrayList<String>();

        String splitScores[] = scores.split(", ");
        HashMap<String, Integer> scoresCounter = new HashMap<String, Integer>();
        scoresCounter.put("Amber", 0);
        scoresCounter.put("Green", 0);
        scoresCounter.put("Red", 0);

//        Integer GreenCount = 0;
//        Integer AmberCount = 0;
//        Integer RedCount = 0;
//        String green = "Green";
//        String amber = "Amber";
//        String red = "Red";

//        For each colour
//        For each item in the list
//        Loop over array

        for (int i = 0; i < splitScores.length; i++) {
            for (int j = 0; j < scoresCounter.size(); j++) {
                String key = (String) scoresCounter.keySet().toArray()[j];
                System.out.print(key);
                scoreCounter(splitScores, scoresCounter, i, key);
            }

        }
        return getFinalResult(results, scoresCounter);
    }

    private static void scoreCounter(String[] splitScores, HashMap<String, Integer> scoresCounter, int i, String colourKey) {
        if (colourKey.equals(splitScores[i])) {
            int count = scoresCounter.get(colourKey) + 1;
            scoresCounter.replace(colourKey, count); }
    }

    private static String getFinalResult(ArrayList<String> results, HashMap<String, Integer> scoresCounter) {
        if (scoresCounter.get("Green") > 0) {
            results.add("Green: " + scoresCounter.get("Green"));
        }
        if (scoresCounter.get("Amber") > 0) {
            results.add("Amber: " + scoresCounter.get("Amber"));
        }
        if (scoresCounter.get("Red") > 0) {
            results.add("Red: " + scoresCounter.get("Red"));
        }
        String res = String.join(", ", results);
        return res;
    }


}
