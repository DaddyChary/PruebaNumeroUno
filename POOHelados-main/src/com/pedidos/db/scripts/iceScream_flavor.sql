/**
 * Author:  morag
 * Created: 14-11-2023
 */

CREATE TABLE flavors_iceScream(
    id INT AUTO_INCREMENT,
    name VARCHAR(40) UNIQUE NOT NULL,
    price_per int,

    PRIMARY KEY(id)
);
INSERT INTO flavors_iceScream VALUES(null, 'pistachos', 200);
INSERT INTO flavors_iceScream VALUES(null, 'chocolate', 200);
INSERT INTO flavors_iceScream VALUES(null, 'frambueza', 200);
INSERT INTO flavors_iceScream VALUES(null, 'frutilla', 200);
INSERT INTO flavors_iceScream VALUES(null, 'menta', 200);
INSERT INTO flavors_iceScream VALUES(null, 'menta-chocolate', 200);

SELECT * FROM flavors_iceScream WHERE name LIKE '%a%';