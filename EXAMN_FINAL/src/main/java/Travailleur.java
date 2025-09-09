import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
public abstract class Travailleur {
    private final int id;
    private final String nom;
    private final String prenom;
    private final String email;
    private final String numeroTelephone;
    private final List<Pointage>  pointages;

    public boolean pointageRouge(LocalDate date)  {
        Pointage pointageDuJour = pointages.stream()
                .filter(p -> p.getDate().equals(date))
                .findFirst()
                .orElse(null);

        if (pointageDuJour == null) {
            return false;
        }

        double totalQuota = 0.0;


        for (Mission mission : pointageDuJour.getMissions()) {
            double quota = mission.getQuota();

            if (quota <= 0 || quota > 1) {
                throw new IllegalArgumentException("Le quota doit être compris entre 0 et 1 . Quota trouvé: " + quota);
            }
            totalQuota += quota;
        }

        return Math.abs(totalQuota - 1.0) < 0.0001;
    }

}
