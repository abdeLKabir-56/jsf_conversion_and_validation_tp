# JSF Client Management Application

This is a simple JavaServer Faces (JSF) web application for managing client information. The primary focus of this project is on implementing data conversion and validation in the JSF framework.

## Features

- **Client Information Form:**
  - Allows users to input client details including civility, name, date of birth, etc.
  - Utilizes JSF conversion to format the date of birth as specified.

- **Validation Rules:**
  - Mandatory fields: Civility, Name, Date of Birth.
  - Postal Code (CP) must have a minimum of 5 numbers.
  - Postal Code must be within the range of 10000 and 90000.
  - City field should not exceed 10 characters.
  - Bootstrap-based styling for error messages.

- **Client List Display:**
  - Displays a list of entered clients.
  - Utilizes Bootstrap for styling and date formatting.

## Technologies Used

- JavaServer Faces (JSF)
- Java
- Bootstrap
- Maven (for project management)
