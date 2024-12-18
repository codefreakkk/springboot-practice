package org.application;

import org.config.HibernateConfig;
import org.config.ProjectConfig;
import org.models.User;
import org.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        UserRepository userRepository = (UserRepository) context.getBean(UserRepository.class);
        userRepository.saveUser(new User("harsh", "said"));
    }
}
