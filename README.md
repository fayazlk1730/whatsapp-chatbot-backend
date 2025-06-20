
# WhatsApp Chatbot Backend (Spring Boot)

## Features
- Receive and respond to WhatsApp-style messages
- Store messages (mock Firebase)
- Retrieve all messages
- Ready for Firebase and Render deployment

## API Endpoints

- POST `/webhook`
```json
{
  "sender": "user123",
  "content": "Hello"
}
```

- GET `/messages`

## How to Run

```bash
mvn clean install
mvn spring-boot:run
```

App runs at: `http://localhost:8080`

## Deploy to Render
1. Create new Web Service on [Render](https://render.com/)
2. Connect GitHub repo or upload code
3. Set build command: `./mvnw clean install`
4. Set start command: `java -jar target/*.jar`

---

🛠️ Built for internship assignment.
