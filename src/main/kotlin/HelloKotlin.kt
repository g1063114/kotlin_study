class HelloKotlin {
}

fun welcome(msg : String) : Unit{
    print("$msg, welcome!");
}

fun main(args: Array<String>){
    var numbers = arrayOf(1,4,3,6,8,9);
    var sum = 0;
    var num = 0;

    for(n in numbers){
        sum+=n;
    }

    for(i in 1..10){
        num+=i;
    }
    print("$num");
}