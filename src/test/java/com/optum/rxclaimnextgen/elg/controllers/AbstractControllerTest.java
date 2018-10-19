package com.optum.rxclaimnextgen.elg.controllers;

import com.optum.Application;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@TestPropertySource(locations = {"classpath:test.application.properties" })
public abstract class AbstractControllerTest {
    protected Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected WebApplicationContext wac;

    protected MockMvc mockMvc;


}
