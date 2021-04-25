# Summary
This project was developed in two parts, front end and back end.
The front end was created using "Create React App" and had the `App.js` class modified to display the chart, for the graphical part the library react-chartjs-2 was used. The front end project can be accessed in this repository: https://github.com/GHilsdorf/ChartReactJS.
The back end was created using Spring Initializr, it uses an H2 database in memory and JPA to do the persistence in the database. All the backend code is inside this project. The list of classes and relevant files of the back end are:
`\src\main\resources\data.sql`: contains the schema and data for the database.
`\src\main\resources\application.properties`: contains Spring Boot configurations for H2 and JPA.
`\src\main\java\gc\hilsdorf\reactiveChart\..`:
`\config\WebConfig.java`: CORS configuration.
`\controller\UserController.java`: repository that provide the endpoint /getUsers.
`\model\User.java`: contains user information and enum of regions.
`\repository\UserRepository.java`: JPA repository for persistence of the user table.

# How to run:
The front end and the backend are two independent applications and therefore both need to be executed.

### Back end:
Download this repository, go to \ReactiveChart (where you can see the pom.xml file) and run the command `mvn clean install`, after you build you can run using the command `java -jar target/reactiveChart-0.0.1-SNAPSHOT.jar`. After the application starts you can access the GET endpoint in your browser using the [/getUsers](http://localhost:8080/getUsers) on localhost:8080. I also left the H2 console enabled and you can access it [here](http://localhost:8080/h2-console/), to log in you need to use `user: sa`, `JDBC URL: jdbc:h2:mem:testdb` and no password. To reflect the database changes to the chart you will need to refresh the localhost:3000 page.

### Front end:
Download the [ChartReactJS](https://github.com/GHilsdorf/ChartReactJS) app, go to \ChartReactJS and run the command `npm start`. After the application starts you can access at [http://localhost:3000](http://localhost:3000).



File **ANSWERS.txt** is located in the root of this project.

Note: in the sample Asia is listed as one of the regions, but not in the specification, so I did not include Asia in my appplication.