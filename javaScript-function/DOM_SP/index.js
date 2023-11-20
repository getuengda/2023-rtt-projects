
const body = document.querySelector("body");
const dark = document.querySelector("#dark-mode");
const light = document.querySelector("#light-mode");

function darkMode() {
  body.style.backgroundColor = "black";
  body.style.color = "white";
}

function lightMode() {
  body.style.backgroundColor = "white";
  body.style.color = "black";
}

light.addEventListener("click", lightMode);
dark.addEventListener("click", darkMode);


const btn = document.querySelector("#btn");

btn.addEventListener("click", function () {
    const li = document.createElement("li");
    const inp = document.querySelector("input");
  
    // Check if the input value is not empty before appending
    if (inp.value.trim() !== "") {
      li.textContent = inp.value;
      document.querySelector("ul").appendChild(li);
  
      // Clear the input field
      inp.value = "";
    }
  });

// btn.addEventListener("click", function () {
//   const li = document.createElement("li");
//   const inp = document.querySelector("input");
//   li.textContent = inp.value
//   document.querySelector("ul").appendChild(li);
// });