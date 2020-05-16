use bugtracker;

CREATE TABLE project
(
    projectId INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(60) NOT NULL,
    shortName VARCHAR(12) NOT NULL UNIQUE,
    description VARCHAR(250),
    statusId INT UNSIGNED,
    FOREIGN KEY(statusId) REFERENCES status(statusId)
);