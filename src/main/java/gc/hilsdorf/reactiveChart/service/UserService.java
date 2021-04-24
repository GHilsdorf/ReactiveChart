package gc.hilsdorf.reactiveChart.service;

import gc.hilsdorf.reactiveChart.model.User;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public List<User> findAllUsers() {

        String sql = "SELECT * FROM `user`";

        //TODO
        List<User> users = null;

        return users;
    }
}
