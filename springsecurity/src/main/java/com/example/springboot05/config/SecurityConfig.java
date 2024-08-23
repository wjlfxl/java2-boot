package com.example.springboot05.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import javax.sql.DataSource;


@Configuration
@EnableWebSecurity   //启用security安全框架的安全校验
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    授权
    @Override
    protected void configure(HttpSecurity http)throws Exception{
//        登陆页所有人可以访问，功能页只有对应有权限的人才能访问
        http.authorizeRequests()
                .antMatchers( "/index").permitAll()
//                vip1能进
                //拦截的是跳转链接
                .antMatchers("/emps").hasRole("admin")
                .antMatchers("/orders").hasRole("admin")
                .antMatchers("/products").hasRole("normal");
//                .antMatchers("/emp/**").hasRole("vip1")
//                .antMatchers("/Orders/**").hasRole("vip1")
//                .antMatchers("/Products/**").hasRole("vip1");

//        没有权限会调到登陆页面、默认的登陆页面
//        http.formLogin();
        http.formLogin().loginPage("/toLogin"); //前端跳转也需要改成toLogin
//        http.formLogin().loginPage("/toLogin").loginProcessingUrl("/login"); //前端跳转也可以login
        //默认接受数据是username和password，也可以改变其name
//        http.formLogin().loginPage("/toLogin").passwordParameter("pwd").usernameParameter("user").loginProcessingUrl("/login");


        //开启了注销功能、也会自动请求/logout   看源码大有收获
//        http.logout();
        //定制登陆页
        http.logout().logoutSuccessUrl("/");
//        http.logout().deleteCookies("remove").invalidateHttpSession(true);//清空cookie

        //开启记住我功能.记住我功能本质就是cookie. 默认保存14天
//        http.rememberMe();
        http.rememberMe().rememberMeParameter("remember");//自定义记住我功能的name


        //防止网站工具: get.post
//        http.csrf().disable();//关闭csrf功能:跨站请求伪造,默认只能通过post方式提交logout请求
//        http.logout().logoutSuccessUrl("/");
    }


//    权限认证与授权hasRole("admin")，配合使用
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{
//    在方法中配置用户名和密码，作为用户登录的数据

//    创建一个密码加密的实现类passwordEncoder，引用
        PasswordEncoder pe = passwordEncoder();

//     给用户添加角色,在roles里添加.
//        auth.inMemoryAuthentication()
//                .withUser("www")
//                .password(pe.encode("123"))
//                .roles("admin","normal");
        auth.inMemoryAuthentication()
                .withUser("wer")
                .password(pe.encode("1234"))
                .roles("admin").and();
        auth.inMemoryAuthentication()
                .withUser("eee")
                .password(pe.encode("1234"))
                .roles("normal").and();
    }

    //    创建密码的加密类，算法多种，自行选择合适的算法
    @Bean
    public PasswordEncoder passwordEncoder(){
        // 通过passwordEncoder的实现类，实现加密算法
        return new BCryptPasswordEncoder();
    }


//    @Autowired
//    private DataSource dataSource;
//
//    //权限认证--也可以从数据库里取数据
//    @Override
//    protected void configureGlobal(AuthenticationManagerBuilder auth)throws Exception{
//        User.UserBuilder users = User.withUserDetails();
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .withDefaultSchema()
//                .withUser(users.username("user").password("password").roles("user"))
//                .withUser(users.username("admin").password("password").roles("admin"));
//    }

}
