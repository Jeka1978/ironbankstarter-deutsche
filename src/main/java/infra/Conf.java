package infra;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProps.class)
public class Conf {
    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    public RavenListener ravenListener(){
        return new RavenListener();
    }
}
