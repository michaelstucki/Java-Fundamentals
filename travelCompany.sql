CREATE database travelcompany;

use travelcompany;

CREATE table Location (
    id INT,
    address VARCHAR(40),
    city VARCHAR(40),
    country VARCHAR(40),
    postcode VARCHAR(10),
    PRIMARY KEY (id)
);

CREATE table Person (
    id INT,
    firstName VARCHAR(40),
    lastName VARCHAR(40),
    locationID INT,
    email VARCHAR(40),
    phone VARCHAR(15),
    PRIMARY KEY (id),
    FOREIGN KEY (locationID) REFERENCES Location (id)
);

CREATE table Customer (
    id INT,
    personID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (personID) REFERENCES Person (id)
);

CREATE table Employee (
    id INT,
    personID INT,
    paycode CHAR,
    pay DOUBLE,
    supervisorID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (personID) REFERENCES Person (id),
	FOREIGN KEY (supervisorID) REFERENCES Person (id)
);

CREATE table Airport (
    id INT,
    locationID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (locationID) REFERENCES Location (id)
);

CREATE table Airline (
    id INT,
    _name VARCHAR(40),
    phone VARCHAR(15),
    PRIMARY KEY (id)
);

CREATE table Flight (
    id INT,
    airlineID INT,
    departureAirportID INT,
    arrivalAirportID INT,
    departureTime DATETIME,
    arrivalTime DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (departureAirportID) References Airport (id),
    FOREIGN KEY (arrivalAirportID) References Airport (id)
);

CREATE table FlightReservation (
    id INT,
    flightID INT,
    seatNumber INT,
    price DOUBLE,
    PRIMARY KEY (id),
    FOREIGN KEY (flightID) REFERENCES Flight (id)
);

CREATE table Hotel (
    id INT,
    _name VARCHAR(40),
    locationID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (locationID) REFERENCES Location (id)
);

CREATE table HotelReservation (
    id INT,
    hotelID INT,
    roomNumber INT,
    beds INT,
    rate DOUBLE,
    checkInDate DATETIME,
    checkoutDate DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (hotelID) REFERENCES Hotel (id)
);

CREATE table Car (
    id INT,
    _year INT,
    make VARCHAR(20),
    model VARCHAR(20),
    mpg DOUBLE,
    seats INT,
    PRIMARY KEY (id)
);

CREATE table RentalCarCo (
    id INT,
    _name VARCHAR(20),
    phone VARCHAR(15),
    PRIMARY KEY (id)
);

CREATE table CarReservation (
    id INT,
    rentalCarCoID INT,
    carID INT,
    rate DOUBLE,
    pickupLocationID INT,
    dropoffLocationID INT,
    pickupDate DATETIME,
    dropoffDate DATETIME,
    PRIMARY KEY (id),
    FOREIGN KEY (rentalCarCoID) REFERENCES RentalCarCo (id),
    FOREIGN KEY (carID) REFERENCES Car (id),
    FOREIGN KEY (pickupLocationID) REFERENCES Location (id),
    FOREIGN KEY (dropoffLocationID) REFERENCES Location (id)
);

CREATE table TravelOrder (
    id INT,
    customerID INT,
    agentID INT,
    flightReservationID INT,
    hotelReservationID INT,
    carReservationID INT,
    PRIMARY KEY (id),
    FOREIGN KEY (customerID) REFERENCES Customer (id),
    FOREIGN KEY (agentID) REFERENCES Employee (id),
    FOREIGN KEY (flightReservationID) REFERENCES FlightReservation (id),
    FOREIGN KEY (hotelReservationID) REFERENCES HotelReservation (id),
    FOREIGN KEY (carReservationID) REFERENCES CarReservation (id)
);
