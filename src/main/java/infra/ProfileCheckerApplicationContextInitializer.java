package infra;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
public class ProfileCheckerApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (applicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new RuntimeException("Без профилей низя!!!");
        }
    }
}
