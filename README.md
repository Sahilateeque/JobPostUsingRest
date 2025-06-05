💼 Job Postings Application

A backend job postings management system built using Java, Spring Boot, and PostgreSQL. This RESTful API allows users to manage job listings with features such as creating, updating, searching, and deleting job posts.


---

🚀 Tech Stack

Backend: Java, Spring Boot

API: RESTful Web Services

Database: PostgreSQL

ORM: Spring Data JPA

API Testing Tool: Postman



---

📚 Features

Feature	Description

findAllPost()	Fetches all job postings from the database.

getPost(id)	Retrieves a specific job post by its ID.

search(keyword)	Searches jobs by keywords in the job description and profile fields.

searchByReqExperience(experience)	Returns job posts that match the given required experience.
addJob()	Adds a new job posting to the system.
update()	Updates an existing job post.
delete(id)	Deletes a job post using its ID.



---


📂 Project Structure

src/
├── main/
│   ├── java/
│   │   └── com.example.JobPostUsingRest/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── resources/
│       └── application.properties


---



📌 To Do

[ ] Add Swagger documentation

[ ] Implement authentication/authorization

[ ] Add pagination and sorting

[ ] Dockerize the application



---

🙌 Contributing

Contributions are welcome! Please fork the repo and submit a pull request.

