-- DROP TABLE IF EXISTS modulo;
-- DROP TABLE IF EXISTS aula;
-- DROP TABLE IF EXISTS aluno;
-- DROP TABLE IF EXISTS turma;
-- DROP TABLE IF EXISTS curso;

CREATE DATABASE prova_bruno 

CREATE TABLE aluno(
	idmatrícula serial,
	nome varchar(50) NOT NULL,
	CPF varchar (25) UNIQUE ,
	endereço varchar (100),
	PRIMARY KEY(idmatrícula)
);

CREATE TABLE aula(
	id serial,
	titulo varchar(50),
	url varchar(100),
	descricao varchar(100),
	PRIMARY KEY(id)
);

CREATE TABLE turma(
	id serial,
	id_matricula_aluno int,
	ano varchar(10),
	PRIMARY KEY(id),
	FOREIGN KEY(id_matricula_aluno) REFERENCES aluno(idmatrícula)
);

CREATE TABLE modulo(
	id serial,
	idaulas int,
	nome varchar(50) NOT NULL,
	PRIMARY KEY(id),
	FOREIGN KEY(idaulas) REFERENCES aula(id)
);

CREATE TABLE curso(
	nome varchar(50) NOT NULL,
	idmodulo int,
	idturma int,
	PRIMARY KEY(id),
	FOREIGN KEY(idmodulo) REFERENCES modulo(id),
	FOREIGN KEY(idturma) REFERENCES turma(id)
);