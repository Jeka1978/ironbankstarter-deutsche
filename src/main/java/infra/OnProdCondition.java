package infra;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

/**
 * @author Evgeny Borisov
 */
public class OnProdCondition implements Condition {
    static Boolean flag;

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (flag == null) {
            String answer = JOptionPane.showInputDialog("is it production?");
            flag = answer.toLowerCase().contains("yes");

        }
        return flag;
    }
}
