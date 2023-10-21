# JetsProject

# Description
ou are going to create a fleet of jets with different capabilities. Your application will be a menu to use your jets and access information about them.

As you work through the user stories think about what classes you will need before your start writing code.

Structure
All jets must have a model, speed, range, and price associated with them. Speed is in MPH, but your Jet can also output the speed in mach.

Jets have a fly() method that prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).

Specialized Behavior
Jet itself is an abstract base class. Its purpose it to be extended by other types with different behavior.

That said, you will still have a plain vanilla PassengerJet class that extends the base class.

You must create two interfaces of your choice for specializations of Jets. For example, CargoCarrier could have a loadCargo() method (which just prints out a message about loading cargo). CombatReady could have a method fight().

You must create 2 concrete classes that each extend Jet and implement 1 of your interfaces.

Do not structure your code so that all implementation classes implement all interfaces.
Have your code create at least 2 instances of each of these concrete classes.
UML Diagrams
For those of you that are having trouble getting started, we have provided you with a partial UML diagram here. (The diagram does not contain all the methods you will need.)

User Story #1
Create a JetsApplication with a main method to launch your program.

User Story #2
Jets are found at an AirField. Create the AirField class, which has an empty List of Jets.

User Story #3
On program startup, populate the AirField with at least 3 Jets of different types.

These jets must be read from a text file, where each line in the file contains data for a single Jet object.

This file exists at the root of your Eclipse project. It can be comma- or tab-separated; either implementation is acceptable.
The method to parse a file into Jet objects should return a List<Jet> (ie: the AirField's fleet). Its parameter can be a String file name.
Remember to use String.split(regex) to break each line in the file into data to create an individual jet.
User Story #4
There is a menu with these options:

List fleet
Fly all jets
View fastest jet
View jet with longest range
Load all Cargo Jets
Dogfight!
Add a jet to Fleet
Remove a jet from Fleet
Quit
User Story #5
List fleet prints out the model, speed, range, and price of each jet. (There must be at least 5 jets stored when the program starts).

User Story #6
Fly all Jets calls the fly() method on the entire fleet of jets. fly() prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).

User Story #7
The view fastest jet and longest range options both print out all of the information about a jet.

Note: these methods must search the collection of jets to find the appropriate jet.
User Story #8
The user is presented with an option specific to the interfaces you created. For example, Load all Cargo Jets, above, finds all implementors of the CargoCarrier interface and calls loadCargo() on each. (Note that the menu text is italicized because your options may be different, depending on your interfaces.)

User Story #9
A user can add custom jets to the fleet.

This can be a PassengerJet.
Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
Users then enter information for the Jet, and it is added to the AirField.

User Story #10
A user can remove a jet from the fleet.

The user is presented with a sub-menu allowing them to select which jet in the fleet to delete by its number.
User Story #11
The program continues until the user selects the option to Quit, which exits the program.

Stretch Goals
Try implementing these stories only when you have committed and pushed a working project meeting all the above requirements.

User Story #12
Users see a menu item to fly an individual Jet, and then choose the Jet in a sub-menu.

User Story #13
Each jet has a pilot.

User Story #14
Assign a random pilot to each jet that is created.

User Story #15
Users can hire pilots.

User Story #16
Whenever a jet's information is displayed, that jet's pilot and their information should be displayed.

User Story #15
The user is given a menu option to save jets to a file. When selected the user enters the file name. The program then saves all jets to that file in the same format as the original input file. The code should first check that the file name isn't the same as the original input file, printing an error message if it is.
# Technologies Used
Eclipse, OOP, Java
# Lessons Learned
OOP, IOStream, Interfaces, Abstract Class, Polymorphism, Encapsulation