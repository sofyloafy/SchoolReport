

public class SchoolReportGenerator {
    public String write(String scores) {

        String splitScores[] = scores.split(", ");
        Integer count = 0;
        String green = "Green";
        String amber = "Amber";
        String red = "Red";


        for (int i = 0; i < splitScores.length; i++)
        {
            if (green.equals(splitScores[i])){
                scores = green;
                count++;
            } else if (amber.equals(splitScores[i])){
                scores = amber;
                count++;
            }
            else if (red.equals(splitScores[i])){
                scores = red;
                count++;
            }

        }

        String output = String.format(": %s", count);
        return scores + output;
    }}
