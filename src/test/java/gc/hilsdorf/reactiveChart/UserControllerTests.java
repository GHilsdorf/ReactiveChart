package gc.hilsdorf.reactiveChart;

import static org.assertj.core.api.Assertions.assertThat;

import gc.hilsdorf.reactiveChart.model.User;
import gc.hilsdorf.reactiveChart.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

/**
 * This class tests the scenarios used inside the userRepository
 */
@DataJpaTest
public class UserControllerTests {

    @Autowired
    UserRepository userRepository;

    /**
     * This test covers the findAll() inside userRepository, first a sample of
     * random valid values used in the \src\main\resources\data.sql file are
     * provided, then the result of userRepository.findAll() is saved, later the
     * assert checks if the amount of results are the same as expected and if
     * all the random samples exists inside the result set.
     */
    @Test
    public void testFindAll() {

        // <editor-fold defaultstate="collapsed" desc=" TEST SAMPLE ">
        User user1 = new User(1, 10, 4313, User.region.LATIN_AMERICA);
        User user2 = new User(2, 9, 1593, User.region.EUROPE);
        User user3 = new User(3, 5, 4512, User.region.LATIN_AMERICA);
        User user4 = new User(4, 7, 4929, User.region.EUROPE);
        User user50 = new User(50, 9, 3712, User.region.APAC);
        User user250 = new User(250, 6, 3937, User.region.UNITED_STATES);
        User user500 = new User(500, 7, 623, User.region.APAC);
        //</editor-fold>

        Iterable<User> users = userRepository.findAll();

        assertThat(users).hasSize(500).contains(user1, user2, user3, user4, user50, user250, user500);
    }
}
