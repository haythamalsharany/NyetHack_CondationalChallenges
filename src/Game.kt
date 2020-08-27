import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration

fun main() {
    var healthPoint: Int = 100
    val playerName: String = "Madrigal"
    var isBlessed: Boolean = true
    var playerStatus: String = "";
    var auraColore= "none"
    var auraVisible:Boolean
    val karama:Int;

karama = (Math.pow(Math.random(), (110 - healthPoint) / 100.0) * 20).toInt()
    auraVisible= isBlessed&&healthPoint>50;
    auraColore = when(karama){
        in 0..5 -> "red"
        in 6..10->"orange"
        in 11..15->"purple"
        in 16..20->"green"

        else->"none"
    }
    if(auraVisible&&auraColore!="none"&& isBlessed)
    {
        playerStatus=auraColore;
    }







    }