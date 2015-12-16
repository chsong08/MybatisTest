package com.dqsz.mybatis.persistence;

import com.dqsz.mybatis.domain.User;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by chensong on 15/12/15.
 */
public class UserTest {
    @Test
    public void testUser() {
        User user = new User();
        user.setUserName("chensong");
        Assert.assertEquals("chensong", user.getUserName());
    }
}
