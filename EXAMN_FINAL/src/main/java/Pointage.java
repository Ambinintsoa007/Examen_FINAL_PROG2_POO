import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@EqualsAndHashCode
public class Pointage {
    private LocalDate date;
    private List<Mission> missions;

    public Pointage(LocalDate date, List<Mission> missions) {
        this.date = date;
        this.missions = missions;
    }
    public List<Mission> getMissions() { return missions; }
}
