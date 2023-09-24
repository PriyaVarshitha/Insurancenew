package com.health.insuranceview.models;

public class Faq {

    private Long id;
    private String question;
    private String answer;

    // Constructors, getters, and setters

    public Faq() {
        // Default constructor
    }

    public Faq(Long id, String question, String answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
