fun main(args: Array<String>) {
}

//აწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს მთელ რიცხვს და
// დააბრუნებს ამ რიცხვის შებრუნებულს. მაგალითად შემოვიდა 10220 უნდა დაბრუნდეს 2201

fun inverseNumber(num: Int): Int {
    var remainder = num
    var result = 0
    while (remainder > 0) {
        val digit = remainder % 10
        result = result * 10 + digit
        remainder /= 10
    }
    return result
}


//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს უსგ.
fun gcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val r = x % y
        x = y
        y = r
    }
    return x
}


//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს ორ მთელ რიცხვს და დააბრუნებს მათ უსჯ.
fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
}

val a = 24
val b = 36
val result = lcm(a, b)

//დაწერეთ ფუნქცია რომელიც პარამეტრად მიიღებს String მონაცემს და დააბრუნებს პასუხს შეიცავს თუ არა ეს მონაცემი
// შემგედ სიმბოლოს ‘$’’

fun containsDollarSign(str: String): Boolean {
    return str.contains("$")
}

//აწერეთ რეკურსიული ფუნქცია რომელიც დაითვლის 100-მდე ყველა ლუწი
//რიცხვების ჯამს

fun countEvenNumbers(n: Int = 0, sum: Int = 0): Int {
    if (n > 100) {
        return sum
    }
    if (n % 2 == 0) {
        return countEvenNumbers(n + 1, sum + n)
    }
    return countEvenNumbers(n + 1, sum)
}















