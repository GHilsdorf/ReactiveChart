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
    public static enum region {
        UNITED_STATES, EUROPE, APAC, LATIN_AMERICA;
    }

    /**
     * Unique and numeric sequential value to each user
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    /**
     * Value between 1 and 12 (indicating month of birth)
     */
    @Column(name = "birthday")
    private int birthday;
    /**
     * Value between 0 and 5000, indicating how much a customer has spent with
     * the company in euros
     */
    @Column(name = "spend")
    private int spend;
    /**
     * ENUM of the customer region
     */
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "region")
    private region region;

}
