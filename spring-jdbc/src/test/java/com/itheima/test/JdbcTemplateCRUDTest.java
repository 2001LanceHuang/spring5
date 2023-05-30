package com.itheima.test;

import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author lance huang
 * @create 2023-05-07-17:42
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void testUpdate(){
        jdbcTemplate.update("update account set money=? where name=?",10000000,"余紫云");
    }
    @Test
    public void testDelete(){
        jdbcTemplate.update("delete from account where name=?","tom");
    }
     @Test
    public void testQueryAll(){
         List<Account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
         System.out.println(accountList);
     }
    @Test
    public void testQueryOne(){
         Account account = jdbcTemplate.queryForObject("select * from account where name =?", new BeanPropertyRowMapper<Account>(Account.class),"郭宇");
         System.out.println(account);
     }
     @Test
    public void testQueryCount(){
         Long count = jdbcTemplate.queryForObject("select count(*) from account", long.class);
         System.out.println(count);
     }

}
