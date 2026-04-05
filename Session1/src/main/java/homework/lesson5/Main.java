package homework.lesson5;

import homework.lesson5.config.AppConfig;
import homework.lesson5.model.SystemConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        SystemConfig config = context.getBean(SystemConfig.class);

        System.out.println("Branch Name: " + config.getBranchName());
        System.out.println("Opening Hour: " + config.getOpeningHour());
    }
}
