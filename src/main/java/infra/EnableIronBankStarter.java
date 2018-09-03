package infra;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Evgeny Borisov
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(Conf.class)
public @interface EnableIronBankStarter {
}
