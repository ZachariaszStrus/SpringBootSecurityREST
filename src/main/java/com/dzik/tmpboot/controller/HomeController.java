/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dzik.tmpboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author zaki
 */
@RestController
public class HomeController {
    @RequestMapping(value = { "/" }, method = RequestMethod.GET)
    public String getRestaurant(){
        return "lol";
    }
}
