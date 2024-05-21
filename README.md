# CMDB-OPEN-API-COLLECTION

This repository contains the OpenAPI specification for the CMDB Service API. The API provides CRUD operations for managing email records.

## Table of Contents

- [Introduction](#introduction)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Servers](#servers)
  - [Endpoints](#endpoints)
- [Components](#components)
  - [Schemas](#schemas)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The CMDB-OPEN-API-COLLECTION provides a detailed specification for interacting with the CMDB service, allowing users to perform CRUD operations on the email table. This document outlines the endpoints, request/response formats, and other details necessary for integrating with the service.

## Getting Started

### Prerequisites

Ensure you have the following installed:

- [Node.js](https://nodejs.org/)
- [npm](https://www.npmjs.com/)
- [Swagger CLI](https://github.com/swagger-api/swagger-cli) (optional, for local bundling and validation)

### Installation

Clone the repository:

```bash
git clone https://github.com/your-username/CMDB-OPEN-API-COLLECTION.git
cd CMDB-OPEN-API-COLLECTION
Usage
Servers
The API can be accessed via the following servers:

http://localhost:6057/api
http://34.199.12.114:6057/api
https://api.synectiks.net/cmdb
You can configure the server URL using the following variables:

protocol: http or https (default: http)
ip: localhost, 34.199.12.114, or api.synectiks.net (default: localhost)
port: 6057 or 5057 (default: 6057)
base-api: api (default: api)
Endpoints
Fetch List of Emails
GET /email
Description: Fetch the list of email records.
Responses:
200 OK: Successfully retrieved the list of emails.
404 Not Found: Service not found.
500 Internal Server Error: An error occurred on the server.
Add Email Details
POST /email
Description: Add a new email record.
Request Body:
Required: Yes
Content: application/json
Schema: email
Responses:
200 OK: Successfully added the email.
201 Created: Email record created.
404 Not Found: Service not found.
500 Internal Server Error: An error occurred on the server.
Components
Schemas
email
yaml
type: object
properties:
  id:
    type: integer
    format: int64
  frommsg:
    type: string
  tomsg:
    type: string
id (integer): The unique identifier for the email record.
frommsg (string): The sender's message.
tomsg (string): The recipient's message.
Contributing
Contributions are welcome! Please submit a pull request or open an issue to discuss any changes or improvements.

License
This project is licensed under the MIT License. See the LICENSE file for more details.
### Notes:
1. Replace `your-username` in the clone URL with your GitHub username.
2. Ensure the endpoints and components sections match the actual functionality of your API.
3. Add a LICENSE file if you choose a specific license for your project.
