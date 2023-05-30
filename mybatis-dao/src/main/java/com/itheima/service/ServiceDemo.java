package com.itheima.service;

import com.itheima.dao.UserMapper;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-22-16:50
 */
public class ServiceDemo {
    public static void main(String[] args) throws IOException {

        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
//        获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> all = mapper.findAll();
//        System.out.println(all);
        User user = mapper.findById(1);
        System.out.println(user);
    }
}
