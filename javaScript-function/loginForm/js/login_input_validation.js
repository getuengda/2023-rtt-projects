const form = document.querySelector("#form");
const username = document.querySelector("#username");
const password = document.querySelector("#password");

form.addEventListener("submit", (e) => {
    e.preventDefault();
    validateLogInInputs();
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

// login input validation

const validateLogInInputs = () => {
  const usernameValue = username.value.trim();
  const passwordValue = password.value.trim();

  let isUsernameValid = usernameValue !== "" && setSuccess(username);
  console.log("isUserName" + isUsernameValid);
  let isPasswordValid =
    passwordValue !== "" && passwordValue.length >= 8 && setSuccess(password);

  if (usernameValue === "") {
    isUsernameValid = setError(username, "Username is required");
  }

  if (passwordValue === "") {
    isPasswordValid = setError(password, "Password is required");
  } else if (passwordValue.length < 8) {
    isPasswordValid = setError(
      password,
      "Password must be at least 8 characters."
    );
  }

  // Check if all inputs are valid
  if (isUsernameValid && isPasswordValid) {
    form.submit(); // Submit the form if everything is valid
  }
};