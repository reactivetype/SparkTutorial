Vancouver Spark Meetup - Hands-on Workshop


Prerequisites: 

- You should have Java SDK 6 or 7 installed 
- Download the spark pre-built package from http://bit.ly/spark-training-2 into your computer
- Unzip the downloaded file


Instructions
- copy all the folders inside 'SparkWorkshopExercise' in same folder containing spark installation (not into the spark folder)
- cd into scala-exercise-python or scala-exercise-scala


To Built Scala Application
- run ../sbt/sbt package (everytime you make changes into shoppers.scala)
- run ../spark/bin/spark-submit --class "ShoppersApp" --driver-memory 1g ./target/scala-2.10/shopppers-project_2.10-1.0.jar 


To Run Python Application
- run ../spark/bin/spark-submit --driver-memory 1g shoppers-solution.py