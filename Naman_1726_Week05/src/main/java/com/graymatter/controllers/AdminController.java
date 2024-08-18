package com.graymatter.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AdminController {
	String ADMIN_EMAIL="adminMy@gmail.com";
	String ADMIN_PASSWORD="admin@123";
	@PostMapping("/admin/login")
    public String adminLogin(@PathVariable String email, @PathVariable String password) {
        if (ADMIN_EMAIL.equals(email) && ADMIN_PASSWORD.equals(password)) {
            return "Admin login successful";
        } else {
            return "Invalid admin credentials";
        }
    }
}
