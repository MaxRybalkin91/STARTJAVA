CREATE TABLE Jaegers (
    id        SERIAL  NOT NULL,
    modelName TEXT    NOT NULL,
    mark      TEXT    NOT NULL,
    height    INTEGER NOT NULL,
    weight    FLOAT   NOT NULL,
    status    TEXT    NOT NULL,
    origin    TEXT    NOT NULL,
    launch    DATE    NOT NULL,
    kaijuKill INTEGER NOT NULL,
    PRIMARY KEY (id)
);
