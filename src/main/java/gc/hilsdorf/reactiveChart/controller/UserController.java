package gc.hilsdorf.reactiveChart.controller;

import gc.hilsdorf.reactiveChart.model.User;
import gc.hilsdorf.reactiveChart.repository.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController if where all the endpoints related with the user are
 * implemented.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * This endpoint returns all the users saved inside the database by ordered
     * by ID ASC, in case of any failure a 500 error will be the response.
     *
     * @return a list with all users inside the database table <b>user</b>.
     */
    @RequestMapping("/getUsers")
    public ResponseEntity<List<User>> findAllUsers() {
        try {
            List<User> users = new ArrayList<>();
            userRepository.findAll().forEach(users::add);

            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
