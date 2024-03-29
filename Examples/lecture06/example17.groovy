// Closures as parameters to closures

  // Find initial part of list that conforms to predicate
def takeWhile = { predicate, list ->
    def result = []
    for (element in list) {
        if (predicate(element)) {
            result << element
        } else {
            return result
        }
    }
    return result
}
  // Two predicate closure
def isEven = {x -> return (x % 2 == 0) }
def isOdd = {x -> return ! isEven(x) }

def table1 = [12, 14, 15, 18]
def table2 = [11, 13, 15, 16, 18]
  
  // Apply takeWhile
def evens = takeWhile.call(isEven, table1)
println "evens: ${evens}"

def odds = takeWhile.call(isOdd, table2)
println "odds: ${odds}"