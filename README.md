###### Software Catering Training
#### Workshop: Kickstarter Openshift & Spring Boot  https://github.com/software-catering/training-openshift-springboot
# step_6: Spring Actuator & the sick service

## Todo:
* add Spring Actuator to `web-ui` and `hello-service`
* implement a custom Health Indicator for `hello-service`:
  * coupled with two REST endpoints:
    * GET `/sick` makes the Health Indicator being `down`
    * GET `/healthy` makes the Health Indicator being `up` again.
* add a new service `admin-ui`:
  * use https://github.com/codecentric/spring-boot-admin
  * deploy it on openshift (with everything, Route to own host)
* make sure `web-ui` and `hello-service` are visible in `admin-ui`

## Hints:
* https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html 
* http://codecentric.github.io/spring-boot-admin/1.5.3/#getting-started
* http://codecentric.github.io/spring-boot-admin/1.5.3/#spring-boot-admin-client config key `spring.boot.admin.client.prefer-ip