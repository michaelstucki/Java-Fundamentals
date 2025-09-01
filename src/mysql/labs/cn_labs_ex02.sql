CREATE DATABASE airtravel;

USE airtravel;

CREATE TABLE Passenger (
    id INT AUTO_INCREMENT,
    firstName VARCHAR(40) NOT NULL,
    lastName VARCHAR(40) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Airport (
    id INT AUTO_INCREMENT,
    name VARCHAR(20),
    address VARCHAR(40) NOT NULL,
    city VARCHAR(40) NOT NULL,
    country VARCHAR(40) NOT NULL,
    postcode VARCHAR(10) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Airline (
    id INT AUTO_INCREMENT,
    name VARCHAR(40) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE Airplane (
	id INT AUTO_INCREMENT,
    make VARCHAR(20) NOT NULL,
    model VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
);

CREATE table Flight (
    id INT AUTO_INCREMENT,
    airlineID INT NOT NULL,
    airplaneID INT NOT NULL,
    departureID INT NOT NULL,
    arrivalID INT NOT NULL,
    departureDate DATE NOT NULL,
    departureTime TIME NOT NULL,
    arrivalDate DATE NOT NULL,
    arrivalTime TIME NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (airlineID) REFERENCES Airline (id),
    FOREIGN KEY (airplaneID) REFERENCES Airplane (id),
    FOREIGN KEY (departureID) REFERENCES Airport (id),
    FOREIGN KEY (arrivalID) REFERENCES Airport (id)
    );
    
CREATE TABLE Ticket (
  id INT AUTO_INCREMENT,
  passengerID INT NOT NULL,
  flightID INT NOT NULL,
  meal VARCHAR(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (passengerID) REFERENCES Passenger (id),
  FOREIGN KEY (flightID) REFERENCES Flight (id)
  );
