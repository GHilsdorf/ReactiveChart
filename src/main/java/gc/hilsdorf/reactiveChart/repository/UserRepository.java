package gc.hilsdorf.reactiveChart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gc.hilsdorf.reactiveChart.model.User;

/**
 * No method was implemented within this class because only findAll() is used at
 * the moment and as it is native to JPA there is no need for implementation.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
