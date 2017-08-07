# Spring-Boot-App

## Description
This Project shows the list of residential society amenities which are stored in the MySql Database. Using the following endpoints, different operations can be achieved:
- `/data/amenities/all` - This returns the list of amenities in the Amenities table which is created in MySql database (tbl_sms_amenities).
- `/rest/amenities/{name}` - This returns the details of the Amenity passed in URL
- `/rest/id/{id}` - This returns the details of the Amenity for the Amenity Id passed in URL
- `/rest/update/{id}/{name}` - This updates the name of the amenity for the amenityId passed in the URL

## Libraries used
- Spring Boot
- Spring MVC (Spring Web)
- Spring Data JPA with Hibernate
- MySql

## Tools used
- Git 2.10.0
- STS 3.7.2.RELEASE
- MySql running locally

## Compilation Command
- `mvn clean install` - Plain maven clean and install
