###### Software Catering Training
#### Workshop: Kickstarter Openshift & Spring Boot  https://github.com/software-catering/training-openshift-springboot
# step_5: add the backend service 'hello-service'

## Todo:
* create spring boot service 'hello-service'
  * configure predefined "empty" maven module 'hello-service'
  * implementation REST service in predefined class `HelloService`
  * GET: `/hello` returns a dynamic JSON according to the followin example:
    ```json
    { 
      "message": "hello",
      "senderIp" : "1.2.3.4",
      "timeStamp":  "= new Date().toString();"
    }
    ```
    (whereas `senderIp` and `timeStamp` have to be replaced with real values)
* create builc config, depyolment, service and route for the new service
  **Important:** the route has to define the same hostname as the route of the web-ui