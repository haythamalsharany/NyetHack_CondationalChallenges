import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration

fun main() {
    val healthPoint = 100
    val playerName: String = "Madrigal"
    val isBlessed = true

    var auraColore= "none"
    val auraVisible:Boolean
    val karama:Int;

    if(healthPoint == 100){
        println(playerName+" is an excelant  condition!")
    }else if(healthPoint in 90..99)
        println(playerName+" has a few scraches  ")
    else if(healthPoint in 75..89) {
        if(isBlessed)
            println(playerName + " has some minor wounds but is healing quite ! ")
        else
            println(playerName + " has some minor wounds  ")
    }
    else if(healthPoint in 15..74)
        println(playerName+" looks prety hurt  ")
    else if(healthPoint in 0..14)
        println(playerName+" is in awful condition! ")
    else
        println("some thing wrong  ")



karama = (Math.pow(Math.random(), (110 - healthPoint) / 100.0) * 20).toInt()
    auraVisible= isBlessed&&healthPoint>50
    when(karama){
        in 0..5 -> {
            auraColore = "red"
        }
        in 6..10-> {
            auraColore = "orange"
        }
        in 11..15-> {
            auraColore = "purple"
        }
        in 16..20-> {
            auraColore = "green"
        }

        else-> auraColore = "none"
    }
    if(auraVisible&&auraColore!="none"&& isBlessed) {
        println(" the new player\' status is :  $auraColore ")
    }







    }