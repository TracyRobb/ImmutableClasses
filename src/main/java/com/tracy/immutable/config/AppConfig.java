/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.immutable.config;

import com.tracy.immutable.model.members.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author student
 */

@Configuration
public class AppConfig {
    
    @Bean (name = "addrObj")
    public Address.Builder getAddress()
    {
        return new Address.Builder(37);
    }
    
    
}
