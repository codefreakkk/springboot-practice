package org.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.models.RelationshipsPractice.Answers;
import org.models.RelationshipsPractice.Question;
import org.springframework.stereotype.Repository;

@Repository
public class OneToOneRepository {

    private final SessionFactory sessionFactory;

    public OneToOneRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveQuestionAndAnswer() {

//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//
//        // prepare data
//        Answers answers = new Answers("Spring boot");
//        Question question = new Question("What are java frameworks", answers);
//
//        session.save(question);
//        session.save(answers);
//
//        transaction.commit();
//        session.close();
    }

}
