package addTwoNumbers

trait NodeItem {
  def data: Int
}

class Node(data: Int) {
  var data: Int = data
  var next: NodeItem = null
}

class List {
  var head = null

  def insert(data: Int) = {
    val node = new Node(data)
    node.next = head
    head = node
  }
}

class AddTwoNumbers {
  type Linked = Map[Int, Node]
  // create ListNode
  // create LinkedList
  // first is f(x) where x == head
  // first is f(next(x)) where x == head next
  // until next == null
  def init() = {
    val list = new List();

    list.insert(0)
    list.insert(3)

    print(list.head)
  }
}
