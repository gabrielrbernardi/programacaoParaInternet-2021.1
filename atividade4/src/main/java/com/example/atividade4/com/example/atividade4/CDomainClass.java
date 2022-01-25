package com.example.atividade4.com.example.atividade4;

public class CDomainClass {
	private String disciplina;
	private String professor;
	private int codDisciplina;
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getCodDisciplina() {
		return codDisciplina;
	}
	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}
	
	@Override
	public String toString() {
		return "CDomainClass [disciplina=" + disciplina + ", professor=" + professor + ", codDisciplina="
				+ codDisciplina + "]";
	}	
}
