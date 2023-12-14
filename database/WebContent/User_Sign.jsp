<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>User Signup</title>
    <!-- Bootstrap CSS -->
</head>
<body class="bg-light">

<div class="container mt-5 text-center d-flex align-items-center justify-content-center flex-column">
    <h2 class="mb-4">User Signup</h2>

    <form action="SignUpServlet.jsp" method="post" class="mx-auto">
        <div class="form-group">
            <label for="firstname">First Name:</label>
            <input type="text" class="form-control" id="firstname" name="firstname" required>
        </div>

        <div class="form-group">
            <label for="lastname">Last Name:</label>
            <input type="text" class="form-control" id="lastname" name="lastname" required>
        </div>

        <div class="form-group">
            <label for="creditcard">Credit Card:</label>
            <input type="text" class="form-control" id="creditcard" name="creditcard" required>
        </div>

        <div class="form-group">
            <label for="email">Email:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>

        <!-- Add the following code to include password field -->
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>

        <button type="submit" class="btn btn-primary">Signup</button>
    </form>
</div>

<a href="userlogin.jsp" class="text-center d-block mt-3">Go To Login Page</a>

<!-- Bootstrap JS and jQuery -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</body>
</html>
