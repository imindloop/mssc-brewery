package com.imindloop.msscbrewery.web.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.imindloop.msscbrewery.web.model.BeerDTO;
import com.imindloop.msscbrewery.web.services.BeerService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(BeerController.class)
public class BeerControllerTest {
}
