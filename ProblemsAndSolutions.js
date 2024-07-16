//Problem 1: Find missing number in the Array, If the array is A=[1,2,5] n=5. The output needs to be 3,4
//solution

let array = [1, 6];
let n = 7;

function findMissing(array) {
  for (let i = 0; i < array.length; i++) {
    if (array[i] + 1 !== array[i + 1]) {
      array.splice(i + 1, 0, array[i] + 1);
      console.log(array[i] + 1);
      if (array.length !== n) {
        continue;
      }
      break;
    }
  }
}

let size = array.length;
if (size !== n) {
  findMissing(array);
}
//Output = 2 3 4 5 7
