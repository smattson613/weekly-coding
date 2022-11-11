
function howManyBoomerangs(arr) {
    let total = 0;

    for (i = 1; i < arr.length - 1; i++) {
        if (arr[i-1] === arr[i+1] && arr[i] !== arr[i-1]) {
            total = total + 1;
        }
    }
    return total;
}

console.log(howManyBoomerangs([3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2]));
console.log(howManyBoomerangs([1, 7, 1, 7, 1, 7, 1]));
console.log(howManyBoomerangs([9, 5, 9, 5, 1, 1, 1]));
console.log(howManyBoomerangs([5, 6, 6, 7, 6, 3, 9]));
console.log(howManyBoomerangs([4, 4, 4, 9, 9, 9, 9]));