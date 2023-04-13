# JakartaEE App

- Create a new project
- In template select web application
- In application server, add a new one, select glasfish server and select your glasfish file
- In project name, type the name of your project
- Click next, in dependencies make sure Servlet API is selected
- Finish creating
- You can find the html of the project in the folder 
- src/main/java you have our serv
- in src/main/webapp you have the html file
- If i want to add new pages I'm gonna right click on the webapp folder and add new jsp

- To activate hotrealoading go to the top right and click in glassfish, change on update action and on frame deactivation to update classes and resources
- This needs you to be careful because this is using cache so you need to clear it for seeing the changes sometimes
----
- Methods for request and response: get and post, for seeign whaat's happening in the server 
- In HelloServlet i can see the method doGet using the httpservlet object
- `throws IOException` : I want to throw an exception  if somethng goes worong
- `response.setContentType("text/html");`: I'm gonna send the response to the browser in form of html
- `PrintWriter out = response.getWriter();` prints the information in html like echo in php

---- 
For JDBC
- Go tho java folder, in the project and right click add new packge: One for DAO (Data Access Operation) and one for Model 
- Now add the connection string in the DAO
- Insde of the DAO create a new java class DAOConnection and this is gonna be the class for the connection
- For the exam she's gonna give us the info of the database and we need to put it in the attributes of the DAOConnection class

- Now we need to add the jdbc driver
- File -> project structure -> libraries -> add your project -> on the right is gonna appear and then you're gonna add the .jar file corresponding to the jdbc
- After creating the variables for user and password, create constructor
- create the function get conection, im;pport import java.sql.*;
- I need to create a model User, java class, in the DBConnection i create a new function `public void insertUser(User user)` i need to import the package Useruser