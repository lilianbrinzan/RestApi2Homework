package de.ait.timepad.controller;

import de.ait.timepad.dto.NewUserDto;
import de.ait.timepad.dto.UserDto;
import de.ait.timepad.models.User;
import de.ait.timepad.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@RequiredArgsConstructor
@Controller
public class UsersController {

    private final UsersService usersService;

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public UserDto addUser(@RequestBody NewUserDto newUser){
        return usersService.addUser(newUser);
    }
}
