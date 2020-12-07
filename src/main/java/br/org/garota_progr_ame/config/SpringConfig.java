// package br.org.garota_progr_ame.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.EnableWebMvc;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
// import org.springframework.web.servlet.view.InternalResourceViewResolver;
// import org.springframework.web.servlet.view.JstlView;

// @EnableWebMvc
// @Configuration
// @ComponentScan({"br.org.garota_progr_ame"})
// public class SpringConfig implements WebMvcConfigurer {

//     // @Override
//     // public void addResourceHandlers(ResourceHandlerRegistry registry) {
//     //     registry.addResourceHandler("/resources/**")
//     //             .addResourceLocations("/resources/");
//     // }

//     @Bean
//     public InternalResourceViewResolver viewResolver() {
//         InternalResourceViewResolver viewResolver
//                 = new InternalResourceViewResolver();
//         viewResolver.setViewClass(JstlView.class);
//         viewResolver.setPrefix("/WEB-INF/views/");
//         viewResolver.setSuffix(".jsp");
//         return viewResolver;
//     }
// }