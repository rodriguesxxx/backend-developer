USE guanabara;
DROP TABLE IF EXISTS pessoas;
CREATE TABLE IF NOT EXISTS pessoas(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30) NOT NULL,
    email VARCHAR(60) NOT NULL UNIQUE,
    data_nascimento DATE,
    sexo ENUM('M', 'F')
) DEFAULT CHARSET = utf8;
ALTER TABLE pessoas
ADD COLUMN cpf VARCHAR(11) NOT NULL UNIQUE
AFTER id;
ALTER TABLE pessoas
ADD COLUMN estado_civil ENUM('solteiro', 'casado');
ALTER TABLE pessoas DROP COLUMN sexo;
ALTER TABLE pessoas
MODIFY COLUMN estado_civil ENUM('solteiro', 'casado', 'viuvo');
INSERT INTO pessoas(nome, cpf, email, data_nascimento)
VALUES(
        'Daniel',
        '16911491606',
        'drp6@aluno.ifnmg.edu.br',
        '2006-08-16'
    );
INSERT INTO pessoas(nome, cpf, email, data_nascimento)
VALUES(
        'Pedro',
        '1123344223',
        'ped4@aluno.ifnmg.edu.br',
        '2006-08-22'
    );