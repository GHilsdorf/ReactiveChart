package gc.hilsdorf.reactiveChart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import gc.hilsdorf.reactiveChart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
