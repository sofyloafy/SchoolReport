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
    }

}
