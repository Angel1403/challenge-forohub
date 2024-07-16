CREATE TABLE topicos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(50) NOT NULL,
    mensaje VARCHAR(200) NOT NULL,
    fecha_creacion DATETIME NOT NULL,
    status VARCHAR(14) NOT NULL,
    autor VARCHAR(20) NOT NULL,
    curso VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);