// for this SBA the following is used only to validate inputs
// In the case study will be applied fully
const users = []; // Array to store registered staff

// Function to handle registration
function register() {
    const register = document.getElementById('register')
    const form = document.getElementById("form");
    const username = document.getElementById("username");
    const email = document.getElementById("email");
    const password = document.getElementById("password");
    const password2 = document.getElementById("password2");

    const regName = username.value;
    const regEmail = email.value;
    const regPassword = password.value;
    const regPassword2 = password2.value;

    // Check if the email is already registered
    if (users.some(user => user.email === regEmail)) {
        showError(email, "Email already registered. Please use a different email.");
        return;
    }

    // Check if the passwords match
    if (regPassword !== regPassword2) {
        showError(password2, "Passwords do not match.");
        return;
    }

    // Add the new user to the array
    const newUser = { name: regName, email: regEmail, password: regPassword };
    users.push(newUser);
    console.log(users);

    // Reset the registration form
    username.value = "";
    email.value = "";
    password.value = "";
    password2.value = "";

    // Inform the user about successful registration
    alert("Registration successful! You can now log in with your new account.");
    window.location.href = "login.html";

    // Show the login form and hide the registration form
    document.getElementById("loginBox").style.display = "block";
    document.getElementById("registerBox").style.display = "none";
}

// Function to switch to the registration form
function showRegistrationForm() {
    document.getElementById("loginBox").style.display = "none";
    document.getElementById("registerBox").style.display = "block";
}

// Function to show error
function showError(input, message) {
    const formControl = input.parentElement;
    formControl.className = 'input-control error';
    const small = formControl.querySelector('div');
    small.innerText = message;
}

// Function to show success
function showSuccess(input) {
    const formControl = input.parentElement;
    formControl.className = 'input-control success';
}
