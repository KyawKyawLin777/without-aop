package com.demo.format;

import com.demo.ds.FormattedReport;
import com.demo.ds.Report;
import org.springframework.stereotype.Component;

@Component
public class ReportFormatter {

    public FormattedReport formattedReport(Report report) {
        System.out.println(this.getClass().getSimpleName() + "formatted Report");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new FormattedReport();
    }
}
