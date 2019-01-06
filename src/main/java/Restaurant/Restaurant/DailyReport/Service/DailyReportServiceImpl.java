package Restaurant.Restaurant.DailyReport.Service;

import Restaurant.Restaurant.DailyReport.Model.DailyReport;
import Restaurant.Restaurant.DailyReport.Repository.DailyReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DailyReportServiceImpl implements DailyReportService {

    @Autowired
    DailyReportRepository dailyReportRepository;

    @Override
    public DailyReport getDailyReportByDay(LocalDateTime localDateTime) {
        return dailyReportRepository.findByDate(LocalDateTime.now());
    }

    @Override
    public List<DailyReport> getAll() {
        return dailyReportRepository.findAll();
    }
}
