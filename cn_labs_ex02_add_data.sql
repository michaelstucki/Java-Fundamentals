USE airtravel;

INSERT INTO Airline (name, phone) VALUES ("Up Up N Away", "111-111-1111");
INSERT INTO Airline (name, phone) VALUES ("TicketToRide", "333-333-3333");

INSERT INTO Airplane (make, model) VALUES ("Boeing", "falcon");
INSERT INTO Airplane (make, model) VALUES ("Airbus", "ostrich");
INSERT INTO Airplane (make, model) VALUES ("Airbus", "sparrow");

INSERT INTO Airport (name, address, city, country, postcode) VALUES ("AIX", "000 Lost Road", "Los Angeles", "USA", "00000");
INSERT INTO Airport (name, address, city, country, postcode) VALUES ("LAX", "111 Autumn Lane", "Paris", "France", "11111");
INSERT INTO Airport (name, address, city, country, postcode) VALUES ("DIA", "777 Colliseaum Trail", "Rome", "Italy", "33333");

INSERT INTO Passenger (firstName, lastName) VALUES ("Lily", "Valley");
INSERT INTO Passenger (firstName, lastName) VALUES ("Monica", "Snooze");
INSERT INTO Passenger (firstName, lastName) VALUES ("Billy", "Bumpkin");

INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 1, 1, 2, '1961-05-20', '17:05:00', '1961-05-20', '22:01:05');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 2, 1, 3, '1961-05-20', '10:05:00', '1961-05-20', '12:00:15');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 1, 2, 1, '1961-05-20', '17:05:00', '1961-05-20', '22:01:05');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 2, 2, 3, '1961-05-20', '10:05:00', '1961-05-20', '12:00:15');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 1, 3, 1, '1961-05-20', '17:05:00', '1961-05-20', '22:01:05');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 2, 3, 2, '1961-05-20', '10:05:00', '1961-05-20', '12:00:15');

INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 1, 1, 2, '1961-06-20', '17:05:00', '1961-06-20', '22:01:05');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 2, 1, 3, '1961-05-20', '10:05:00', '1961-05-20', '12:00:15');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 1, 2, 1, '1961-06-20', '17:05:00', '1961-06-20', '22:01:05');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 2, 2, 3, '1961-05-20', '10:05:00', '1961-05-20', '12:00:15');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 1, 3, 1, '1961-06-20', '17:05:00', '1961-06-20', '22:01:05');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 2, 3, 2, '1961-05-20', '10:05:00', '1961-05-20', '12:00:15');

INSERT INTO Ticket (passengerID, flightID, meal) VALUES(1, 1, "crackers");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(1, 12, "lasagna");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(1, 5, "crackers");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(2, 1, "lasagna");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(2, 2, "crackers");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(3, 1, "lasagna");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(3, 3, "crackers");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(1, 12, "lasagna");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(2, 11, "lasagna");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(3, 6, "crackers");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(3, 7, "crackers");
