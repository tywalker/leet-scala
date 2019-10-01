import scala.collection.mutable.Map
import addTwoNumbers.AddTwoNumbers

// two pass hash
// complexity O(n)
object Main extends App {
  val nums: List[Int] = List(4,5,7,3,2,9)
  val expectation = 10

  def twoSum(nums: List[Int], sum: Int) = {
    var numMap = Map.empty[Int, Int]
    var answer = Map.empty[Int, Int]
    for (num <- nums) {
      numMap(sum - num) = num
      if (numMap.contains(num) && (sum - num) != num) {
        answer(num) = numMap(num)
      }

    }
    answer
  }

  val answer = twoSum(nums, 10)

  val aTn = new AddTwoNumbers()
  aTn.init()
}
