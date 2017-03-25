/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.dzik.tmpboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 *
 * @author zaki
 */
@SpringBootApplication(scanBasePackages = {"com.dzik.tmpboot"})
public class AppConfiguration extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppConfiguration.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class, args);
    }
}
