# longest_palindrome_api
Spring Boot micro-service for storing and retrieving LongestPalindrome in database(H2)

Does the following:
1. Receives string input over an API
2. Stores the longest palindrome in provided database
3. Retrieves the stored palindrome over an API

How to use:
1. Download the project
2. Run pom.xml (mvn clean package)
3. Run ResfulWebServicesApplication.java
3. Port for app is set to http://localhost:8080/

4. Create palindrome:
http://localhost:8080/string-palindrome/createpal/{insert_string}

5. Get palindrome:
http://localhost:8080/string-palindrome/getpal/{insert_string}

5. H2 URL:
http://localhost:8080/h2
