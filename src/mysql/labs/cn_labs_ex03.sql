-- mysql labs - Ex. 03

USE airtravel;

-- 1. query all flights on a specific day
SELECT * FROM Flight WHERE departureDate = '1961-05-20';

-- 2. query all flights between two specific cities on a specific day
SELECT f.id, f.departureDate, f.departureTime, d.city, a.city
FROM Flight f
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE d.city = 'Los Angeles' AND a.city = 'Rome' AND f.departureDate = '1961-05-20';

-- 3. query all passengers on a specific flight between two specific cities today
SELECT f.id, f.departureDate, f.departureTime, d.city, a.city, p.firstName, p.lastName
FROM Flight f
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
JOIN Ticket t ON t.flightID = f.id
JOIN Passenger p ON p.id = t.passengerID
WHERE d.city = 'Los Angeles' AND a.city = 'Rome' AND f.departureDate = '1961-05-20';

-- 4. query the flight information for a specific passenger on a specific flight
SELECT f.*, p.*, d.city, a.city
FROM Passenger p
JOIN Ticket t ON t.passengerID = p.id
JOIN Flight f ON t.flightID = f.id
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE f.id = 1 AND p.firstName = 'Lily' AND p.lastName = 'Valley';

-- 5. query the passenger information for a specific user on a specific flight yesterday
SELECT p.*, f.*, d.city, a.city, al.*, ap.*
FROM Passenger p
JOIN Ticket t ON t.passengerID = p.id
JOIN Flight f on t.flightID = f.id
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
JOIN Airline al ON f.airlineID = al.id
JOIN Airplane ap ON f.airplaneID = ap.id
WHERE p.firstName = 'Billy' AND p.lastName = 'Bumpkin'
AND f.id = 7;

-- 6. query the number of flights between two specific cities this week, month, and year
SELECT COUNT(f.id) AS Num_Flights_LA_to_Rome
FROM Flight f
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE d.city = 'Los Angeles' AND a.city = 'Rome'
AND f.departureDate BETWEEN '1961-05-15' AND '1961-05-25';

-- 7a. query the number of passengers that travelled between two specific cities today, this week, month and year
SELECT COUNT(p.id) AS Num_Passengers
FROM Passenger p
JOIN Ticket t ON t.passengerID = p.id
JOIN Flight f ON t.flightID = f.id
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE d.city = 'Los Angeles' AND a.city = 'Rome'
AND f.departureDate = '1961-05-20';

-- 7b. query the number of passengers that travelled between two specific cities this week
SELECT COUNT(p.id) AS Num_Passengers
FROM Passenger p
JOIN Ticket t ON t.passengerID = p.id
JOIN Flight f ON t.flightID = f.id
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE d.city = 'Los Angeles' AND a.city = 'Rome'
AND f.departureDate BETWEEN '1961-05-15' AND '1961-05-25';

-- 7c. query the number of passengers that travelled between two specific cities this month
SELECT COUNT(p.id) AS Num_Passengers
FROM Passenger p
JOIN Ticket t ON t.passengerID = p.id
JOIN Flight f ON t.flightID = f.id
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE d.city = 'Los Angeles' AND a.city = 'Rome'
AND f.departureDate LIKE '1961-05-%';

-- 7d. query the number of passengers that travelled between two specific cities this year
SELECT COUNT(p.id) AS Num_Passengers
FROM Passenger p
JOIN Ticket t ON t.passengerID = p.id
JOIN Flight f ON t.flightID = f.id
JOIN Airport d ON f.departureID = d.id
JOIN Airport a ON f.arrivalID = a.id
WHERE d.city = 'Los Angeles' AND a.city = 'Rome'
AND f.departureDate LIKE '1961-%';

-- 8. insert records for new flights between airports
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (2, 1, 2, 1, '2025-08-29', '00:00:00', '2025-08-29', '12:00:15');
INSERT INTO Flight (airlineID, airplaneID, departureID, arrivalID, departureDate, departureTime, arrivalDate, arrivalTime)
  VALUES (1, 2, 3, 2, '2025-08-29', '00:00:00', '2025-08-29', '12:00:15');

-- 9. insert records for new tickets and passengers on specific flights
INSERT INTO Passenger (firstName, lastName) VALUES ("John", "Dean");
INSERT INTO Passenger (firstName, lastName) VALUES ("Sam", "Gamgee");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(4, 13, "pizza");
INSERT INTO Ticket (passengerID, flightID, meal) VALUES(5, 14, "locusts");

-- 10. update meal preference (or something similar) for a specific passenger on a specific flight
UPDATE Ticket t
JOIN Flight f ON t.flightID = f.id
JOIN Passenger p ON t.passengerID = p.id
SET t.meal = 'grapes'
WHERE f.id = 14 AND p.firstName = 'Sam' AND p.lastName = 'Gamgee';




