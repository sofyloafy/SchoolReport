import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SchoolReportTest {
    private SchoolReportGenerator schoolReport = new SchoolReportGenerator();

    @Test
    public void testWrite() {
        assertEquals("Green: 1",schoolReport.write("Green"));
    }
}
