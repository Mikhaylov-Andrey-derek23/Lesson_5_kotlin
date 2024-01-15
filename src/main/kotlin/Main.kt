fun main(args: Array<String>) {
//   classWork()
    homeWork();
}

fun classWork(){
    //Классы ООП, функции расширение типов данных.

    class Person () {

        //Это поля или свойства
        var gender:String = "";
        var name:String = "";
        var age:Int = 0;
        var job:String = "";

        //Это методы
        fun introduceMyself(){

            println("Hey my name is $name.\nI'am  years old: $age.\nMy job is $job");
        };

        fun tellAboutMyGender(){
            println("I'm a $gender");
        };

        fun goToWork(){
            println("I'm going to work");
        };
    }

    val sam = Person();
    sam.name ="Sam";
    sam.age = 18;
    sam.job = "students";
    sam.gender = "man";
    sam.introduceMyself();
    println("-----------------------");
    sam.tellAboutMyGender();
    println("-----------------------");
    sam.goToWork();
    println("-----------------------");

    sam.age = 19;
    sam.introduceMyself();
    println("-----------------------");

    val bob = Person();
    bob.name = "Bob";
    bob.age = 20;
    bob.job = sam.job
    bob.gender = "man";
    bob.introduceMyself();
    println("-----------------------");
    bob.tellAboutMyGender();
    println("-----------------------");

    val marina = Person();
    marina.name = "Marina";
    marina.gender = "women";
    marina.age = 19;
    marina.job = "waiter";
    marina.introduceMyself();
    println("-----------------------");
    marina.tellAboutMyGender();
    println("-----------------------");
    marina.goToWork();
    println("-----------------------");

    class Person2 (
        var name:String,
        var age:Int,
        var gender: String,
        var job: String

    ) {

        //Это методы
        fun introduceMyself(){

            println("Hey my name is $name.\nI'am  years old: $age.\nMy job is $job");
        };

        fun tellAboutMyGender(){
            println("I'm a $gender");
        };

        fun goToWork(){
            println("I'm going to work");
        };
    }

    val nazir = Person2("Nazir", 32, "men", "teacher android developer");
    nazir.introduceMyself();
    println("-----------------------");
    nazir.tellAboutMyGender();
    println("-----------------------");
    nazir.goToWork();
    println("-----------------------");

    //функции расширение типов данных.

    fun Person.getSalary(salary: Int){
        println("$name got my salary: $salary");
    }

    marina.getSalary(25000);
    bob.getSalary(2500);
    sam.getSalary(250);

}

fun homeWork(){

    class Car (_stamp:String, _color:String, _vin:Int){
        private val stamp = _stamp;
        private val color = _color;
        val vin = _vin

        fun getStamp(){
            println("Stamp car $stamp");
        }
        fun getColor(){
            println("Color car $color")
        }
    };

    val mustang = Car(
        _stamp = "Mustang",
        _color = "Red",
        _vin =  4154411
    )

    mustang.getStamp();
    mustang.getColor();

    fun Car.plusNumber(number:Int):Int{
        return this.vin + number
    }
    var flag = true;
    while(flag){
        print("Enter correction number for edit vin: ")
        val correction = readln();
        try {
            println("New vin: ${mustang.plusNumber(correction.toInt())}")
            flag = false;
        }catch (ex:NumberFormatException){
            println("Correction is not number");
        }
    }
}