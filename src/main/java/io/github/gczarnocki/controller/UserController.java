package io.github.gczarnocki.controller;

import io.github.gczarnocki.dao.UserDao;
import io.github.gczarnocki.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/create")
    @ResponseBody
    public String create(String email, String name) {
        User user = new User();
        user.seteMail(email);
        user.setName(name);

        userDao.save(user);

        String userId = String.valueOf(user.getId());

        return "Created User with Id = " + userId;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {
        userDao.delete(id);

        return "User deleted!";
    }

    @RequestMapping("by-email")
    @ResponseBody
    public String getByEmail(String email) {
        User user = userDao.findByEmail(email);
        String userId = String.valueOf(user.getId());

        return "User id = " + userId;
    }
}
