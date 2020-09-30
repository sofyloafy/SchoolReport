import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SchoolReportTest {
    private SchoolReportGenerator schoolReport = new SchoolReportGenerator();

    @Test
    public void testWriteForSingleScore() {
        assertEquals("Green: 1", SchoolReportGenerator.write("Green"));
        assertEquals("Amber: 1", SchoolReportGenerator.write("Amber"));
        assertEquals("Red: 1", SchoolReportGenerator.write("Red"));
    }

    @Test
    public void testWriteForDoubleScore() {
        assertEquals("Green: 2", SchoolReportGenerator.write("Green, Green"));
        assertEquals("Amber: 2", SchoolReportGenerator.write("Amber, Amber"));
        assertEquals("Red: 2", SchoolReportGenerator.write("Red, Red"));
    }

    @Test
    public void testWriteForTripleScore() {
        assertEquals("Green: 3", SchoolReportGenerator.write("Green, Green, Green"));
        assertEquals("Amber: 3", SchoolReportGenerator.write("Amber, Amber, Amber"));
        assertEquals("Red: 3", SchoolReportGenerator.write("Red, Red, Red"));
    }

    @Test
    public void testWriteForJoinedScores() {
        assertEquals("Green: 1, Amber: 1", SchoolReportGenerator.write("Green, Amber"));
        assertEquals("Green: 1, Amber: 3", SchoolReportGenerator.write("Green, Amber, Amber, Amber"));

    }

    @Test
    public void testWriteForNoScores() {
        assertEquals("", SchoolReportGenerator.write(""));
    }

}
