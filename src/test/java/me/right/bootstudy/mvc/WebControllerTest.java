package me.right.bootstudy.mvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest
class WebControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void guhandlerArgumentResolverTest() throws Exception{

        mockMvc.perform(
            post("/test")
        );

    }


}