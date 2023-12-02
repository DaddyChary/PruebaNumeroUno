/**
 * Author:  morag
 * Created: 14-11-2023
 */

CREATE TABLE toppings_iceScream(
    id INT AUTO_INCREMENT,
    name VARCHAR(20) UNIQUE NOT NULL,
    price_per int,
    PRIMARY KEY(id)
);

INSERT INTO toppings_iceScream VALUES(null, 'M&M', 500);
INSERT INTO toppings_iceScream VALUES(null, 'Oreo', 600);
INSERT INTO toppings_iceScream VALUES(null, 'Snikers', 300);
INSERT INTO toppings_iceScream VALUES(null, 'OvaOBA', 100);