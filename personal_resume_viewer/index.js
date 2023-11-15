// Install necessary packages using npm install express body-parser

const express = require('express');
const bodyParser = require('body-parser');
const app = express();

// Use middleware to parse JSON
app.use(bodyParser.json());

// In-memory storage for simplicity. In production, use a database.
const users = [];

// Register a new user
app.post('/register', (req, res) => {
  const { name, email, password } = req.body;

  // Check if the email is already registered
  if (users.some(user => user.email === email)) {
    return res.status(400).json({ error: 'Email already registered' });
  }

  // Store the user in memory (in production, use a database)
  const newUser = { name, email, password };
  users.push(newUser);

  return res.status(201).json(newUser);
});

// Login
app.post('/login', (req, res) => {
  const { email, password } = req.body;

  // Check if the user exists
  const user = users.find(u => u.email === email);

  if (!user || user.password !== password) {
    return res.status(401).json({ error: 'Invalid email or password' });
  }

  return res.status(200).json({ message: 'Login successful' });
});

const PORT = 3000;
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});
