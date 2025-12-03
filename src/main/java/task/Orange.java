package task;
/* WE DONT USE @Builder IN DEVELOPMENT ENVIRONMENT
@Data and @NoArgConstructor have high usability in DV
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder //Generates an @AllArgsConstructor unless there is another @XConstructor.
public class Orange {
    private int weight;
    private Color color;

}
