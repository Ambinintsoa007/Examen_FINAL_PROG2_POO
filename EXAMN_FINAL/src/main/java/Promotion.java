
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Promotion {
    private LocalDate date;
    private double nouveauMontant;
    private String raison;

    public Promotion(LocalDate date, double nouveauMontant, String raison) {
        this.date = date;
        this.nouveauMontant = nouveauMontant;
        this.raison = raison;
    }
}
