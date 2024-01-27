package com.farcai.terminal.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CloudinaryServiceImplTest {
    @Autowired
    private CloudinaryServiceImpl cloudinaryService;

    @Test
    void getPathImage() {
        //given
        String url = "http://res.cloudinary.com/dcpx2vfb2/image/upload/v1706287952/terminal/suyp02xznmkbmc46avae.png";
        //when
        String result = cloudinaryService.getPathImage(url);

        //then
        assertNotEquals("", result);
        assertFalse(result.contains("v1706287952/"));
        assertEquals("terminal/suyp02xznmkbmc46avae", result);

    }
}