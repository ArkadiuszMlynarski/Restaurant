package Restaurant.Restaurant.DailyReport.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
@RequestMapping("admin/report")
public class PeriodicReportController {

    @GetMapping("/periodicReportPage")
    public String getPeriodicReportHomepage(){

        return "report/periodicReportHomepage";
    }

    @PostMapping("/getReportByDate")
    public String getReportByDate(@RequestParam String begin, @RequestParam String end){

        LocalDate localDateBegin = LocalDate.parse(begin);
        LocalDate localDateEnd = LocalDate.parse(end);

        System.out.println("LocalDate od: = "+localDateBegin+",    do: "+localDateEnd);
        return "report/periodicReportHomepage";
    }


}
