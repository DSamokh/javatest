package javatest.model;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:web/WEB-INF/spring-dispatcher-servlet.xml"})


public class MessageServiceTest {
    @Autowired
    MessageService messageService;

    @Test
    public void testGetMessage(){
        Assert.assertEquals("Hello", messageService.getMessageInfo());
    }
}
