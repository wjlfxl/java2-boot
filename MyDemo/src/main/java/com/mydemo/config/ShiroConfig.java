package com.mydemo.config;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.session.mgt.WebSessionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.LinkedHashMap;
import java.util.Map;

//@Bean是一个方法级别上的注解，主要用在@Configuration注解的类里，也可以用在@Component注解的类里。目的是创建一个类。当spring需要创建指定的一个类时会调用这个注解（@Bean）的方法。
@Configuration
public class ShiroConfig implements HandlerInterceptor {
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
        //拦截      链式
        Map<String, String> filterMap = new LinkedHashMap<>();

//        授权操作
//        filterMap.put("/products","perms[user:admin]");

        filterMap.put("/admin/*","authc");
        filterMap.put("/index","anon");
        bean.setFilterChainDefinitionMap(filterMap);

        //设置没有权限跳转登陆的的链接
        bean.setLoginUrl("/toLogin");
//        未授权跳转的页面
//        bean.setUnauthorizedUrl("/noAuthorize");

        return bean;
    }

    @Bean
    @Qualifier("webSessionManager")
    public DefaultWebSessionManager sessionManager() {
        DefaultWebSessionManager defaultWebSessionManager = new DefaultWebSessionManager();
        defaultWebSessionManager.setSessionIdUrlRewritingEnabled(false);
        return defaultWebSessionManager;
    }

    // DefaultWebSecurityManager  第二步
    //Qualifier  指定方法名进行绑定   defaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm)
    @Bean(name = "defaultWebSecurityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(com.mydemo.config.UserRealm userRealm, @Qualifier("webSessionManager") DefaultWebSessionManager sessionManager){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        securityManager.setSessionManager(sessionManager);
        return securityManager;
    }




    // 创建realm 对象,需要自定义.第一步
    @Bean(name = "userRealm")
    public com.mydemo.config.UserRealm userRealm(){
        return new com.mydemo.config.UserRealm();
    }


    //shiro和前端thymeleaf整合需要配置 shirodialect
    @Bean
    public ShiroDialect getShiroDialect(){
        return new ShiroDialect();
    }

}
