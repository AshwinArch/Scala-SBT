package Collections.Mpas

/**
  * Created by Aman on 11/6/2017.
  */
object PrintsKeyValues {
  def main(args: Array[String]) {
    val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F")

    colors.keys.foreach{ i =>
      print( "Key = " + i )
      println(" Value = " + colors(i) )}
  }
}
