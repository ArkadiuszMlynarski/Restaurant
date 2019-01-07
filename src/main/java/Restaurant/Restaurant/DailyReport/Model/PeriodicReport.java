package Restaurant.Restaurant.DailyReport.Model;


import lombok.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PeriodicReport {

    private List<DailyReport> listDailyReports;

    private LocalDate begin;

    private LocalDate end;

    private HashMap<String, Float> dish_price;

    private HashMap<String, Integer> dish_quantity;

    private float profits;
}
