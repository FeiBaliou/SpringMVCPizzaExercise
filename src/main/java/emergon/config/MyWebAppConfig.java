package emergon.config;

import emergon.converter.StringToBreadSizeConverter;
import emergon.converter.StringToIngredientsConverter;
import emergon.converter.StringToPaymentConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration//This class is the equivalent of dispatcher-servlet.xml
@EnableWebMvc
@ComponentScan(basePackages = "emergon")
public class MyWebAppConfig implements WebMvcConfigurer {

    
    
      @Autowired
    StringToBreadSizeConverter sizeConverter;
    @Autowired
    StringToIngredientsConverter ingredientConverter;
    @Autowired
    StringToPaymentConverter paymentConverter;
    
    
    
    
    
    
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        registry.viewResolver(viewResolver);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
       registry.addConverter(sizeConverter);
       registry.addConverter(ingredientConverter);
       registry.addConverter(paymentConverter);
    }

}
