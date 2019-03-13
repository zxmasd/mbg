package com.baizhi.test;

import com.baizhi.dao.AdminMapper;
import com.baizhi.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MbgApplicationTests {

    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void contextLoads() {
       // Admin admin = new Admin();
       // admin.setId("1");
        Admin admin = adminMapper.selectByPrimaryKey("1");
        System.out.println(admin);
        System.out.println("lalall");

    }

}
