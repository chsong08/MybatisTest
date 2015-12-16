package com.dqsz.mybatis.controller;

import com.dqsz.mybatis.persistence.UserMapper;
import com.dqsz.mybatis.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by chensong on 15/11/30.
 */
@Controller
public class UserController {

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired(required = true)
    private UserMapper userMapper;

    @RequestMapping("/home")
    public String index(Model model) {

        model.addAttribute("desc", "hello song");
        return "index";
    }

    @RequestMapping(value = "/user/{uid}", method = RequestMethod.GET)
    public String userinfo(Model model, @PathVariable("uid") int id) {
        User user = userMapper.getById(id);
        System.out.println("uid= " + user.getId() + " username=" + user.getUserName());
        model.addAttribute("name", user.getUserName());
        return "index";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String save(Model model, @RequestParam("userName") String userName) {
        System.out.println("username= " + userName);
        User user = new User();
        user.setUserName(userName);
        int id = userMapper.save(user);
        System.out.println("uid= " + id + " username=" + user.getUserName());
        model.addAttribute("msg", "yeah! success!");
        return "login";
    }
}
