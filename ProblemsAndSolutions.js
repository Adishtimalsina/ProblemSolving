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
//Time complexity = O(n)

// Problem 2: Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna's portion. You must determine if his calculation is correct.
// For example, assume the bill has the following prices: . Anna declines to eat item  which costs . If Brian calculates the bill correctly, Anna will pay . If he includes the cost of , he will calculate . In the second case, he should refund  to Anna.

// bill: an array of integers representing the cost of each item ordered
// k: an integer representing the zero-based index of the item Anna doesn't eat
// b: the amount of money that Anna contributed to the bill

// Output Format
// If Brian did not overcharge Anna, print Bon Appetit on a new line; otherwise, print the difference (i.e. charged - actual ) that Brian must refund to Anna. This will always be an integer.
// Sample Input 0
// 4 1
// 3 10 2 9
// 12
// Sample Output 0
// 5
// Explanation 0
// Anna didn't eat item k=1, bill[1]=10 , but she shared the rest of the items with Brian. The total cost of the shared items is 3+2+9=14 and, split in half, the cost per person is 7. Brian charged her b=12 for her portion of the bill. We print the amount Anna was overcharged, charged(b)-actual = 12-7=5, on a new line.

//Solution
function bonAppetit(bill, k, b) {
    let notEaten = bill[k];
    let total=0;
    for(let i=0; i<bill.length; i++){
        if(k === i){
            continue;
        }
        total = total+bill[i]
    }
    let actualCharge = total/2
    if(b===actualCharge){
        console.log( "Bon Appetite");
    }else {
        console.log(b-actualCharge);
    }
}

bonAppetit([3, 10, 2, 9],1,12)
//output 5
//time complexity = O(n)

//Problem 3: Given an array of bird sightings where every element represents a bird type id, determine the id of the most frequently sighted type. 
//If more than 1 type has been spotted that maximum amount, return the smallest of their ids.
//Example
//birdType = [1, 1, 2, 2, 3];
//There are two each of types 1 and 2, and one sighting of type 3. Pick the lower of the two types seen twice: type 1.
//example
//birdType = [1,2,2,2,4,4,4,5,3]
//it needs to return 2 cause it is the max repeated and minimum type of bird

birdType = [1, 2, 2, 2, 4, 4, 4, 5, 3];

const HashMap = new Map();

for (let i = 0; i < birdType.length; i++) {
  if (HashMap.has(birdType[i])) {
    HashMap.set(birdType[i], HashMap.get(birdType[i]) + 1);
  } else {
    HashMap.set(birdType[i], 1);
  }
}

let maxNumber = 0;
let minBirdType;

for (const [key, value] of HashMap) {
  if (value > maxNumber || (value === maxNumber && key < minBirdType)) {
    maxNumber = value;
    minBirdType = key;
  }
}

return minBirdType;

//Time complexity of the code O(n) 

