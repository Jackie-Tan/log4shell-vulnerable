package com.vnetwork.org.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class MainController {
    private static final Logger logger = LogManager.getLogger("Hello");

    @GetMapping("/")
    public ModelAndView index(HttpServletRequest request) {
        String apiVersion = request.getHeader("X-Api-Version");

        logger.info("Received a request for API version " + apiVersion);

        return new ModelAndView("index");
    }
}