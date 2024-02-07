http://localhost:5010/swagger-ui/index.html

uso de docker:

./mvnw clean package

docker build -t my-app:v1 .
docker run -d --name my-app-container -p 5050:5000 mysql:v1
docker run -d --name my-app-container -p port-output : port-api mysql:v1