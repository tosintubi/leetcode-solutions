class TwoSum {

    fun twoSumsSolution(nums: IntArray, target: Int): IntArray {
        val maps = hashMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (maps.containsKey(target - nums[i])) {
                return intArrayOf(maps[complement]!!, i)
            }
            maps[nums[i]] = i
        }
        return  maps.keys.toIntArray()
    }
}


//    fun twoSum(nums: IntArray, target: Int): IntArray {
//        val map = mutableMapOf<Int, Int>()
//        for (i in nums.indices) {
//            val complement = target - nums[i]
//            if (map.containsKey(complement)) {
//                return intArrayOf(map[complement]!!, i)
//            }
//            map[nums[i]] = i
//        }
//        throw IllegalArgumentException("No two sum solution")
//    }
