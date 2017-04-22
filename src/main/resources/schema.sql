CREATE TABLE IF NOT EXISTS Coach
(
    id int(4) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    sport varchar(100) DEFAULT NULL,
    phoneNumber varchar(100) DEFAULT NULL,
    registrationDate varchar(10) DEFAULT NULL,
    creationTimeStamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);