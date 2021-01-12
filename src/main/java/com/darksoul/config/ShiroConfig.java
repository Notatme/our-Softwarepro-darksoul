package com.darksoul.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {

    /**
     * Shiro过滤器配置
     */
//    @Bean
//    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        // Shiro的核心安全接口,这个属性是必须的
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        // 身份认证失败，则跳转到登录页面的配置
//        shiroFilterFactoryBean.setLoginUrl(loginUrl);
//        // 权限认证失败，则跳转到指定页面
//        shiroFilterFactoryBean.setUnauthorizedUrl(unauthorizedUrl);
//        // Shiro连接约束配置，即过滤链的定义
//        LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
//        // 对静态资源设置匿名访问
//        //filterChainDefinitionMap.put("/haochang/**", "anon");
//        filterChainDefinitionMap.put("/system/**", "anon");
//        filterChainDefinitionMap.put("/favicon.ico**", "anon");
//        filterChainDefinitionMap.put("/ruoyi.png**", "anon");
//        filterChainDefinitionMap.put("/css/**", "anon");
//        filterChainDefinitionMap.put("/docs/**", "anon");
//        filterChainDefinitionMap.put("/fonts/**", "anon");
//        filterChainDefinitionMap.put("/img/**", "anon");
//        filterChainDefinitionMap.put("/ajax/**", "anon");
//        filterChainDefinitionMap.put("/js/**", "anon");
//        filterChainDefinitionMap.put("/ruoyi/**", "anon");
//        filterChainDefinitionMap.put("/captcha/captchaImage**", "anon");
//        // 退出 logout地址，shiro去清除session
//        filterChainDefinitionMap.put("/logout", "logout");
//        // 不需要拦截的访问
//        filterChainDefinitionMap.put("/login", "anon,captchaValidate");
//        filterChainDefinitionMap.put("/haochang/user/userlogin", "anon,captchaValidate");
//        // 注册相关
//        filterChainDefinitionMap.put("/register", "anon,captchaValidate");
//        // 系统权限列表
//        // filterChainDefinitionMap.putAll(SpringUtils.getBean(IMenuService.class).selectPermsAll());
//
//        Map<String, Filter> filters = new LinkedHashMap<String, Filter>();
//        filters.put("onlineSession", onlineSessionFilter());
//        filters.put("syncOnlineSession", syncOnlineSessionFilter());
//        filters.put("captchaValidate", captchaValidateFilter());
//        filters.put("kickout", kickoutSessionFilter());
//        // 注销成功，则跳转到指定页面
//        filters.put("logout", logoutFilter());
//        shiroFilterFactoryBean.setFilters(filters);
//
//        // 所有请求需要认证
//        filterChainDefinitionMap.put("/**", "user,kickout,onlineSession,syncOnlineSession");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//
//        return shiroFilterFactoryBean;
//
//    }
}
