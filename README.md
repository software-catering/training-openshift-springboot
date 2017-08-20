###### Software Catering Training
#### Workshop: Kickstarter Openshift & Spring Boot  https://github.com/software-catering/training-openshift-springboot
# step_1: getting started with Spring Boot

## Todo:
* Implement the application web-ui
  * package: `software.catering.training.webui`
  * class: `WebUi`      
- Web-Application
- Port 8080
- serves a static JSON under /hello:
```json
{
  "message": "hello static world!"
}
```
- serves the following ~~web application~~ primitive HTML as /index.html:
```html
<!DOCTYPE html>
<html>
<body>

<h1>Hello World Web UI</h1>
<button type="button" onclick="hello()">Change Content</button>
<pre id="response"></pre>

<script>
    function prettyPrintJSON(json) {
        return JSON.stringify(JSON.parse(json), null, 2);
    }

    function hello() {
        document.getElementById("response").innerHTML = "";
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function () {
            if (this.readyState == XMLHttpRequest.DONE) {
                var response = "";

                if (this.status == 200) {
                    console.log(this.responseText);
                    response = prettyPrintJSON(this.responseText);
                }
                response += "\n" + this.status + ": " + this.statusText;

                document.getElementById("response").innerHTML = response;
            } else {
                document.getElementById("response").innerHTML += this.readyState + "*";
            }
        };
        xhttp.open("GET", "hello", true);
        xhttp.send();
    }
</script>

</body>
</html>
```
