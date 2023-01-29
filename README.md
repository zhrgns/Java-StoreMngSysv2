# Java-StoreMngSysv2
This repo includes one of my personal projects written in Java. It is in early design phase. It will updated later.

The project provides a basic inventory management system for a tech store that allows the user to view all products in a database, add new products from the database. It uses a simple GUI and JDBC to interact with a database.

* MainScreen invoked in the Main method makes visible the Main Screen on the user's display.

* MainScreen class represents a window with a GUI that allows the user to input product information, add the product to a database(MySQL), view a list of products, and reset the input fields.

* ProductDAO class contains CRUD methods for interacting with the MYSQL database. The class establishes a connection to the DB using url,password, and username. Inserting a new product to DBa and making a list of all products from DB are functions of this class.

* Product class is a blueprint for creating product objects, with various fields. 

[](mainscreen.jpg)