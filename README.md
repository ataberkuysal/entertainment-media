# entertainment-media
A Web App For Any Type Of Entertainment Media
- Create a Series aswell as its Seasons and Episodes and use different Endpoints to Fetch or Update them.

# Technologies Used

- JDK 19
- Spring Boot 3
- Maven
- PostgreSQL
- JPA/Hibernate
- JUnit5
- Spring Security(JWT)
- MapStruct/ ModelMapper
- AOP(Exception Handling and Method Logging)

## How to Start
### Prerequisities
```
- JDK 19
- Maven
- PostgreSQL
- Postman (Optional)
```

### Clone the Repository and Run it on Local
```
git clone https://github.com/ataberkuysal/entertainment-media.git
```
```
mvn spring-boot: run
```



#  Use the Postman Collection below to start making requests
### Postman Collection for Requests
**! Recent Update of Postman requires an account if you want to fork or make changes to the requests from the Collection itself !**
#### Link to the Collection
https://www.postman.com/avionics-architect-34360217/workspace/workspace1/collection/25215258-f4988a25-7bd1-46b8-a696-ae8b3334ad11?action=share&creator=25215258
#### Alternatively, Fork The Collection via Button Below
[![Run in Postman](https://run.pstmn.io/button.svg)](https://god.gw.postman.com/run-collection/25215258-f4988a25-7bd1-46b8-a696-ae8b3334ad11?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D25215258-f4988a25-7bd1-46b8-a696-ae8b3334ad11%26entityType%3Dcollection%26workspaceId%3D4c425988-dcdb-4051-84b7-3f5723210fd9)



#### Swagger to see the available endpoints. (Use the Postman collection for requests):

http://localhost:8080/swagger-ui/index.html#/season-entity-controller/postCollectionResource-season-post

# Example on how to use Entertainment Media ↓
## Lets Create "GameOfThrones" as well as its "Season 1" and Episode 1 and 2.
### Follow the steps below ↓
![1](https://github.com/ataberkuysal/entertainment-media/assets/54504620/91eb0357-b0b3-4bdb-b92b-1a2235bc16c9)

## First, Make sure the Authentication is set correctly by following the description and using the first two requests "1" and "2"
![Adsız tasarım](https://github.com/ataberkuysal/entertainment-media/assets/54504620/2407c62f-f57f-4461-8aac-964d0e239d04)


### 1 -> Register the User
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/d114fcdc-9f52-41c6-8bec-f6bc16b973e7)

### 2 -> Authenticate the said User and copy the Token in the response and paste it to EnvMedia Collection Parent Authorization Tab
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/efc8fce7-d7d1-41a6-b45c-2427ee23e442)
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/0960aaea-961d-4bf2-a2c7-5713736097a9)







