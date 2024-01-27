package com.farcai.terminal.services;

import com.farcai.terminal.entity.Provincia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProvinciaServiceImplTest {

    @Autowired
    private ProvinciaServiceImpl provinciaService;

    @Test
    void testListProvincia() {
        List<Provincia> provincias = provinciaService.findAll();
        assertNotNull(provincias);
        assertFalse(provincias.isEmpty());
    }

    @Test
    void should_GetSingleProvincia_when_ProvideValidID() {
        //given
        Integer id = 4;
        //when
        Provincia carchi = provinciaService.findById(id);
        //then
        assertNotNull(carchi);
        assertEquals(id, carchi.getIdProvincia());
    }

    @Test
    void shouldThrow_when_InvalidID() {
        //given
        Integer id = 200;
        //then
        assertThrows(RuntimeException.class, () -> provinciaService.findById(id));
    }

}