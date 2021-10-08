DROP TABLE IF EXISTS eigentuemer cascade;
DROP TABLE IF EXISTS immobilie cascade;
DROP TABLE IF EXISTS makler cascade;
DROP TABLE IF EXISTS immobilientyp cascade;
DROP TABLE IF EXISTS buchungstermin cascade;
DROP TABLE IF EXISTS eigentuemer_immobilie cascade;
DROP TABLE IF EXISTS kaufgebot cascade;

CREATE TABLE IF NOT EXISTS eigentuemer
(
    eigentuemerid serial primary key,
    vorname       varchar not null,
    nachname      varchar not null,
    telefonnummer varchar null,
    stammkunde    boolean default false
);

CREATE TABLE IF NOT EXISTS makler
(
    maklerid      serial primary key,
    vorname       varchar not null,
    nachname      varchar not null,
    telefonnummer varchar null
);

CREATE TABLE IF NOT EXISTS immobilientyp
(
    immobilientypid serial primary key,
    label           varchar not null
);

CREATE TABLE IF NOT EXISTS immobilie
(
    immobilieid       serial primary key,
    maklerid          int     not null
    constraint fk_makler
    references makler,
    immobilientypid   int     not null
    constraint fk_immobilietyp
    references immobilientyp,
    strasse           varchar not null,
    hausnummer        varchar not null,
    postleitzahl      varchar not null,
    ort               varchar not null,
    zimmeranzahl      int     not null,
    wohnflaeche       int     not null,
    baujahr           int     not null,
    einstellungsdatum date    not null,
    preis             numeric not null,
    verkaufsdatum     date    null
);

CREATE TABLE eigentuemer_immobilie
(
    eigentuemerid int not null
        constraint eigentuemer_immobilie__fk_eigentuemer
            REFERENCES eigentuemer,
    immobilieid   int not null
        constraint eigentuemer_immobilie__fk_immobilie
            REFERENCES immobilie,

    PRIMARY KEY (eigentuemerid, immobilieid)
);

CREATE TABLE IF NOT EXISTS interessent
(
    interessentid serial primary key,
    vorname       varchar not null,
    nachname      varchar not null,
    telefonnummer varchar null,
    strasse       varchar not null,
    hausnummer    varchar not null,
    postleitzahl  varchar not null,
    ort           varchar not null
);

CREATE TABLE IF NOT EXISTS kaufgebot
(
    id SERIAL not null,

    interessentid int     not null
    constraint kaufgebot__fk_interesennt
    REFERENCES interessent,
    immobilieid   int     not null
    constraint kaufgebot__fk_immobilie
    REFERENCES immobilie,

    PRIMARY KEY (id, interessentid, immobilieid),

    gebot         numeric not null,
    gebotsstatus  boolean null
    );

CREATE TABLE buchungstermin
(
    id SERIAL not null,

    interessentid int  not null
        constraint buchungstermin__fk_interesennt
            REFERENCES interessent,
    immobilieid   int  not null
        constraint buchungstermin__fk_immobilie
            REFERENCES immobilie,

    PRIMARY KEY (id, interessentid, immobilieid),

    termin         timestamp not NULL

);

/** !!! START: Create Example Data !!! */

INSERT INTO
    eigentuemer (vorname, nachname, telefonnummer, stammkunde)
VALUES
('Jakob', 'Sture', '004915252769567', TRUE),
('Lorena', 'Petrana', '004915252369234', FALSE),
('Nele', 'Farell', '004915256669246', FALSE);

INSERT INTO
    makler (vorname, nachname, telefonnummer)
VALUES
('Dean', 'Reinhardt', '00494216009213'),
('Rudolf', 'Prabhat', '004915252769569'),
('Eli', 'Svetka', '004915252789512');

INSERT INTO
    interessent (vorname, nachname, telefonnummer, strasse, hausnummer, postleitzahl, ort)
VALUES
('Laura', 'Reinhardt', '004915252769233', 'Am Bertramshof', '1', '23566' , 'Lübeck'),
('Artemio', 'Judita', '004915252769888', 'Landesberger Allee', '45', '10369', 'Berlin'),
('Joseph', 'Kori', '004915252777248', 'Mozartstr.', '5', '04107', 'Leipzig');

INSERT INTO
    immobilientyp (label)
VALUES
('Wohnung'),
('Doppelhaushälfte'),
('Villa');

INSERT INTO
    immobilie (maklerid, immobilientypid, strasse, hausnummer, postleitzahl, ort, zimmeranzahl, wohnflaeche, baujahr, einstellungsdatum, preis, verkaufsdatum)
VALUES
(1, 2,'Regensburgerstr.', '12', '28215', 'Bremen', 4, 84, 2001, '2021-07-07', 240000, NULL),
(2, 1, 'Turnerstr.', '91a', '28777', 'Bremen', 3, 70, 2011, '2021-10-12', 130000, NULL),
(3, 3, 'Emmastr.', '4', '28209', 'Bremen', 12, 210, 1994, '2020-02-08', 1200000, '2021-07-09'),
(1, 3, 'Musterstr.', '1', '12345', 'Berlin', 7, 90, 1999, '2020-02-10', 1100000, null);

INSERT INTO
    kaufgebot(interessentid, immobilieid, gebot, gebotsstatus)
VALUES
(1, 3, 1100000, TRUE),
(2, 2, 85000, FALSE),
(3, 1, 190000, FALSE),
(1, 1, 175000, FALSE),
(1, 1, 185000, FALSE);

INSERT INTO
    eigentuemer_immobilie (eigentuemerid, immobilieid)
VALUES
(2,1),
(3,2),
(1,3);

INSERT INTO
    buchungstermin (interessentid, immobilieid, termin)
VALUES
(1, 1, '2021-10-11 14:00:00'),
(2, 1, '2021-10-11 16:00:00'),
(2, 2, '2021-10-11 18:00:00'),
(3, 2, '2021-11-11 12:00:00'),
(3, 4, '2021-11-15 09:30:00');

/** !!! END: Create Example Data !!! */

/** START: Aufgabe 5 */

/** Aufgabe 5-1
  Es sollen alle Immobilien eines Postleitzahlengebiets angezeigt werden.
  */
SELECT * FROM immobilie WHERE postleitzahl = '28777';

/** Aufgabe 5-2
  Wie viele noch nicht verkaufte Immobilien verwaltet das Büro gerade?
  */
SELECT COUNT(*) from immobilie WHERE verkaufsdatum IS NULL;

/** Aufgabe 5-3
  Es sollen alle Immobilien angezeigt werden, deren Quadratmeteranzahl
  und der Kaufpreis in einem bestimmten Intervall liegen.
  */
SELECT * from immobilie WHERE wohnflaeche BETWEEN 50 AND 80 AND preis BETWEEN 1000 AND 9999999;

/** Aufgabe 5-4
  Welcher Makler betreut eine ganz bestimmte Immobilie?
  https://stackoverflow.com/questions/15251761/sql-query-one-to-many-relationship */
SELECT makler.* from makler LEFT JOIN immobilie i on makler.maklerid = i.maklerid WHERE immobilieid = '1';

/** Aufgabe 5-5
  Welche Termine hat ein ganz bestimmter Makler in dieser Woche?
  Anzugeben sind die Adresse der jeweiligen Immobilie und das Datum,
  wobei die Termine nach dem Datum und Uhrzeit zu sortieren sind
  (frühere Termine oben)
  */
SELECT i.strasse, i.hausnummer, i.postleitzahl, i.ort, buchungstermin.termin from buchungstermin
                                                                                      JOIN immobilie i on buchungstermin.immobilieid = i.immobilieid
                                                                                      JOIN makler m on i.maklerid = m.maklerid
WHERE i.maklerid = '1'
ORDER BY buchungstermin.termin;

/** Aufgabe 5-6
  Es soll eine Liste mit allen Geboten zu einer bestimmten Immobilie mit dem Gebot
  und dem Namen und der Telefonnummer des Bieters angezeigt werden. Die Liste wird
  absteigend nach dem Gebot sortiert.
  */
SELECT kaufgebot.gebot, i2.vorname, i2.nachname, i2.telefonnummer FROM kaufgebot
                                                                           JOIN immobilie i on i.immobilieid = kaufgebot.immobilieid
                                                                           JOIN interessent i2 on kaufgebot.interessentid = i2.interessentid
WHERE i.immobilieid = 1
ORDER BY kaufgebot.gebot DESC;


/** !!! END: Aufgabe 5 !!! */