fun main(){
    //1
    fun printFullName(firstName : String, lastName : String){
    println(firstName +" "+lastName)
}
    printFullName("Бислан","Хуаде")

    //2
    printFullName(firstName = "Бислан", lastName = "Хуаде")

    //3
    fun calculateFullName (firstName : String, lastName : String) : String{
        return firstName + " " + lastName
    }

    //4
    fun calculateFullNameWithLength (firstName: String, lastName : String) : Pair <String, Int>{
        val fullName = firstName + " " + lastName
        return  Pair (fullName, fullName.length)
    }

    //5
    fun findingPrimeNumber (number: Int){
        for (number in 2..20 step 1){
           if (number%1 ==0 && number%number == 0) println("$number - число простое")
           else println("$number - число не простое")
        }
    }

    //6
    fun fibonacci(number: Int): Int {
        if (number <= 0) {
            return 0
        }
        if (number == 1 || number == 2) {
            return 1
        }
        return fibonacci(number - 1) + fibonacci(number - 2)
    }
    println(fibonacci(1))
    println(fibonacci(2))
    println(fibonacci(3))
    println(fibonacci(4))
    println(fibonacci(5))
    println(fibonacci(6))
    println(fibonacci(7))
    println(fibonacci(10))
}