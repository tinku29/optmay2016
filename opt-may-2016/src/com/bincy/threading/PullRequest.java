package com.bincy.threading;

public class PullRequest {

	private String repository;

	public PullRequest(String repository) {
		super();
		this.repository = repository;
	}

	@Override
	public String toString() {
		return "PullRequest [repository=" + repository + "]";
	}

	public String getRepository() {
		return repository;
	}

	public void setRepository(String repository) {
		this.repository = repository;
	}
}
