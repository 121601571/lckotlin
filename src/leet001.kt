class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0 until nums.size){
            for (j in i until nums.size){
                if (nums[i] + nums[j] == target){
                    return intArrayOf(i,j)
                }
            }
        }
        return IntArray(0)
    }
}

fun main() {

    var a = Solution()
    val res = a.twoSum(intArrayOf(3,2,4), 6)
    println(res[0])
}