package org.hrabur.test.api;

import java.util.List;

import org.hrabur.test.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/users")
public class UserApi {

    @GetMapping
    public List<User> listUsers() {
        return null;
    }

    @GetMapping(path = "{userId}")
    public User getUser(@PathVariable final String userId) {
        return null;
    }
}
