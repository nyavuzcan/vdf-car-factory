# VDF CAR FACTORY
Adding and editing products with authentication
- It has factory pattern.
- It has produce car according to types.


## Requirements
Firstly, Postgresql database is used in the project. So a new database should be created according to the following information:

- Jdk 1.8

- Apache Maven 4.0.0


## Setup And Run

- To run stock control application at your local environment, please run the commands below;

```docker-compose up```

- After the containers started successfully, you can use app.

## Endpoints:

 **Swagger:** http://localhost:8090/swagger-ui.html#

 **SpringBoot Api:** http://localhost:8090
 
 **Example Request:**
http://localhost:8090/car/produce
```json
POST 
Accept: application/json
Content-Type: application/json
Content-Length: xy

{
    "carType": "cabrio"
}
```
**Example Successful Response:**
```json
HTTP/1.1 200 OK
Server: My RESTful API
Content-Type: application/json
Content-Length: xy

Cabrio Car has produced
```

## Used technologies
**Docker:**  App can be run easily

**SpringBoot&Unit Test:** For api and unit testing.

**Swagger:** All endpoints are easily schematized.


