// App.js
import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';

// Import components and pages
import Navbar from './nav.jsx';
import Login from './Login.jsx';
import Signup from './Signup.jsx';
import Getemployees from './GetEmployees.jsx';

function App() {
  return (
    <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/signup" element={<Signup />} />
         <Route path="/getemp" element={<Getemployees/>} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
