// User function Template for Java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        // code here
        int sum=0;
        while(number>0){
            sum+=(number*number);
            number--;
        }
        return sum;
    }
}