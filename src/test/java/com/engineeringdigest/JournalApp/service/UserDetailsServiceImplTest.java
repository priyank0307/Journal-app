package com.engineeringdigest.JournalApp.service;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;


import com.engineeringdigest.JournalApp.entity.User; // Make sure this is your entity, not Spring Security's User
import com.engineeringdigest.JournalApp.repository.UserRepository;

@SpringBootTest 
public class UserDetailsServiceImplTest {

    @InjectMocks 
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach 
    void setUp(){
        MockitoAnnotations.openMocks(this); // Fixed deprecation warning
    }      
    
    @Test 
    void loadUserByUsernameTest(){
        // Mock the repository to return your custom Entity User, not Spring Security's User
        User mockUser = User.builder()
                .userName("ram")
                .password("aadaada")
                .roles(new ArrayList<>())
                .build();

        when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn(mockUser);
        
        // Fixed Java syntax error (removed 'username:')
        UserDetails user = userDetailsService.loadUserByUsername("ram");
        
        Assertions.assertNotNull(user);
    }
}
