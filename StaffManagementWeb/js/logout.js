document.getElementById('logout').addEventListener('click', function(event) {
    event.preventDefault(); 
    // Clear any user data
    localStorage.removeItem('username');

    // Redirect to the login page
    window.location.href = 'login.html';
});