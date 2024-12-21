package org.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.models.RelationshipsPractice.Answers;
import org.models.RelationshipsPractice.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OneToManyRepository {

    private final SessionFactory sessionFactory;
    public OneToManyRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void saveQuestionAndAnswer() {
        Question question = new Question("Frameworks of java");

        Answers answer1 = new Answers("Spring boot");
        answer1.setQuestion(question);

        Answers answer2 = new Answers("Spring");
        answer2.setQuestion(question);

        List<Answers> answerList = new ArrayList<>();
        answerList.add(answer1);
        answerList.add(answer2);

        // set answer list of question entity (BI-DIRECTIONAL)
        question.setAnswers(answerList);

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();

        session.save(question);
        session.save(answer1);
        session.save(answer2);

        tx.commit();
        session.close();
    }

}
