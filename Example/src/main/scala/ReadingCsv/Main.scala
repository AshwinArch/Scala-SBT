package ReadingCsv

import java.io.File

import com.github.tototoshi.csv._

object Main {
  def main(args: Array[String]): Unit = {
    val reader = CSVReader.open(new File("C:\\Users\\Aman\\Desktop\\paging\\java_input.csv.txt"))

    reader.foreach(fields => println(fields))
  }

}
