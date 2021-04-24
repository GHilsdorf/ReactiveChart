package gc.hilsdorf.reactiveChart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private int id;
    private int birthday;
    private int spend;
    private int region;
}
