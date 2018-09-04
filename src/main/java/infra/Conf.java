package infra;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProps.class)
public class Conf {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty(value = "raven.enabled")
    @ConditionalOnMissingBean
    public RavenListener ravenListener(){
        return new RavenListener();
    }


    @Bean
    public FrontEndControllerAspect controllerAspect(){
        return new FrontEndControllerAspect();
    }


}
