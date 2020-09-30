import java.util.ArrayList;
import java.util.HashMap;

public class SchoolReportGenerator {
    public static String write(String scores) {
        String green = "Green";
        String amber = "Amber";
        String red = "Red";

        ArrayList<String> results = new ArrayList<String>();
        String splitScores[] = scores.split(", ");

        HashMap<String, Integer> scoresCounter = new HashMap<String, Integer>();
        scoresCounter.put(green, 0);
        scoresCounter.put(amber, 0);
        scoresCounter.put(red, 0);

        for (int i = 0; i < splitScores.length; i++) {
            for (int j = 0; j < scoresCounter.size(); j++) {
                String key = (String) scoresCounter.keySet().toArray()[j];
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
        String green = "Green";
        String amber = "Amber";
        String red = "Red";
        if (scoresCounter.get(green) > 0) {
            results.add("Green: " + scoresCounter.get(green));
        }
        if (scoresCounter.get(amber) > 0) {
            results.add("Amber: " + scoresCounter.get(amber));
        }
        if (scoresCounter.get(red) > 0) {
            results.add("Red: " + scoresCounter.get(red));
        }
        String res = String.join(", ", results);
        return res;
    }


}
