package com.example.demo.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PhoneControllerTest {

    @Autowired
    private PhoneRepository phoneRepository;

    @Test
    public void test(){
        Phone entity = new Phone();
        entity.setOs("Kak");
        entity.setPhoneName("kak");
        Phone save = phoneRepository.save(entity);
        Optional<Phone> one = phoneRepository.findByUuid(save.getUuid());
        assertEquals(save, one.get());
    }

}