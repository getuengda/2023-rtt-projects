let body = document.querySelector("body")
let dark = document.querySelector("dark-mode")
let light = document.querySelector("light-mode")


function darkMode(){
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

  btn.addEventListener("click", function(){
    const li = document.createElement("li");
    const inp = document.querySelector("input");
    li.textContent = inp.value;

    document.querySelector("ul").appendChild(li)
    //inp.value = "";
  });


