CREATE TABLE Pessoa (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255)
);

CREATE TABLE Medico (
    cpf VARCHAR(11) PRIMARY KEY,
    email VARCHAR2(30),
    nome VARCHAR(255),
    especialidade VARCHAR(255),
    valorConsulta DECIMAL(10, 2)
);

CREATE TABLE Paciente (
    cpf VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR2(30),
    idade INT,
    altura DECIMAL(10, 2),
    peso DECIMAL(10, 2)
);
