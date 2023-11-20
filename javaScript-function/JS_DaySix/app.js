
// JavaScript Objects

// let person = {
//     firstName: "John",
//     lastName: "Doe",
//     age: 50,
//     eyeColor: "blue",
//     fullName: function() {
//         return this.firstName + " " + this.lastName;
//     }
//     };

// person.hairColor = "green"
// person.age = 99;
// person.firstName = "Getu"
// person.eyeColor = "golden"
// person.height = 1.58



// // console.log(person.firstName + " is " + person["age"] + " years old.");


// //keys
// const objectKeys = Object.keys(person);
//  console.log(objectKeys); 

// // //values
// const objectValues = Object.values(person);
// console.log(objectValues); 

// // //entries
// const objectEntries = Object.entries(person);
// console.log(objectEntries); 
// console.log(person["height"]);
// console.log("My full nmae is " + person.firstName + " " + person.lastName);
// console.log(person.fullName());

// const student = {
// 	firstName: "John", 
// 	lastName: "Doe", 
// 	age: 30, 
// 	class: "Java developer",
//  people: {1: "jhon"}
// };
// student.score = "90%"; // add new property

// console.log(student.people[2])
// // to add value to nested object
// student.people[4] = "Getu";
// console.log(student.people[4])

// const arr1 = [1,2,3,4,5,6];
// const arr2 = ["arr", "get", "sema"];

// console.log(arr1[2]);
// console.log(arr2[2]);
// console.log(arr2);

// const multiArray = [
//     [{ key1: "value1", key2: "value2" }, 
//      { key1: "value3", key2: "value4" }],
//     [{ key1: "value5", key2: "value6" }, 
//      { key1: "value7", key2: "value8" }]
// ];
// // ArrayName[array_index][internal_array_index][object_key]	
// console.log(multiArray[1][0]["key2"]);	// value6
// console.log(multiArray[1][1]["key1"]);	// value7
// console.log(multiArray[0][0]["key1"]);	// value1

// const arr3 = ["Abb", "ccc", "ddd"];
// arr3.push("ddd"); // add elements at the end of the array
// //arr3.pop() // remove elements at the end of the array
// arr3.shift("getu");

// const a = [1,2,3,4];
// const x = a.join();
// const y = a.join(" ");
// const z = a.join("/");

// console.log(arr3[3]);
// console.log(arr3);
// console.log(z);


// let n = ["babana","cherry", "apple"];
// const n1 = [6,2,8,4,5];
// n1.sort();
// console.log(n1)
// console.log(n)

// const m = [1,2,3,4,5,6,7]
// const mm = m.slice(0, 4);
// const mmm = m.slice(1, -1);
// const zz = m.slice(-3, -2);
// console.log(zz);


// let fruits = ["babana","cherry", "apple", "mango"];
// fruits.splice(2, 0 , "lemon", "kiwi", "grape");
// console.log(fruits);

// let xy = [22,23,24,25,26,27,78,81, 100]
// // for(let i = 0; i <xy.length; i++){
// //     console.log(xy);
// // }

// // for(const num of xy){
// //     console.log(xy);
// // }

// for(const num in xy){
//     console.log(xy);
// }

// for(const xyz in student){
//     console.log(xyz);
// }


// function Person(first, last, age, eye) {
// 	this.firstName = first;
// 	this.lastName = last;
// 	this.age = age;
// 	this.eyeColor = eye;
// }

// // add new properties to object constructor
// //Person.species = "Human";
// Person.prototype.species = "Human";
// const myFather = new Person("Tadd", "Seifu", 50, "blue", "nature")
// console.log(myFather);

// new Date()
// const d = new Date();
// console.log(d);
// new Date(year, month, ...)
// const d2 = new Date(2021,11,24,10,33,30,0);
// console.log(d2);
// const d3 = new Date(2021, 11, 24);
// console.log(d3);
//new Date(dateString)
// const d4 = new Date("October 13, 2021 11:13:00"); 
// console.log(d4);
// // new Date(milliseconds)
// const d5 = new Date(86400000);
// console.log(d5);

// const str = "23";
// const num = Number(str);
// console.log(typeof num);
// console.log(typeof str);
// console.log(num);

// console.log(Number(340900000000000000).toExponential()); 

// const z = Math.round(5.7)
// const y = Math.pow(8, 2);
// const m = Math.sqrt(64);	
// const c = Math.ceil(4.4);
// const f = Math.floor(4.7);
// console.log(f)

// Return a range of whole-number values
// from min (inclusive) to max (inclusive)
// const min = 5;
// const max = 10;
// let value = Math.floor(Math.random() * (max - min + 1) + min);
// console.log(value);

// Modify this script so that every time the user enters their guess, the program updates the range. The range should narrow as the user guesses. 

/* For example:
Guess a number between 1 and 10:  3
Guess a number between 4 and 10:  5
	You got it:  5
*/

// const input = prompt("Enter a range of two numbers, separated by a space e.g. (23 34): ");
// const [min, max] = input.split(" ");
// const guess = Math.floor(Math.random() * (Number(max) - Number(min) + 1) + Number(min));
// let limiter = 0;
// let userGuess;
// while(limiter <= 10){
//     userGuess = prompt(`Guess a number between ${min} and ${max}: `);
//     if(userGuess === guess) {
//         alert("You got it: " + userGuess);
//         break;
//     }
//     limiter++
// }
// if(guess != userGuess){
//     alert("Sorry, the answer was: " + guess);
// }

