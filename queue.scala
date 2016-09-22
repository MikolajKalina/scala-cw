class SlowAppendQueue[T](elems:List[T]) {
def head = elems.head
def tail = new SlowAppendQueue(elems.tail)
def enqueue(x:T) = new SlowAppendQueue(elems:::List(x))
}

class SlowHeadQueue[T](smele:List[T]){
 def head = smele.last
 def tail = new SlowHeadQueue(smele.init)
 def enqueue(x:T) = new SlowHeadQueue(x::smele)
}

class Queue[T](
private val leading: List[T],
private val trailing: List[T]
) {
private def mirror =
if (leading.isEmpty)
new Queue(trailing.reverse, Nil)
else
this
def head = mirror.leading.head
def tail = {
val q = mirror
new Queue(q.leading.tail, q.trailing)
}
def enqueue(x: T) =
new Queue(leading, x :: trailing)

}

object Queue{
 def apply[T](xs:T*) = new Queue[T](xs.toList, Nil)
}

//-------------------

trait Queue[T] {
def head: T
def tail: Queue[T]
def enqueue(x: T): Queue[T]
}
object Queue {
def apply[T](xs: T*): Queue[T] =
new QueueImpl[T](xs.toList, Nil)
private class QueueImpl[T](
private val leading: List[T],
private val trailing: List[T]
) extends Queue[T] {
def mirror =
if (leading.isEmpty)
new QueueImpl(trailing.reverse, Nil)
else
this
def head: T = mirror.leading.head
def tail: QueueImpl[T] = {
val q = mirror
new QueueImpl(q.leading.tail, q.trailing)
}
def enqueue(x: T) =
new QueueImpl(leading, x :: trailing)
}
}



class Person(val firstName: String, val lastName: String) extends Ordered[Person] {
def compare(that: Person) = {
val lastNameComparison =
lastName.compareToIgnoreCase(that.lastName)
if (lastNameComparison != 0)
lastNameComparison
else
firstName.compareToIgnoreCase(that.firstName)
}
override def toString = firstName +" "+ lastName
}

def orderedMergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {
def merge(xs: List[T], ys: List[T]): List[T] =
(xs, ys) match {
case (Nil, _) => ys
case (_, Nil) => xs
case (x :: xs1, y :: ys1) =>
if (x < y) x :: merge(xs1, ys)
else y :: merge(xs, ys1)
}
val n = xs.length / 2
if (n == 0) xs
else {
val (ys, zs) = xs splitAt n
merge(orderedMergeSort(ys), orderedMergeSort(zs))
}
}



