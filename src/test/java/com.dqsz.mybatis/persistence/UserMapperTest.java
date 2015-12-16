package com.dqsz.mybatis.persistence;

import com.dqsz.mybatis.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.util.MatcherAssertionErrors.assertThat;

/**
 * Created by chensong on 15/12/4.
 */
@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath*:/dispatcher-servlet.xml",
        "classpath*:/applicationContext-db.xml" })
public class UserMapperTest //extends AbstractDependencyInjectionSpringContextTests {
//    extends AbstractJUnit4SpringContextTests {
{

    @Autowired(required = true)
    private UserMapper userMapper;


    @Before
    public void setUp() {
//        userMapper = (UserMapper) applicationContext.getBean("userMapper");
    }

    @After
    public void tearDown() {

    }

    @Test(expected = org.springframework.beans.factory.NoSuchBeanDefinitionException.class)
    public void getUser() throws Exception {
        User user = userMapper.getById(1);
        assertThat(user.getUserName(), equalTo("chensong"));
    }
}
