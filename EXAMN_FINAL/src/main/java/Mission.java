import lombok.Getter;

@Getter
public class Mission {

    private TypeDeTravail type;
    private double quota;
    private String description;
    private String couleur;

    public Mission(TypeDeTravail type, double quota, String description, String couleur) {
        this.type = type;
        this.quota = quota;
        this.description = description;
        this.couleur = couleur;
    }
}
