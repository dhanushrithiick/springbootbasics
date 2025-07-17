import React from 'react';
import { Link } from 'react-router-dom';
import './nav.css';

const Navbar = () => {
  return (
    <nav className="navbar">
      <ul className="nav-links">
        <li><Link to="/">Login</Link></li>
        <li><Link to="/signup">Sign up</Link></li>
        <li><Link to="/getemp">Get employees</Link></li>
      </ul>
    </nav>
  );
};

export default Navbar;
