package me.protik.simplyblog.my_users;

import java.security.Principal;
import me.protik.simplyblog.models.MyUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class MyUsersController {
    @Autowired
    private MyUsersService myUsersService;

    @GetMapping("/user/profile")
    Optional<MyUsers> userProfile(Principal principal){
        return myUsersService.showMyProfile(principal.getName());
    }
    @GetMapping("/user")
    public String userHome(){
        return "Welcome User";
    }
    @GetMapping("/user/{id}")
    public Optional<MyUsers> showUser(@PathVariable Long id){
        return myUsersService.showUserService(id);
    }
    @PostMapping("/user/add/")
    public void addUser(@RequestBody MyUsers user){
        myUsersService.addUserService(user);
    }
    @GetMapping("/admin")
    public String adminHome(){
        return "Welcome Admin";
    }
}
