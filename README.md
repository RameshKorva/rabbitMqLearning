# rabbitMqLearning

Run rabbitMq locally using docker image --> below one is the command

docker run -d --hostmame my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

Access rabbitMq http://localhost:15672 or 5672 port

Next run Producer and consumer rabbitMq micro-services and test the behvaiour 