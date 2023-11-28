    document.getElementById('form').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent the form from submitting normally

    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // hardcoded sample username and password
    var correctUsername = 'getu';
    var correctPassword = '12345678';

    if(username === correctUsername && password === correctPassword) {
        // If the credentials are correct, redirect to the home page
        window.location.href = 'home.html';
    } else {
        // If the credentials are incorrect, show an error message
        alert('Incorrect username or password. Please try again. For SBA please use usename:getu & password:12345678'
    );
    }
});