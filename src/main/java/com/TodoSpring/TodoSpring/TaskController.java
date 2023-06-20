package com.TodoSpring.TodoSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
public class TaskController {

    private final DataSource dataSource;

    public TaskController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @RequestMapping("/tasks")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("hometasks");

        // Check database connection
        try (Connection connection = dataSource.getConnection()) {
            modelAndView.addObject("message", "Successfully connected to the database.");
        } catch (SQLException e) {
            modelAndView.addObject("message", "Failed to connect to the database.");
        }
        return modelAndView;
    }
}
