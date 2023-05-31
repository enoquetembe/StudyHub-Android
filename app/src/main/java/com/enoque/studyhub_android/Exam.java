package com.enoque.studyhub_android;

public class Exam {
    private String title;
    private String question;
    private String discipline;
    private String id;

    public Exam(String title, String question, String discipline, String course) {
        this.title = title;
        this.question = question;
        this.discipline = discipline;
        this.course = course;
    }

    private String course;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "title='" + title + '\'' +
                ", question='" + question + '\'' +
                ", discipline='" + discipline + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
