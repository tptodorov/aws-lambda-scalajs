# aws-lambda-scalajs

Proof of Concept for building ScalaJS based Lambda functions. Currently AWS Lambda supports only JavaScript.

See:
 * src/main/scala/demo/awslambda/Demo.scala - some demo function objects
 * src/main/resources/lambda-exports.js  - this exports ScalaJS function objects 
 
See build.sbt for configuration details.

This projects contains two demo functions:

 * DemoSuccess - prints input arguments to console.
 * DemoFail - throws an exception and lambda function fails properly with an error message.

## Upload all functions

This project uses [https://github.com/tptodorov/sbt-cloudformation] to setup deployment environment.

    sbt staging:uploadFunctions
  
uploads functions with suffix -staging.


 

 
