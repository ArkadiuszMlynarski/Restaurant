package Restaurant.Restaurant.DailyReport.Service;

import Restaurant.Restaurant.DailyReport.Model.DailyReport;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public interface DailyReportService {

    DailyReport getDailyReportByDay(LocalDateTime localDateTime);

    List<DailyReport> getAll();
}
