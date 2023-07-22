package de.ait.timepad.controllers;

import de.ait.timepad.dto.NewUserDto;
import de.ait.timepad.dto.UserDto;
import de.ait.timepad.dto.UsersDto;
import de.ait.timepad.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersService usersService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto addUser(@RequestBody NewUserDto newUser){
        return usersService.addUser(newUser);
    }
    @GetMapping
    public UsersDto getAllUsers(){
        return usersService.getAllUsers();
    }
}
