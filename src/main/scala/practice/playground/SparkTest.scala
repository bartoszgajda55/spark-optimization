package practice.playground

import org.apache.spark.sql.SparkSession

object SparkTest {
  def main(args: Array[String]): Unit = {

  val spark = SparkSession.builder()
    .appName("spark-test")
    .master("spark://localhost:7077")
    .getOrCreate()

    import spark.implicits._

    val df = Seq(1, 2, 3).toDF()

    df.show()
  }
}
