package infra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

/**
 * @author Evgeny Borisov
 */

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RavenProps ravenProps;
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Raven was sent to "+ravenProps.getDestination());
    }
}
