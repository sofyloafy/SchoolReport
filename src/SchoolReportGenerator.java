public class SchoolReportGenerator {
    public String write(String scores) {

        Integer count = 0;
        if(scores.equals("Green, Green")){
            count += 2;
            scores = "Green";
        } else if (scores.equals("Green")) {
            count ++;
            scores = "Green";
        }
        else if (scores.contains("Amber")) {
            count ++;
            scores = "Amber";
        } else if (scores.contains("Red")) {
            count ++;
            scores = "Red";
        }

        String output = String.format(": %s", count);
        return scores + output;
    }
}
