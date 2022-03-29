fun main(){
    var car=Car("BMW","Mercedes-Benz.","Silver",500)
    car.carry(200)
    car.indentity("White","Subaru","Legacy")
    car.calculateParkingFees(5)
    var bus= Bus("KTM","toyota","white",400)
    bus.maxTripFare(250.00)
    bus.calculateParkingFees(10)


}

open class Car(var make:String,var model:String,var color:String,var capacity:Int) {
    fun carry(people: Int) {
        var m = people - capacity
        if (people <= capacity) {

            println("Carrying $people passengers")
        } else {
            print("overcapacity by $m people")
        }

    }

    fun indentity(color:String,make:String,model:String){
       println( "I am a $color $make $model")

}
    open fun calculateParkingFees(hours: Int):Int{
        var z=20*hours
        println(z)
        return (z)

    }

    }
class Bus( make:String,model:String,color:String, capacity:Int):Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var x=300*fare
        println(x)
        return(x)
    }

    override fun calculateParkingFees(hours: Int): Int {
        var y=capacity*hours
        println(y)
        return(y)
    }



}
