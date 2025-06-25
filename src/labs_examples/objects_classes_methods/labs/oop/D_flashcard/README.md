This OOP Lab D program implements a simple flashcard application.
User can:
1. View all cards on record.
2. Add a new card.
3. Delete a card.
4. Drill the cards.

It is designed as an Model-View-Controller (MVC).
It codes to interfaces to provide loose coupling between each layer.
The View layer interacts with the user.
The Model layer interacts with the data (cards).
The Controller orchestrates the actions of the View and Model layers.
The cards are persisted by a external file on disk.
