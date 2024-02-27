import java.sql.{Connection, DriverManager, ResultSet}

object SimpleDatabaseConnector extends App {
  // Connection details
  val url = "jdbc:postgresql://ec2-3-9-191-104.eu-west-2.compute.amazonaws.com:5432/testdb"
  val username = "consultants"
  val password = "WelcomeItc@2022"

  // Establish connection
  val connection: Connection = DriverManager.getConnection(url, username, password)

  try {
    // Create and execute a statement
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery(
      """
    SELECT status, COUNT(*) AS project_count
    FROM public.project_info_seb
    GROUP BY status
    ORDER BY project_count DESC;
      """
    )
    // Execute this query similarly to the fetchData method and process the results


    // Iterate over the result set and print each row
    while (resultSet.next()) {
      // Assuming you know the structure of your table, adjust the column indices or names accordingly
      for(i <- 1 to resultSet.getMetaData.getColumnCount) {
        print(resultSet.getString(i) + " ")
      }
      println() // Move to the next line after printing all columns of a row
    }
  } catch {
    case e: Exception => e.printStackTrace()
  } finally {
    // Close the connection
    if (connection != null) connection.close()
  }
}
