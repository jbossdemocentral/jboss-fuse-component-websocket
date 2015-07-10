Bindy WebSocket Connector DEMO
======================================================
A demo about vegetable warehouse biding, truck drives into the warehouse with loads of goods, when the driver signs the goods over, a cvs file contains the product information will be feed into our system via wireless transmission. Covert the individual items in csv file into Java Objects using Camel Bindy. 
And then use wire tap EIP to dispatch processed message simultaneously to a data store and display to client via WebSocket.

![Fabric list](https://raw.githubusercontent.com/weimeilin79/jboss-fuse-component-websocket/master/doc/pic/demo.png?raw=true)

Setup and configuration
-----------------------

Download JBoss Fuse from jboss.org, and place the downloaded zip file under installs folder.

Add fabric server passwords for Maven Plugin to your ~/.m2/settings.xml file the fabric server's user and password so that the maven plugin can login to the fabric.

```
<server>
  <id>fabric8.upload.repo</id>
  <username>admin</username>
  <password>admin</password>
</server>
```
run 
```
init.sh
```

It will setup JBoss Fuse, install fabric, build and deploy the profile. 
Or you can create your own container with Fabric Console.
![Fabric list](https://raw.githubusercontent.com/weimeilin79/jboss-fuse-component-websocket/master/doc/pic/02container-create.png?raw=true)

Open the websocket.html under project/websocketbindydemo file with a browser that supports HTML 5.
And then send the CSV file to the endpoint to kick off the camel route. 
Place the product.csv file from 
```
project/websocketbindydemo/src/
```
to 

```
target/jboss-fuse-6.2.0.redhat-133/instances/wsbindycon/csv
```


![Fabric list](https://raw.githubusercontent.com/weimeilin79/jboss-fuse-component-websocket/master/doc/pic/04client.png?raw=true)



