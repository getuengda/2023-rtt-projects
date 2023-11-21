const form = document.querySelector("#form");
const username = document.querySelector("#username");
const email = document.querySelector("#email");
const password = document.querySelector("#password");
const password2 = document.querySelector("#password2");

form.addEventListener("submit", (e) => {
    e.preventDefault();
    validateInputs();
  });

const setError = (element, message) => {
  const inputControl = element.parentElement;
  const errorDisplay = inputControl.querySelector(".error");

  errorDisplay.innerText = message;
  inputControl.classList.add("error");
  inputControl.classList.remove("success");

  return false;
};

const setSuccess = (element) => {
  const inputControl = element.parentElement;
  const errorDisplay = inputControl.querySelector(".error");

  errorDisplay.innerText = "";
  inputControl.classList.add("success");
  inputControl.classList.remove("error");

  return true;
};

const isValidEmail = (email) => {
  const reg =
    /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
  return reg.test(String(email).toLowerCase());
};

// input validation

const validateInputs = () => {
  const usernameValue = username.value.trim();
  const emailValue = email.value.trim();
  const passwordValue = password.value.trim();
  const password2Value = password2.value.trim();

  let isUsernameValid = usernameValue !== "" && setSuccess(username);
  console.log("isUserName" + isUsernameValid);
  let isEmailValid =
    emailValue !== "" && isValidEmail(emailValue) && setSuccess(email);
  let isPasswordValid =
    passwordValue !== "" && passwordValue.length >= 8 && setSuccess(password);
  let isPassword2Valid =
    password2Value === passwordValue && setSuccess(password2);

  if (usernameValue === "") {
    isUsernameValid = setError(username, "Username is required");
  }

  if (emailValue === "") {
    isEmailValid = setError(email, "Email is required");
  } else if (!isValidEmail(emailValue)) {
    isEmailValid = setError(email, "Provide a valid email address");
  }

  if (passwordValue === "") {
    isPasswordValid = setError(password, "Password is required");
  } else if (passwordValue.length < 8) {
    isPasswordValid = setError(
      password,
      "Password must be at least 8 characters."
    );
  }

  if (password2Value === "") {
    isPassword2Valid = setError(password2, "Please confirm your password");
  } else if (password2Value !== passwordValue) {
    isPassword2Valid = setError(password2, "Passwords don't match");
  }

  // Check if all inputs are valid
  if (isUsernameValid && isEmailValid && isPasswordValid && isPassword2Valid) {
    form.submit(); // Submit the form if everything is valid
  }
};





