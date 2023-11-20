// Class Declaration
// class Person {
//   constructor(firstName, lastName, age, eyeColor) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.age = age;
//     this.eyeColor = eyeColor;
//   }
//   get name() {
//     return (
//       this.firstName + " " + this.lastName
//     );
//   }
//   set age(new_age) {
//     this.years = new_age;
//   }
//  setEyeColor(new_color) {
//     this.eyeColor = new_color;
//   }
//   get age() {
//     return this.age;
//   }
// }
// const myFather = new Person("John", "Doe", 50, "blue");
// console.log(myFather.firstName); // John
// console.log(myFather.lastName); // Doe
// console.log(myFather.name); // John Doe
// myFather.age = 51;
// console.log(myFather.age);

// // Class Declaration
// class Person {
//   static species = "Human";

//   constructor(firstName, lastName, age, eyeColor) {
//     this.firstName = firstName;
//     this.lastName = lastName;
//     this.years = age;
//     this.eyeColor = eyeColor;
//   }
//   static greet() {
//     // Math.random() is also a static method!
//     if (Math.random() <= 0.5) console.log("Hello!");
//     else console.log("Hi!");
//   }
// }
// const myFather = new Person("John", "Doe", 50, "blue");
// console.log(myFather.species); // undefined
// console.log(Person.species); // Human
// Person.greet();

// class Person {
//   #firstName;
//   #lastName;
//   #years;
//   #eyeColor;
//   constructor(firstName, lastName, age, eyeColor) {
//     this.#firstName = firstName;
//     this.#lastName = lastName;
//     this.#years = age;
//     this.#eyeColor = eyeColor;
//   }
//   get name() {
//     return this.#firstName + " " + this.#lastName;
//   }
//   set age(new_age) {
//     this.#years = new_age;
//   }
//   get age() {
//     return this.#years;
//   }
// }
// const myFather = new Person("John", "Doe", 50, "blue");
// console.log(myFather.firstName); // undefined
// console.log(myFather.lastName); // undefined
// console.log(myFather.name); // John Doe
// myFather.age = 51;
// console.log(myFather.age);

class Person {
    static species = "Human";
    #firstName;
    #lastName;
    #years;
    #eyeColor;
    constructor(firstName, lastName, age, eyeColor) {
      this.#firstName = firstName;
      this.#lastName = lastName;
      this.#years = age;
      this.#eyeColor = eyeColor;
    }
    get name() {
      return this.#firstName + " " + this.#lastName;
    }
    set age(new_age) {
      this.#years = new_age;
    }
    get age() {
      return this.#years;
    }
    static greet() {
      if (Math.random() <= 0.5) console.log("Hello!");
      else console.log("Hi!");
    }
  }
  
  class Learner extends Person {
    #grades = [];
    set grade(new_grade) {
      this.#grades.push(new_grade);
    }
    get average() {
      let total = 0;
      for (let i = 0; i < this.#grades.length; i++) {
        total += this.#grades[i];
      }
      return Math.round(total / this.#grades.length);
    }
  }
  
  // const myFather = new Learner("John", "Doe", 50, "blue");
  // []
  myFather.grade = 99;
  // [99]
  // myFather.grade = 90;
  // [99,90]
  // myFather.grade = 93;
  // [99,90,93]
  // myFather.grade = 83;
  // [99,90,93,83]
  
  // [99,90,93,83] / 4
  // console.log(myFather.average);
  
  let arr1 = [99, 100];
  
  arr1.push(90);
  arr1.push(80);
  
  console.log(arr1);