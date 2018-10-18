# energy

Web Service using E=MC^2 to calculate energy in joules when passing a mass value in kg and vise versa.

Getting Started
Run web service as Spring Boot project.

$ mvn spring-boot:run

URL to convert Energy to Mass:

http://localhost:8080/mass/10.00  returns 8.9875517873681766E17

10.00 kg of mass produces 8.9875517873681766E17 joules of energy

URL to convert Mass to Energy

http://localhost:8080/energy/10000.00

10000 joules of energy produces 1.1126500560536185E-13 kg of mass

All values are doubles.

Versioning
0.0.1-SNAPSHOT

Author
Ken Bingham

License
This project is licensed under the MIT License - see the LICENSE.md file for details

Acknowledgments
Hat tip to Albert Einstein for supplying the equation
