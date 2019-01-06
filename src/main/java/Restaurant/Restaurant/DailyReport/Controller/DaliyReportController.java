package Restaurant.Restaurant.DailyReport.Controller;

import Restaurant.Restaurant.DailyReport.Service.DailyReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/report")
public class DaliyReportController {

    @Autowired
    DailyReportService dailyReportService;

    @GetMapping("/dailyReportPage")
    public String daliyReportPage(Model model){

        model.addAttribute("allDailyReports", dailyReportService.getAll());

        return "report/daily_homepage";
    }




}
