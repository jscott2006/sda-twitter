<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Zaloguj się</title>
    <jsp:include page="include/meta.jsp"/>


</head>
<body>
<jsp:include page="include/menu.jsp"/>
<div class="container mt-5 pt-5">
    <div class="col-md-4 m-auto text-center">
        <form class="form-signin" action="login" method="post">
            <img class="mb-4" src="https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-solid.svg" alt="" width="72" height="72">
            <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
            <label for="inputLogin" class="sr-only">Email address</label>
            <input type="text" id="inputLogin" name="userName" class="form-control" placeholder="Login" required autofocus>
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
            <div class="checkbox mb-3">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button id="loginButton" class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        </form>
    </div>
</div>
<jsp:include page="include/footer.jsp"/>
</body>
</html>
