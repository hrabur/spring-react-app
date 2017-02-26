package org.hrabur.test;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebSecurityConfig {

//	@Bean(name = "shiroFilter")
//	public ShiroFilterFactoryBean shiroFilter() {
//		ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
//		shiroFilter.setLoginUrl("/login");
//		shiroFilter.setUnauthorizedUrl("/unauthorized");
//		shiroFilter.setSecurityManager(securityManager());
//		Map<String, String> filterChainDefinitionMapping = new LinkedHashMap<>();
//		filterChainDefinitionMapping.put("/beans", "anon");
//		filterChainDefinitionMapping.put("/static/**", "anon");
//		filterChainDefinitionMapping.put("/webjars/**", "anon");
//		filterChainDefinitionMapping.put("/css/**", "anon");
//		filterChainDefinitionMapping.put("/images/**", "anon");
//		filterChainDefinitionMapping.put("/js/**", "anon");
//		filterChainDefinitionMapping.put("/api/**", "anon");
//		filterChainDefinitionMapping.put("/login", "authc");
//		filterChainDefinitionMapping.put("/logout", "logout");
//		filterChainDefinitionMapping.put("/**", "user");
//		shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMapping);
//		return shiroFilter;
//	}
//
//	@Bean(name = "securityManager")
//	public org.apache.shiro.mgt.SecurityManager securityManager() {
//		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
//		securityManager.setRealm(authorizingRealm());
//		return securityManager;
//	}
//
//	@Bean(name = "realm")
//	public AuthorizingRealm authorizingRealm() {
//		return new DelegatingAuthorizingRealm();
//	}
}