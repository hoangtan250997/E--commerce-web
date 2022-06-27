package edu.poly.shop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import edu.poly.shop.interceptor.AdminAuthenticationIntercepter;


@Configuration
public class AuthenticationInterceptorConfig implements WebMvcConfigurer {
	
//	@Autowired
//	private SiteAuthenticationInterceptor siteAuthenticationInterceptor ;
//		
	@Autowired
	private AdminAuthenticationIntercepter adminAuthenticationIntercepter;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(adminAuthenticationIntercepter)
//			.addPathPatterns("/admin/**");
//		
//		registry.addInterceptor(siteAuthenticationInterceptor)
//			.addPathPatterns ("/site/**");
	}

}
