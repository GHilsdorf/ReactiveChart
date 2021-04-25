package gc.hilsdorf.reactiveChart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

/**
 * Class used to create the user object.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {

    /**
     * <b>Warning:</b> If new region values are added in the database, they need
     * to be included here before avoiding issues with the JPA persistence. The
     * database int values should follow the ENUM sequence, where UNITED_STATES
     * = 0, EUROPE = 1, etc.
     */
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
