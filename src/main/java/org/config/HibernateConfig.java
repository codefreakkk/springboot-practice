package org.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.models.RelationshipsPractice.Answers;
import org.models.RelationshipsPractice.Employee;
import org.models.RelationshipsPractice.Project;
import org.models.RelationshipsPractice.Question;
import org.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "org.repository")
public class HibernateConfig {

    @Bean
    public SessionFactory sessionFactory() {
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();

        // hibernate settings equivalent to hibernate.cfg.xml
        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        settings.put(Environment.URL, "jdbc:mysql://localhost:32770/mydb");
        settings.put(Environment.USER, "root");
        settings.put(Environment.PASS, "root");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
        settings.put(Environment.SHOW_SQL, "true");
        settings.put(Environment.HBM2DDL_AUTO, "create");

        configuration.setProperties(settings);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Question.class);
        configuration.addAnnotatedClass(Answers.class);
        configuration.addAnnotatedClass(Project.class);
        configuration.addAnnotatedClass(Employee.class);

        return configuration.buildSessionFactory();
    }

}
