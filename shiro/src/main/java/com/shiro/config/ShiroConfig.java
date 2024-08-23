package com.shiro.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

//@Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。目的是创建一个类。当spring需要创建指定的一个类时会调用这个注解（@Bean）的方法。
@Configuration
public class ShiroConfig {
    // ShiroFilterFactoryBean  第三步   三个方法从下向上引用
    @Bean(name = "shiroFilterFactoryBean")
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean bean= new ShiroFilterFactoryBean();
        //设置安全管理器
        bean.setSecurityManager(defaultWebSecurityManager);

        //添加shiro的内置过滤器
       /* anon:无需认证就可以访问
        authc:必须认证了才能让问
        user:必须拥有记住我功能才能用
        perms :拥有对某个资源的权限才能访问;
        role:拥有某个角色权限才能访问
        */
        //链式
        Map<String, String> filterMap = new LinkedHashMap<>();

        filterMap.put("/orders","anon");
        filterMap.put("/products","authc");
        bean.setFilterChainDefinitionMap(filterMap);

        //设置没有权限跳转登陆的的链接
        bean.setLoginUrl("/toLogin");

        return bean;
    }

    // DefaultWebSecurityManager  第二步
    //Qualifier  指定方法名进行绑定   defaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm)
    @Bean(name = "defaultWebSecurityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }


    // 创建realm 对象,需要自定义.第一步
    @Bean(name = "userRealm")
    public UserRealm userRealm(){
        return new UserRealm();
    }

}
