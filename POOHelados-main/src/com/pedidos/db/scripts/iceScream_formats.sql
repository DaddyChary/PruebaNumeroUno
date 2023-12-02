/**
 * Author:  morag
 * Created: 14-11-2023
 */

CREATE TABLE formats_iceScream(
    id INT AUTO_INCREMENT,
    name VARCHAR(20) UNIQUE NOT NULL,
    price int,
    PRIMARY KEY(id)
);

INSERT INTO formats_iceScream VALUES(null, 'Cono', 200);
INSERT INTO formats_iceScream VALUES(null, 'Pote', 500);