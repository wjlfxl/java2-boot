package com.shiro.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

//自定义的realm  继承了AuthorizingRealm
public class UserRealm extends AuthorizingRealm {

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行了授权doGetAuthorizationInfo");
        return null;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行了认证doGetAuthorizationInfo");

        String name="www";
        String password="123";
        UsernamePasswordToken usernameToken=(UsernamePasswordToken) authenticationToken;
        if(!usernameToken.getUsername().equals(name)){
            return null;   //抛出UnknownAccountException 异常
        }

        //密码认证shiro做，防止密码泄露
        return new SimpleAuthenticationInfo("",password,"");
    }
}
