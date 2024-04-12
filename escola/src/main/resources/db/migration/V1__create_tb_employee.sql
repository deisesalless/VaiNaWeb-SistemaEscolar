CREATE TABLE tb_employee (
    id BIGINT AUTO_INCREMENT,
    name VARCHAR(255),
    cpf VARCHAR(14) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    profession INT,
    department INT
);