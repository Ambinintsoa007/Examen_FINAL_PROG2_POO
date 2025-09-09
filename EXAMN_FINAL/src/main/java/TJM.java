import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class TJM {
    private final float initialValue;
    private final List<Promotion> promotions;
}

