package com.springboot.usersystemmanagiment.controller;

import com.springboot.usersystemmanagiment.entity.User;
import com.springboot.usersystemmanagiment.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public String listUser(Model model){
        model.addAttribute("users", userService.getAllUser());
        return "users";
    }

    @GetMapping("/users/new")
    public String createUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }

    @PostMapping("/users")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/users";
    }
    @GetMapping("/users/edit/{id}")
    public String editUserFrom(@PathVariable Long id, Model model ){
    model.addAttribute("user", userService.getUserByID(id));
    return "edit_user";
    }
    @PostMapping("/users/{id}")
    public  String UpdateUser(@PathVariable Long id, @ModelAttribute("user") User user, Model model){

        // get from db
        User extiUser = userService.getUserByID(id);
        extiUser.setId(id);
        extiUser.setFirstName(user.getFirstName());
        extiUser.setLastName(user.getLastName());
        extiUser.setEmail(user.getEmail());

        //update
        userService.updateUser(extiUser);

        return "redirect:/users";
    }

    // method for delete user
    @GetMapping("/users/{id}")
    public String deteleUser(@PathVariable Long id){
        userService.deleteUserByID(id);
        return "redirect:/users";
    }
}
