DROP TABLE PorteFeuille;
DROP TABLE CryptoMonnaie;

CREATE TABLE CryptoMonnaie(
   Id_CryptoMonnaie int auto_increment,
   nom VARCHAR(50),
   label VARCHAR(50),
   prix_Actuel DECIMAL(65,2),
   PRIMARY KEY(Id_CryptoMonnaie)
);

CREATE TABLE PorteFeuille(
   Id_PorteFeuille int auto_increment,
   Id_CryptoMonnaie int,
   nombreUnite DECIMAL(65,2),
   prix_achat DECIMAL(65,2),
   date_achat DATE,
   PRIMARY KEY(Id_PorteFeuille),
   FOREIGN KEY(Id_CryptoMonnaie) REFERENCES CryptoMonnaie(Id_CryptoMonnaie)
);

INSERT INTO CryptoMonnaie 
(nom, label , prix_Actuel)
 VALUES 
("Bitcoin", "BTC", 40000),
("Ethereum", "ETH", 4900),
("Usd coins", "USDC", 300),
("Uniwasp", "UNI", 2200),
("Litecoin", "LTC", 9400),
("Wrapped bitcoin", "WBTC", 6500),
("Aave", "AAVE", 6000),
("Bitcoin Cash", "BCH", 5000),
("Stellar", "XLM", 3000),
("Chainlink", "LINK", 3000)
;

 INSERT INTO PorteFeuille 
(Id_CryptoMonnaie, nombreUnite , prix_achat , date_achat)
 VALUES 
 (1, 5, 150,'2009/02/26'),
 (5, 2, 2400,'2019/02/14'),
 (6, 15, 3400,'2015/10/10'),
 (7, 8, 680,'2018/06/08');

select * from PorteFeuille;
select * from CryptoMonnaie;








