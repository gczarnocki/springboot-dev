# springboot-mysql

This is a sample 'Hello, World!' project integrating a few Java frameworks. Feel free to fork / clone / download this project as its main purpose is to provide sample code base for creating a Spring Boot + Thymeleaf + MySQL database integration added out-of-the-box.

Features:

- Gradle:
  - with Gradle Wrapper files included,
- Spring Boot:
  - configuration is located in `application.yml` file,
  - a few Spring Boot Starters are added to project as well:
    - `spring-boot-starter-web`
    - `spring-boot-starter-data-jpa`
    - `spring-boot-starter-thymeleaf`
    - `spring-boot-starter-test`
    - `spring-boot-devtools`
- MySQL integration via `mysql-connector-java` package
- `spring-boot-devtools` for faster code changes.

You can deploy this application to Tomcat using Eclipse. Build this application using `Gradle Wrapper`.

Make sure you have `MySQL Server` installed. Run `/oth/sql/init.sql` to recreate database structure.