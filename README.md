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
## Lets Create "GameOfThrones" as well as its "Season 1" and its Pilot Episode.
### We will follow the requests 1 to 5 in order as marked below ↓

## First, Make sure the Authentication is set correctly by following the description and using the first two requests "1" and "2"
![1](https://github.com/ataberkuysal/entertainment-media/assets/54504620/91eb0357-b0b3-4bdb-b92b-1a2235bc16c9)

### 1 -> Register the User
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/d114fcdc-9f52-41c6-8bec-f6bc16b973e7)

### 2 -> Authenticate the said User and copy the Token in the response and paste it to EnvMedia Collection Parent Authorization Tab
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/efc8fce7-d7d1-41a6-b45c-2427ee23e442)
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/0960aaea-961d-4bf2-a2c7-5713736097a9)
![Adsız tasarım](https://github.com/ataberkuysal/entertainment-media/assets/54504620/2407c62f-f57f-4461-8aac-964d0e239d04)

## We can now start creating our entities.
### 3 -> Create a Serie using the request "POST Serie". This will respond with the created Serie. Copy its "serieId" value.
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/56fa02b7-e1e4-49f8-bbe3-34975c6c693f)


### 4 -> Create a Season for the Serie we just created by giving its serieId and use the Request "GET Series" to fetch the Series' we've created  thus far to see the results.
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/77c0b0a7-3b58-4efc-9218-c2fea079ddb4)

![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/ac96c374-53ce-4486-9131-59ba011f0a0f)

####  *We forgot to give it a name. Let's give it a name ("Season 1") and overall rating by using the "PATCH Update a Specific Season" Request*
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/9a60704d-6d17-44df-87f6-6e0a2f73e15d)
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/2454097c-8395-4ee9-9236-0cd6938084f4)


### 5 -> Repeat by using the seasonId to create Episode 1 and Episode 2 for Season 1 and We Are Done! ↓
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/88d71027-0e20-4775-ae17-dd25ac3de998)


## OneToMany / ManyToOne bidirectional relationship between Series and its child entities can be seen below ↓
![image](https://github.com/ataberkuysal/entertainment-media/assets/54504620/5dc060a3-0fd3-4f76-a47c-a898043cb77a)










