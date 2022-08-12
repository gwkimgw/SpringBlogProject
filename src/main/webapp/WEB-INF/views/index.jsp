<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<nav class="navbar navbar-expand-md bg-dark navbar-dark">
    <a class="navbar-brand" href="/blog">Home</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="collapsibleNavbar">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="/user/login">Login</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="/user/join">Sign UP</a>
            </li>
        </ul>
    </div>
</nav>
<br>
<div class="container">
    <div class="card m-2">
        <div class="card-body">
            <h4 class="card-title">Title</h4>
            <p class="card-text">Contents</p>
            <a href="#" class="btn btn-primary">Specify</a>
        </div>
    </div>
    <div class="card m-2">
        <div class="card-body">
            <h4 class="card-title">Title</h4>
            <p class="card-text">Contents</p>
            <a href="#" class="btn btn-primary">Specify</a>
        </div>
    </div>
    <div class="card m-2">
        <div class="card-body">
            <h4 class="card-title">Title</h4>
            <p class="card-text">Contents</p>
            <a href="#" class="btn btn-primary">Specify</a>
        </div>
    </div>
</div>
<div class="jumbotron text-center" style="margin-bottom:0">
    <p>Created by: whom</p>
    <p>How to contact</p>
    <p>Where to contact</p>
</div>
</body>
</html>