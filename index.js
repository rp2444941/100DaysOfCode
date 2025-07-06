/*
closure
*/ 

//   a function along with lexical scope bundle together
//     a closure is a function that has access to the parent scope, even after the parent function has closed//
//     inner function  can rember and access variables from their outer function even after the outer function has finished executing;

//     //where closures are used
//     1. data hiding
//     2. partial application
//     3. currying
//     4. memoization  
//     5. maintaining state
//     6. event handlers
//     7. setTimeout
//     8. setInterval
//     9. callbacks
//     10. functional programming
//     11. module pattern
//     12. private variables
//     13. maintaining state in async code
  

    //example code 

 function outerFunction(){
    let count=0;
        function innerFunction(){
        count++;
        console.log("count is:" + count);
          }
        return innerFunction;
   }