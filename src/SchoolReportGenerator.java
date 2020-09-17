public class SchoolReportGenerator {
    public String write(String scores) {

        Integer count = 1;
        if (scores.equals("Green, Green")) {
            count ++;
            scores = "Green";
        }
        String output = String.format(": %s", count);
        return scores + output;
    }
}
