package org.application;

import org.config.HibernateConfig;
import org.models.Address;
import org.models.User;
import org.repository.UserRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
        UserRepository userRepository = (UserRepository) context.getBean(UserRepository.class);

        // save method demonstration
//        Address address = new Address("Pune", "India");
//        User currentUser = new User("harsh", "said");
//        currentUser.setAddress(address);
//        userRepository.saveUser(currentUser);

        // get method demonstration
        User user = userRepository.getUserGETMETHOD(52);
        if (user != null) {
             System.out.println(user.getFirstName() + " " + user.getLastName());
             System.out.println("Country : " + user.getAddress().getCountry());
             System.out.println("City : " + user.getAddress().getCity());
        }
        else {
            // System.out.println("User not found");
        }

        // load method demonstration
//        User user2 = userRepository.getUserLOADMETHOD(1);
//        if (user2 != null) {
//            System.out.println(user2.getFirstName() + " " + user2.getLastName());
//        }
//        else {
//            System.out.println("User not found");
//        }
    }
}
