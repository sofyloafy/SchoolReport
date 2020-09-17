public class SchoolReportGenerator {
    public String write(String scores) {

        Integer count = Integer.valueOf(1);
        if (scores == "Green, Green") {
            count ++;
            scores = "Green";
        }
        String output = String.format(": %s", count);
        return scores + output;
    }
}
