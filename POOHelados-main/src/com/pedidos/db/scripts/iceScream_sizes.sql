/**
 * Author:  morag
 * Created: 14-11-2023
 */

CREATE TABLE sizes_iceScream(
    id INT AUTO_INCREMENT,
    name VARCHAR(10) UNIQUE NOT NULL,
    value INT UNIQUE NOT NULL,
    unity VARCHAR(5),
    PRIMARY KEY(id)
);
INSERT INTO sizes_iceScream VALUES(null, 'chico', '250', 'g');
INSERT INTO sizes_iceScream VALUES(null, 'mediano', '500', 'g');
INSERT INTO sizes_iceScream VALUES(null, 'grande', '1000', 'g');