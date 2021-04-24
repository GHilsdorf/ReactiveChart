package gc.hilsdorf.reactiveChart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    private enum region {
        UNITED_STATES, EUROPE, APAC, LATIN_AMERICA;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "birthday")
    private int birthday;
    @Column(name = "spend")
    private int spend;
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "region")
    private region region;

}
