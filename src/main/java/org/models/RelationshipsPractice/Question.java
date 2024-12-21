package org.models.RelationshipsPractice;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answers> answers;

    public Question() {
    }

    public Question(String question) {
        this.question = question;
    }

    public Question(int id, String question, List<Answers> answers) {
        this.question = question;
        this.id = id;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }
}


