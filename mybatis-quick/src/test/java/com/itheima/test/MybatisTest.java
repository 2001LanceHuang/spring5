package com.itheima.test;

import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-22-10:43
 */
public class MybatisTest {
    @Test
    public void test01() throws IOException {
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
//        获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace+id
        List<User> userList = sqlSession.selectList("userMapper.findAll");
        //打印数据
        System.out.println(userList);
        sqlSession.close();
    }
    @Test
    public void test02() throws IOException {
        User user = new User();
        user.setUsername("tom");
        user.setPassword("123");
        //获得核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapperConfig.xml");
//        获得session工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //获得session会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行操作 参数：namespace+id
        sqlSession.insert("userMapper.save",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
