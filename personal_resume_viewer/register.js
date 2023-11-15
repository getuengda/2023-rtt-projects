const users = []; // Array to store registered users

// Function to handle registration
function register() {
    const regName = document.getElementById("regName").value;
    const regEmail = document.getElementById("regEmail").value;
    const regPassword = document.getElementById("regPassword").value;

    // Check if the email is already registered
    if (users.some(user => user.email === regEmail)) {
        alert("Email already registered. Please use a different email.");
        return;
    }

    // Add the new user to the array
    const newUser = { name: regName, email: regEmail, password: regPassword };
    users.push(newUser);

    // Reset the registration form
    document.getElementById("regName").value = "";
    document.getElementById("regEmail").value = "";
    document.getElementById("regPassword").value = "";

    // Inform the user about successful registration
    alert("Registration successful! You can now log in with your new account.");

    // Show the login form and hide the registration form
    document.getElementById("loginBox").style.display = "block";
    document.getElementById("registerBox").style.display = "none";
}

// Function to switch to the registration form
function showRegistrationForm() {
    document.getElementById("loginBox").style.display = "none";
    document.getElementById("registerBox").style.display = "block";
}
