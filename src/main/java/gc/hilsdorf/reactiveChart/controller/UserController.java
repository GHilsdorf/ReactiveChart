package gc.hilsdorf.reactiveChart.controller;

import gc.hilsdorf.reactiveChart.model.User;
import gc.hilsdorf.reactiveChart.service.IUserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/getUsers")
    public List<User> findUsers() {

        return userService.findAllUsers();
    }
}
