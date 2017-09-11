###### Software Catering Training
#### Workshop: Kickstarter Openshift & Spring Boot  https://github.com/software-catering/training-openshift-springboot
# step_7: Probes & Scale

## Todo:
* add Readiness Probes to all services (admin-ui, web-ui, hello-service):
  * pointing to the health endpoint of Spring Actuator
* scale web-ui service up to 2 instances using the web console
* scale hello service up to 2 instances using the cli
* play around with deployments & sick-service
* try out deployment strategy `recreate`
  * in the web console switch the deployment strategy of hello-service to `recreate`
  * make a deployment and watch how the deployment is rolled out
  * switch back to `rolling` deloyment strategy

## Hints:
* $ oc scale --help
* https://docs.openshift.org/latest/dev_guide/deployments/deployment_strategies.html
