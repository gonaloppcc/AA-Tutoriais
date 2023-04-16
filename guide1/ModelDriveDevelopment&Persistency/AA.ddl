CREATE TABLE `User` (ID int(10) NOT NULL AUTO_INCREMENT, Name varchar(255), Email varchar(255), Password varchar(255), PRIMARY KEY (ID));
CREATE TABLE Game (ID int(10) NOT NULL AUTO_INCREMENT, PlataformID int(10) NOT NULL, Name varchar(255), Year int(10) NOT NULL, Price double NOT NULL, Description varchar(255), PRIMARY KEY (ID));
CREATE TABLE Plataform (ID int(10) NOT NULL AUTO_INCREMENT, Name varchar(255), Year int(10) NOT NULL, Description varchar(255), Manufacturer varchar(255), PRIMARY KEY (ID));
CREATE TABLE User_Game (UserID int(10) NOT NULL, GameID int(10) NOT NULL, PRIMARY KEY (UserID, GameID));
ALTER TABLE User_Game ADD CONSTRAINT games FOREIGN KEY (UserID) REFERENCES `User` (ID);
ALTER TABLE User_Game ADD CONSTRAINT games2 FOREIGN KEY (GameID) REFERENCES Game (ID);
ALTER TABLE Game ADD CONSTRAINT plataform FOREIGN KEY (PlataformID) REFERENCES Plataform (ID);
