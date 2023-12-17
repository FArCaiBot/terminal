package com.farcai.terminal.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProvinciaTest {

    Provincia provincia;

    @BeforeEach
    void setUp() {
        provincia=new Provincia(1,"Pichincha");
    }

    @Test
    void testSetId(){
        //when
        provincia.setIdProvincia(2);
        //then
        assertEquals(2, provincia.getIdProvincia());
    }

    @Test
    void testSetProvincia(){
        //when
        provincia.setNombreProvincia("Loja");
        //then
        assertEquals("Loja",provincia.getNombreProvincia());
    }

    @Test
    void testNoArgsConstructor(){
        //given
        Provincia azuay=new Provincia();
        //then
        assertNull(azuay.getIdProvincia());

    }
}