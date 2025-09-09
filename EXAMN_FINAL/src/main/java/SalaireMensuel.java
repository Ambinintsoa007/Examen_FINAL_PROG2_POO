import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class SalaireMensuel {
    private final float value;
    private final List<Promotion> promotions;

}