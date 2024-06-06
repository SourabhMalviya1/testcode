package com.show.recap.controller;

import com.show.recap.dto.JoinWishlist;
import com.show.recap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wishlist")
public class SingUpController {

    @Autowired
    private UserService service;

//    public SingUpController(UserService service) {
//        this.service = service;
//    }
//    @GetMapping("/register")
//     public ModelAndView showForm() {
//    return new ModelAndView("signup", "joinWishlist", new JoinWishlist());
//    }

    @PostMapping("/register")
    public String registerUser(@RequestBody JoinWishlist wishlist){
         service.registerUser(wishlist);
        return "user registerd";
    }
}
