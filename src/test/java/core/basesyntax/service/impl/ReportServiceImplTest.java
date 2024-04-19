package core.basesyntax.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import core.basesyntax.service.ReportService;
import java.util.Map;
import org.junit.jupiter.api.Test;

class ReportServiceImplTest {
    private static final String CATEGORIES = "fruit,quantity";
    private final ReportService reportService = new ReportServiceImpl();

    @Test
    void generateReport() {
        assertEquals(CATEGORIES, reportService.generateReport(Map.of()).get(0));
        assertEquals("apple,3", reportService.generateReport(Map.of("apple", 3)).get(1));
        assertEquals("banana,5", reportService.generateReport(Map.of("banana", 5)).get(1));
        assertEquals("orange,7", reportService.generateReport(Map.of("orange", 7)).get(1));
    }
}
