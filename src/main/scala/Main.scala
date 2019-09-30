import scala.collection.mutable.Map

// two pass hash
// complexity O(n)
object Main extends App {
  val nums: List[Int] = List(4,5,7,3,2,9)
  val expectation = 10

  def makeMap(nums: List[Int], sum: Int) = {
    var numMap = Map.empty[Int, Int]
    var answer = Map.empty[Int, Int]
    for (num <- nums) {
      numMap(sum - num) = num
      numMap.retain((k,v) => numMap.contains(v) && k != v)
      if (answer.size != 0) answer
    }
    answer
  }

  def twoSum(numMap: Map[Int, Int]) = {
    numMap.retain((k,v) => numMap.contains(v) && k != v)
  }

  val map = makeMap(nums, 10)
  // val a = twoSum(map)
  println(map)
}
