CREATE TABLE IF NOT EXISTS person (
    id serial4 PRIMARY KEY,
    identification VARCHAR(13),
    name VARCHAR(255),
    age int,
    gender VARCHAR(10),
    addresses VARCHAR(255),
    phone VARCHAR(32)
);

CREATE TABLE IF NOT EXISTS customer (
    id serial4  PRIMARY KEY,
    state VARCHAR(10),
    password VARCHAR(62),
    CONSTRAINT fk_persona FOREIGN KEY(id) REFERENCES persona(id)
);