use bugtracker;

CREATE TABLE status
(
    statusId INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    statusName VARCHAR(30) NOT NULL UNIQUE
);