package org.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.models.RelationshipsPractice.Employee;
import org.models.RelationshipsPractice.Project;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class ManyToManyRepository {

    private final SessionFactory sessionFactory;
    public ManyToManyRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveProjectWithEmployee() {

        Employee employee1 = new Employee("Harsh");
        Employee employee2 = new Employee("Prachi");

        Project project1 = new Project("Springboot");
        Project project2 = new Project("Hibernate");

        // set project for employee 1
        Set<Project> projectSet1 = new HashSet<>();
        projectSet1.add(project1);
        projectSet1.add(project2);
        employee1.setProjects(projectSet1);

        // set project for employee 2
        Set<Project> projectSet2 = new HashSet<>();
        projectSet2.add(project1);
        employee2.setProjects(projectSet2);


        // save to database
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(employee1);
        session.save(employee2);

        transaction.commit();
        session.close();
    }
}
