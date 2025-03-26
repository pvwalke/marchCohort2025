// Time Complexity : O(N) where N is the number of elements in the array
// Space Complexity : O(1) No extra space is ude
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Problem 3: Container With Most Water
//Note: This is problem 3 submission only.
class Solution {
    public int maxArea(int[] height) {
        //Two pointers can be used here to determine the area we need.
        //We can essentially use two pointers in two ways - say we can initialise left =0 and right = 1
        // and then continue the loop or we use the pointers as below.
        //Initialise two pointers
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        //Loop till we cross left over right indicating that all elements were considered once.
        while(left < right){
            //so basically this is the calculation for area of rectangle i.e length * breadth
            int calArea = Math.min(height[left], height[right]) * (right - left);
            // we want to select the max area whenever we find that.
            area = Math.max(area, calArea);

            //here if the right pointer is of greater height we move the left pointer or else we decrement right
            // In case both the elements are equal we can move either of them
            // I chose to move left for no particular reason
            if(height[left] <= height[right] ){
                left++;
            }else{
                right--;
            }
        }
        //finally we return the Max area
        return area;
    }
}