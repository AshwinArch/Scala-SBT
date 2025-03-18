val abc = """my.song.mp3 11b
greatSong.flac 1000b
  not3.txt 5b
  video.mp4 200b
  game.exe 100b
  mov!e.mkv 10000b"""

  println(abc)

 def solution(s: String): String = {
  val music: List[String] = List("mp3", "aac", "flac")
  val image: List[String] = List("jpg", "bmp", "gif")
  val movie: List[String] = List("mp4", "avi", "mkv")
  val other: List[String] = List("7z", "txt", "zip")

  val a = s.split("\n")
    .toSeq
    .map(_.trim)
    .filter(_ != "")


  a.map(_.split(" "))
}

solution(abc)