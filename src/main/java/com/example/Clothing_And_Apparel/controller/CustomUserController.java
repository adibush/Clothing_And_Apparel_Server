package com.example.Clothing_And_Apparel.controller;

import com.example.Clothing_And_Apparel.model.CustomUser;
import com.example.Clothing_And_Apparel.service.CustomUserService;
import com.example.Clothing_And_Apparel.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class CustomUserController {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    CustomUserService customUserService;

    @PostMapping(value = "/create")
    @CrossOrigin
    public ResponseEntity<?> postUser(@RequestBody CustomUser customUser) {

        try {
            customUserService.postUser(customUser);
            return null;
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());

        }
    }

    @DeleteMapping(value = "/delete")
    @CrossOrigin
    public void deleteUser(@RequestParam(value = "Authorization") String token) {
        String jwt = token.substring(7);
        String userName = jwtUtil.extractUsername(jwt);
        customUserService.deleteUserByUserName(userName);
    }

    @PutMapping(value = "/update")
    public void updateUser(@RequestBody CustomUser customUser) {
        customUserService.updateUser(customUser);
    }

    @GetMapping(value = "/get", params = "id")
    public CustomUser getUserById(@RequestParam Integer id) {
        return customUserService.getUserById(id);
    }

    @GetMapping(value = "/get/password", params = "phone")
    public int getPasswordByPhone(@RequestParam String phone) {
        return customUserService.getPasswordByPhone(phone);
    }

    @GetMapping(value = "/get/phone")
    public List<String> getAllPhone() {
        return customUserService.getAllPhone();

    }


}










