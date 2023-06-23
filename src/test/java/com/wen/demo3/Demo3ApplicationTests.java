package com.wen.demo3;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wen.demo3.dao.UserDao;
import com.wen.demo3.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Demo3ApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
    }

    @Test
    void addOne() {
        User user = new User();
        user.setName("jack");
        user.setAge(20);
        user.setEmail("jack@qq.com");
        userDao.insert(user);
    }

    @Test
    void addOne2() {
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setEmail("zhangsan@qq.com");
        userDao.insert(user);
    }

    /**
     * 删除数据
     */
    @Test
    void dellById() {
        userDao.deleteById(1672263448353767426L);
    }

    @Test
    void updateById() {
        User user = new User();
        user.setId(7L);
        user.setName("张三2");
        userDao.updateById(user);

    }

    @Test
    void selectById() {

        User user = userDao.selectById(1l);
        System.out.println(user);

    }


    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);

        System.out.println("users = " + users);
        for (User user : users) {
            System.out.println(user);
        }

    }

    @Test
    void testSelectByPage(){
        IPage page = new Page(2, 3);

        userDao.selectPage(page, null);

        System.out.println("当前页码： " + page.getCurrent());
        System.out.println("每页显示数量： " + page.getSize());
        System.out.println("总共页数： " + page.getPages());
        System.out.println("总共多少条数据： " + page.getTotal());
        System.out.println("当前页的数据： " + page.getRecords());

    }



}
