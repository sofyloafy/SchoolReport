import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SchoolReportTest {
    private SchoolReportGenerator schoolReport = new SchoolReportGenerator();

    @Test
    public void testWriteForSingleScore() {
        assertEquals("Green: 1",schoolReport.write("Green"));
        assertEquals("Amber: 1",schoolReport.write("Amber"));
        assertEquals("Red: 1",schoolReport.write("Red"));
    }

    @Test
    public void testWriteForDoubleScore() {
        assertEquals("Green: 2",schoolReport.write("Green, Green"));
        assertEquals("Amber: 2",schoolReport.write("Amber, Amber"));
        assertEquals("Red: 2",schoolReport.write("Red, Red"));
    }

    @Test
    public void testWriteForTripleScore() {
        assertEquals("Green: 3",schoolReport.write("Green, Green, Green"));
        assertEquals("Amber: 3",schoolReport.write("Amber, Amber, Amber"));
        assertEquals("Red: 3",schoolReport.write("Red, Red, Red"));
    }

}
