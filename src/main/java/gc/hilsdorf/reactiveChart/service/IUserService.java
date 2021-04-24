package gc.hilsdorf.reactiveChart.service;

import gc.hilsdorf.reactiveChart.model.User;
import java.util.List;

public interface IUserService {

    public List<User> findAllUsers();
}
