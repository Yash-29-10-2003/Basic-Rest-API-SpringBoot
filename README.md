# Creating a Basic REST API in Spring Boot

- Build a Project in spring initializr.
  <img width="975" height="483" alt="image" src="https://github.com/user-attachments/assets/3d1f5d0c-938e-4179-aa76-10e64a436446" />


- In the main file, adding the `@SpringBootApplication` annotation and calling the run method.
  <img width="975" height="436" alt="image" src="https://github.com/user-attachments/assets/010ab92b-6e0f-4199-a757-baca534e5957" />


- Create a Controller package and create a basic Health Check Controller with a get mapping.
<img width="975" height="277" alt="image" src="https://github.com/user-attachments/assets/67ee2fdc-2e61-47cb-b59c-bdfdaef52bdc" />


- Now if we hit `localhost:8080/health-check` we can see our html page.
<img width="1002" height="238" alt="image" src="https://github.com/user-attachments/assets/25afdf88-29e3-4872-b066-b4f488d682d3" />


- If hitting on postman, choose raw in Body and choose json.

- Create a new package Entity that has a pojo class that defines an entry entity with getters and setters.
  <img width="986" height="636" alt="image" src="https://github.com/user-attachments/assets/3cb0d6ad-6ccf-4473-b969-03065acd5d4b" />


- Now create a new Controller ApiEntryController that has all the endpoint request mappings.
<img width="1038" height="638" alt="image" src="https://github.com/user-attachments/assets/9285dab6-ef30-4c89-bbf4-52458d6edb91" />

---

- For the example currently we just use a Map that stores the entries and their ids instead of an actual persistent database.

- We use `@RequestBody` to get the json input from Post and Put calls. Its like saying:
  > “Hey spring, please take the data from the request and turn it into a java object that I can use in my code.”

- We use `@PathVariable` to get specific information from the link to delete/put/get for specific ids.

- Methods inside a controller class should be public so that they can be accessed and invoked by the spring framework or external http requests.

- Selecting raw and json in the body of a post request in postman indicates that the request body will contain data in json format, allowing the server to parse and process the incoming data accurately. This ensures that the data is transmitted and received in a structured manner, following the JSON format conventions.

---

- Now, posting some data via postman after running the application like:
  <img width="966" height="370" alt="image" src="https://github.com/user-attachments/assets/04bcfeed-c0ac-4bb9-bf14-119b85325ccb" />


- Now doing the general GET call on `/api` gives:
  <img width="622" height="577" alt="image" src="https://github.com/user-attachments/assets/4ad47bef-50fa-49c9-84ac-c7c67e126f25" />


- Now doing put calls / delete calls / targeted get calls on a specific id.
  <img width="667" height="350" alt="image" src="https://github.com/user-attachments/assets/09f4c23c-724c-43e0-96f6-f699058a1b36" />

