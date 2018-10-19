package com.optum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * Created by bkocinsk on 6/20/2018.
 */

/*
@SpringBootApplication
@Configuration
@ComponentScan({"com.optum.ibm", "com.optum.rxclaimnextgen.elg"})
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
*/


@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations = {"classpath:test.application.properties" })
public class ApplicationTest {
    @Value("${bk1.baseurl}")
    private String bk1;

    @Test
    public void contextLoads() {
        System.out.println("bk1=" + bk1);
    }

}
