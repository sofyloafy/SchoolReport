import java.util.HashMap;

public class SchoolReportGenerator {
    public String write(String scores) {


        String splitScores[] = scores.split(", ");
        HashMap<String, Integer> scoresCounter = new HashMap<String, Integer>();

        scoresCounter.put("Red", 0);
        scoresCounter.put("Amber", 0);
        scoresCounter.put("Green", 0);
//        Integer GreenCount = 0;
//        Integer AmberCount = 0;
//        Integer RedCount = 0;
//        String green = "Green";
//        String amber = "Amber";
//        String red = "Red";


        for (int i = 0; i < splitScores.length; i++)
        {
            if ("Green".equals(splitScores[i])){
                int count = scoresCounter.get("Green") + 1;
                scoresCounter.replace("Green", count);
            } else if ("Amber".equals(splitScores[i])){
                int count = scoresCounter.get("Amber") + 1;
                scoresCounter.replace("Amber", count);
            }
            else if ("Red".equals(splitScores[i])){
                int count = scoresCounter.get("Red") + 1;
                scoresCounter.replace("Red", count);
            }

        }

//        String output = String.format(": %s", count);
//        return scores + output;
        return String.valueOf(scoresCounter);
    }}
