package io.github.gczarnocki.controller;

import io.github.gczarnocki.dao.UserDao;
import io.github.gczarnocki.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", userDao.findAll());

        return "user/list";
    }

    @RequestMapping("/create")
    public String create(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "email", required=false) String email,
            Model model) {
        User user = new User();
        user.seteMail(email);
        user.setName(name);

        userDao.save(user);

        return this.list(model);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(
            @RequestParam(name="id", required=true) long id) {
        userDao.delete(id);

        return "User deleted!";
    }

    @RequestMapping("/delete-all")
    public String deleteAll(Model model) {
        userDao.deleteAll();

        return this.list(model);
    }

    @RequestMapping("by-email")
    public String getByEmail(
            @RequestParam(name="email", required=true) String email,
            Model model) {
        User user = userDao.findByEmail(email);

        model.addAttribute("user", user);

        return "user/user";
    }
}
