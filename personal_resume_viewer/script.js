// For simplicity, you can hardcode a sample email and password
const correctEmail = "user@example.com";
const correctPassword = "securepassword";

function login() {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const resumeContainer = document.getElementById("resumeContainer");
    const loginForm = document.getElementById("loginForm");

    if (email === correctEmail && password === correctPassword) {
        // Successful login
        loginForm.style.display = "none";
        resumeContainer.style.display = "block";
    } else {
        // Failed login
        alert("Invalid email or password. Please try again.");
    }
}
