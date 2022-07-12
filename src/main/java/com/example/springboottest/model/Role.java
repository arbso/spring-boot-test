package com.example.springboottest.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

    public enum Role implements GrantedAuthority {
        ROLE_ADMIN, ROLE_USER;

        public String getAuthority() {
            return name();
        }


    }
