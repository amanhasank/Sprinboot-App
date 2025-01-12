package com.example.accessingdatamysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping(path = "/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        userRepository.save(u);
        return "Saved";

    }
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
    @PostMapping(path = "/delete")
    @Transactional
    public @ResponseBody String deleteUser(@RequestParam String name) {
        userRepository.deleteByName(name);
        return "Deleted";
    }
    @PostMapping(path = "/update")
    public @ResponseBody String updateUserName(@RequestParam String name, @RequestParam String updatedName) {
        User myuser = userRepository.findByName(name);
        myuser.setName(updatedName);
        userRepository.save(myuser);

        return "Updated";

    }
}
