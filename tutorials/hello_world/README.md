## Description

Hello World examples using [Mule ESB](https://www.mulesoft.com/resources/esb/what-mule-esb).

## Requests supported

* GET /hello
* GET /hellojava?name=name
* GET /hellojavaclass

## Notes

* Adding a java class to the project did not import the bean to the XML config automatically. Hence it was necessary to manually include the class in the XML config:
	```
    <spring:beans>
        <spring:bean name="helloWorldJava" class="br.ufsc.das.helloWorldJava"/>
    </spring:beans>
    ```
