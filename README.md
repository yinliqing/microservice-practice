# microservice-practice
spring-cloud demo for training

git clone https://github.com/yinliqing/microservice-practice.git

File-->Import-->Maven-->Existing Maven Projects


Start microservice-server-eureka.
http://localhost:8761

Start microservice-provider1
http://localhost:7901/user/sayHello

Start microservice-provider2
http://localhost:7902/user/sayHello

Start microservice-consumer
http://localhost:8001/hello

Start microservice-consumer-feign-hystrix
http://localhost:8003/hello

Start microservice-consumer-feign
http://localhost:8002/hello

Start microservice-zuul
http://localhost:9000/u/user/sayHello
http://localhost:9000/c/user/sayHello



