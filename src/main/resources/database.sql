CREATE TABLE Persona
(
    id              serial PRIMARY KEY,
    identificacion  VARCHAR(20)  NOT NULL,
    nombres         VARCHAR(100) NOT NULL,
    apellidos       VARCHAR(100) NOT NULL,
    telefono        VARCHAR(20),
    correo          VARCHAR(100)
);

CREATE TABLE registro
(
    id         SERIAL PRIMARY KEY,
    registro   DATE NOT NULL,
    persona_id INT  NOT NULL REFERENCES Persona (id)
);