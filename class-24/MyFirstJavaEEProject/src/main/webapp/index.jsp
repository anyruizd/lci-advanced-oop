<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<br>
<div class="container col-md-5">
    <div class="card">
        <div class="card-body">

            <form action="insert" method="post">
                <caption>
                    <h2> Add New User</h2>
                </caption>
                <fieldset class="form-group">
                    <label>User Name</label> <input type="text"
                                                    value="<c:out value='${user.name}' />" class="form-control"
                                                    name="name" required="required">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Email</label> <input type="text"
                                                     value="<c:out value='${user.email}' />" class="form-control"
                                                     name="email">
                </fieldset>

                <fieldset class="form-group">
                    <label>User Country</label> <input type="text"
                                                       value="<c:out value='${user.country}' />" class="form-control"
                                                       name="country">
                </fieldset>

                <button type="submit" class="btn btn-success">Save</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
