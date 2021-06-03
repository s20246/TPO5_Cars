//package com.studia.TPO5.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.converter.json.GsonBuilderUtils;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.resource.PathResourceResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//public class WebMvcConfigure implements WebMvcConfigurer {
//
//    @Bean
//    public ViewResolver getViewResolver() {
//        System.out.println("viewResolver");
//        InternalResourceViewResolver resolver
//                = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//
//    @Override
//    public void configureDefaultServletHandling(
//            DefaultServletHandlerConfigurer configurer) {
//        configurer.enable();
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        System.out.println("addResourceHandlers");
//        registry.addResourceHandler("/resources/**")
//                .addResourceLocations("/resources/").setCachePeriod(3600)
//                .resourceChain(true).addResolver(new PathResourceResolver());
//    }
//}