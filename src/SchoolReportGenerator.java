import java.util.ArrayList;
import java.util.HashMap;

public class SchoolReportGenerator {
    public String write(String scores) {
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

        for (int i = 0; i < splitScores.length; i++) {
            if ("Green".equals(splitScores[i])) {
                int count = scoresCounter.get("Green") + 1;
                scoresCounter.replace("Green", count);

            } else if ("Amber".equals(splitScores[i])) {
                int count = scoresCounter.get("Amber") + 1;
                scoresCounter.replace("Amber", count);
            } else if ("Red".equals(splitScores[i])) {
                int count = scoresCounter.get("Red") + 1;
                scoresCounter.replace("Red", count);
            }

        }
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
