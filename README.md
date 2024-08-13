## AWS Java lambda project sample

creating a git cloneable Java 21 AWS lambda
project so devs (myself) can start coding, than worry about
researching/finding docs about how to do set up properly (which I struggled with in the start). 

The project contains Aws lambda dependencies and other JSON/Testing dependencies that are quite helpful, 
below contain steps to run the project on lambda for (me) and others so its easy to do it everytime

Note: Not a official documentation, just a documentation/repo for myself so I don't have to do research and work again

## Offical AWS docs to explore:

- [AWS Java docs](https://docs.aws.amazon.com/lambda/latest/dg/java-samples.html)
- [AWS Java 17 Record Example](https://github.com/awsdocs/aws-lambda-developer-guide/tree/main/sample-apps/java17-examples)
- [AWS SDK Java Sample Usecases](https://github.com/awsdocs/aws-doc-sdk-examples/tree/main/javav2/usecases)
- [AWS Java Lambda Context Object Doc](https://docs.aws.amazon.com/lambda/latest/dg/java-context.html)
- [AWS Java Lambda Libs Github/Docs](https://github.com/aws/aws-lambda-java-libs?tab=readme-ov-file)
- [AWS Java Lambda general Docs](https://docs.aws.amazon.com/lambda/latest/dg/java-package.html)
## Setup:

- ``git clone https://github.com/jalpp/aws-lambda-java21-project-sample.git ``
- ``cd aws-lambda-java21-project-sample``

- add custom logic under ``src/main/java/Handler``
- add required dependencies for the custom login ``/aws-lambda-java21-project-sample/pom.xml``

## Project Structure

- ``/Handler`` contains ``App.java`` that implements AWS lambda's ``RequestHandler<InputObject,OutputObject>`` interface, that makes the class implement ``handleRequest(InputObject, AWS Lmabda Context object)``
- You can add other folders/classes under ``/Handler``, the ``App.java`` and ``handleRequest()``act like ``Main.java and main()`` in a normal Java project
- The Context object represents AWS Lambda function information see more here [AWS Lambda Context Object Docs](https://docs.aws.amazon.com/lambda/latest/dg/java-context.html)
- When you set up your lambda make sure to **Runting setting** Handler field too the following 
``Handler.App::handleRequest``

## Build:

- run ``` mvn clean ```
- run ``` mvn package``` which will build a snapshot Jar under ``/aws-lambda-java21-project-sample/target/{name}-{version}-SNAPSHOT.jar`` that can be uploaded AWS lambda function page

## Deploy: 

- Deploy from console UI by uploading the Jar file
- Deploy from aws CLI lambda script which is present in ``/scripts`` see more here [AWS Java Doc Deployment Section](https://docs.aws.amazon.com/lambda/latest/dg/java-package.html)
- Deploy from aws CloudFormation template by creating a stack and deploying the stack again see the documentation for that