package com.mydemo.config;

import com.mydemo.pojo.Admin;
import com.mydemo.pojo.User;
import com.mydemo.service.AdminService;
import com.mydemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;


//自定义的realm  继承了AuthorizingRealm
public class UserRealm extends AuthorizingRealm {
    @Autowired
    public AdminService adminService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权doGetAuthorizationInfo");

        //设置授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //info.addStringPermission("user:add");  //所有用户都添加字符串user:add   filterMap.put("/products","perms[user:add]");

        //拿到当前登陆的对象
        Subject subject = SecurityUtils.getSubject();
        Admin currentUser = (Admin) subject.getPrincipal();//取的数据就是SimpleAuthenticationInfo(user,user.getPasswd(),"") 存的第一个值

//        //设置当前用户权限
        info.addStringPermission(currentUser.getRank());

        return info;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证doGetAuthorizationInfo");

        UsernamePasswordToken usernameToken=(UsernamePasswordToken) authenticationToken;
        //连接数据库
        Admin admin = adminService.adminByName(usernameToken.getUsername());

        if(admin==null ){
            return null;   //抛出UnknownAccountException 异常
        }

//        密码认证shiro做，防止密码泄露
        //密码可加密： MD5   MD5盐值加密
        //第一个参数是给授权里的SecurityUtils.getSubject 数据的；将当前登陆的对象值存进去
        return new SimpleAuthenticationInfo(admin,admin.getPassword(),"");
    }
}
