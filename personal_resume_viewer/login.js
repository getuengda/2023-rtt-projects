   // For simplicity, you can hardcode a sample email and password
   const correctEmail = "getu@gmail.com";
   const correctPassword = "root";

   function login() {
       const email = document.getElementById("email").value;
       const password = document.getElementById("password").value;
       const resumeContainer = document.getElementById("resumeContainer");
       const loginBox = document.getElementById("loginBox");

       if (email === correctEmail && password === correctPassword) {
           // Successful login
           loginBox.style.display = "none";
           resumeContainer.style.display = "block";
           showResume(); // Call the function to display resume content
       } else {
           // Failed login
           alert("Invalid email or password. Please try again.");
       }
   }

   function showResume() {
       const profileContainer = document.getElementById("profileContainer");
       // You can add your logic to populate the resume content here
       // For example, you can create elements and append them to the profileContainer
   }
   