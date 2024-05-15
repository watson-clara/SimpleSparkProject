import org.apache.spark.sql.SparkSession;

public class WordCount {
    public static void main(String[] args) {
        // Initialize SparkSession
        SparkSession spark = SparkSession.builder()
            .appName("Word Count")
            .master("local[*]")  // Use local mode for testing
            .getOrCreate();

        // Define input file path
        String inputFilePath = "\"C:\\Users\\clarafication\\eclipse-workspace\\New folder\\SimpleSparkProject\\.project\"";

        // Read input text file into RDD
        JavaRDD<String> lines = spark.read().textFile(inputFilePath).javaRDD();

        // Your Spark application logic goes here

        // Stop SparkSession
        spark.stop();
    }
}


