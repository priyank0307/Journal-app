package com.engineeringdigest.JournalApp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.engineeringdigest.JournalApp.entity.User;
import com.engineeringdigest.JournalApp.repository.UserRepository;

@SpringBootTest 
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @ParameterizedTest 
    @ValueSource(strings={
        "ram",
        "shyam",
        "vipul"
    })
    public void testFindByUserName(String name){
        assertNotNull(userRepository.findByUserName(name));
    }

    @Disabled 
    @ParameterizedTest 
    @CsvSource({
        "1 , 1, 2",
        "2, 10, 12",
        "3, 3, 9"
    })
    public void test(int a, int b, int expected){
        assertEquals(expected, a+b);
    }


}
