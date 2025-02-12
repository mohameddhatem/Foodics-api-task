# RESTful API Testing Project

This project focuses on testing a RESTful API using **Rest Assured** and **Java**. The API endpoints tested are designed to handle certain operations, but currently, two endpoints are not functioning as expected. The goal of this project is to test the available endpoints, identify issues, and document any discrepancies.

## Project Overview

This repository contains automated tests for a RESTful API. It includes test cases for various endpoints, but there are known issues with two endpoints that are not returning the expected results. These issues are being tracked for further investigation.

## API Endpoints

The following endpoints are tested in this project:

1. **GET /whoami **  
   - Returns a list of products.
   
2. **POST /login **  
   - Creates a new order with the specified product and quantity.
   

However, two endpoints are currently not functioning as expected:
- **GET /whoami: The endpoint is retrieving an Html document at any condition.
- **POST /login: The endpoint is retrieving an Html document at any condition.

## Technologies Used

- **Rest Assured**: For API testing and validation.
- **JUnit**: For running and managing tests.
- **Java**: As the programming language.

## Getting Started

### Prerequisites

- **JDK 11 or higher**
- **Maven** for project dependencies
- **Rest Assured** for API testing

### Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/api-testing-project.git
