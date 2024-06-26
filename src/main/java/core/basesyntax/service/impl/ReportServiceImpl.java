package core.basesyntax.service.impl;

import core.basesyntax.service.ReportService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReportServiceImpl implements ReportService {
    private static final String CATEGORIES = "fruit,quantity";

    @Override
    public List<String> generateReport(Map<String, Integer> fruitCounts) {
        if (fruitCounts == null) {
            throw new IllegalArgumentException("Can't generate report for null data");
        }
        List<String> report = new ArrayList<>();
        report.add(CATEGORIES);
        for (Map.Entry<String, Integer> entry : fruitCounts.entrySet()) {
            report.add(entry.getKey() + "," + entry.getValue());
        }
        return report;
    }
}

