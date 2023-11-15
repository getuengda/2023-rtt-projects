console.log("Hello  everyone");

// let x = 8;
// let y = 9;
// let solution = x* y;
// console.log(solution);


let sol = 7 === "7";
console.log(sol);

let thislogic = 3 > 7 && 6 == 6;
let thislogic2 = 9 > 7 && 6 == 6;
console.log(thislogic);
console.log(thislogic2);

const firstName = "Getu";
const lastName = "Tad";

//console.log(firstName + " " + lastName + " " + "is age " + 200);
console.log(`${firstName}` + " " + `${lastName}` + " " + "is age " + 200);

//Conditional Statement
let age = 20;

if(age >= 21){
    console.log("You can enter")
} else{
    console.log("You are not of age")
}

let x = 5;
let y = 4;
let operand = "+";
switch (operand) {
   case "+":
       console.log(x + y);
       break;
   case "-":
       console.log(x - y);
       break;
   case "*":
       console.log(x * y);
       break
   case "/":
       console.log(x / y);
       break;
   default:
       console.log("Invalid Operand")
       break;
}

let num = 5;
while(num <= 8){
    console.log(num);
    num++;
}

for(let i = 0; i < 5; i++){
    console.log(i);
}

for (let i = 5; i > 0; i--){
    console.log(i);
}


let number = 1;
do{
    let value = number * 2;
    number ++;
    console.log("The output for value: " + value)

}while(number <= 5);