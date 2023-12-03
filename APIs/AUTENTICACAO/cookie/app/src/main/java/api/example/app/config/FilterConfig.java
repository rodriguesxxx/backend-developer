package api.example.app.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import api.example.app.filter.CookieFilter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<CookieFilter> cookieFilter() {
        FilterRegistrationBean<CookieFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new CookieFilter());
        registrationBean.addUrlPatterns("/api/*");
        return registrationBean;
    }

}
