import lombok.Getter;

import java.util.List;

@Getter
public class TravailleurSalarie extends Travailleur{
    private final SalaireMensuel salaireMensuel;
    public TravailleurSalarie(int id, String nom, String prenom, String email, String numeroTelephone, List<Pointage> pointages,  SalaireMensuel salaireMensuel) {
        super(id, nom, prenom, email, numeroTelephone,  pointages);
        this.salaireMensuel = salaireMensuel;
    }
}
