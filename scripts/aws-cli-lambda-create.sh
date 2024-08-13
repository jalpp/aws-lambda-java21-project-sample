aws lambda create-function --function-name myFunction \
--runtime java21 --handler Handler.App::handleRequest \
--role <Role ARN> # replace Role ARN here \
--zip-file fileb://myFunction.zip ## Replace Jar name here