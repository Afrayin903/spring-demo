package comparatorInterface;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.awt.*;

@Data
@AllArgsConstructor
@Builder
public class Apple {
    private int weight;
    public Color color;
}
