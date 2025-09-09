import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class TravailleurPrestataire extends Travailleur {
    private double tjmInitial;
    private List<Promotion> promotions;

    public TravailleurPrestataire(int id, String nom, String prenom, String email, String telephone, double tjmInitial) {
        super(id, nom, prenom, email, telephone);
        this.tjmInitial = tjmInitial;
    }

    private double getTJMAtDate(LocalDate date) {
        if (promotions == null || promotions.isEmpty()) {
            return tjmInitial;
        }

        return promotions.stream()
                .filter(p -> !p.getDate().isAfter(date))
                .sorted((p1, p2) -> p2.getDate().compareTo(p1.getDate()))
                .findFirst()
                .map(Promotion::getNouveauMontant)
                .orElse(tjmInitial);
    }
}
