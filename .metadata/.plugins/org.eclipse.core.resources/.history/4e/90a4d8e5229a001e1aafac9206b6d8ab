<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
        content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>User Registration</title>
    <!-- Bootstrap CSS -->
   
</head>
<body>

    <div class="container mt-5">
        <h2 class="mb-4">David Smith Registration Page</h2>
        <form method="post" action="RegisterServlet.jsp">
            <div class="form-group">
                <label for="userName">User-Name:</label>
                <input type="text" class="form-control" id="userName" name="userName" required="true" />
            </div>

            <div class="form-group">
                <label for="userRole">User-Role:</label>
                <input type="text" class="form-control" id="userRole" name="userRole" required="true" />
            </div>

            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" class="form-control" id="email" name="email" required="true" />
            </div>

            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" class="form-control" id="password" name="password" required="true" />
            </div>

            <div class="form-group">
                <label for="confirmPassword">Confirm the Password:</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required="true" />
            </div>

            <div class="form-group">
                <span id="passwordMatchError" style="color: red;"></span>
            </div>

            <button type="submit" class="btn btn-primary" onclick="return validatePassword()">Register</button>
        </form>
    </div>
    
    <a href="login.jsp" > Login information </a>

    <!-- Bootstrap JS and dependencies -->
    <script
        src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

    <script>
        function validatePassword() {
            var password = document.getElementById("password").value;
            var confirmPassword = document.getElementById("confirmPassword").value;

            if (password !== confirmPassword) {
                document.getElementById("passwordMatchError").innerHTML = "Passwords do not match!";
                return false;
            } else {
                document.getElementById("passwordMatchError").innerHTML = "";
                return true;
            }
        }
    </script>
</body>
</html>