package com.example.controller;

import com.example.service.ChemicalMovementService;
import com.example.model.ChemicalMovement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;

@WebMvcTest(ChemicalMovementController.class)
public class ChemicalMovementControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ChemicalMovementService chemicalMovementService;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void testLogChemicalMovement() throws Exception {
        ChemicalMovement mockMovement = new ChemicalMovement("ChemicalX", "Lab", LocalDateTime.now());
        when(chemicalMovementService.logMovement(anyString(), anyString())).thenReturn(mockMovement);

        mockMvc.perform(post("/chemicalMovements/movement/log")
                .param("chemical_name", "ChemicalX")
                .param("origin", "Lab"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.chemicalName", is("ChemicalX")))
                .andExpect(jsonPath("$.origin", is("Lab")));
    }
}
