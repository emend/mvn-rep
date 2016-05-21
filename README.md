# mvn-rep
maven repositories

In order to create the maven releases before adding them you should do the following : 

### mvn clean deploy
This will process something like that : 
Downloading: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/maven-metadata.xml
Uploading: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/olok-models-routing-0.2-20160521.013248-1.jar
Uploaded: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/olok-models-routing-0.2-20160521.013248-1.jar (4 KB at 112.1 KB/sec)
Uploading: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/olok-models-routing-0.2-20160521.013248-1.pom
Uploaded: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/olok-models-routing-0.2-20160521.013248-1.pom (3 KB at 88.9 KB/sec)
Downloading: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/maven-metadata.xml
Uploading: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/maven-metadata.xml
Uploaded: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/0.2-SNAPSHOT/maven-metadata.xml (774 B at 27.0 KB/sec)
Uploading: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/maven-metadata.xml
Uploaded: file://C:\work\dLiv\mvn-rep\models\target/mvn-rep/olok/models/olok-models-routing/maven-metadata.xml (288 B at 12.2 KB/sec)

### cp -D /target/mvn-rep/olok/models/olok-models-routing/<VERSION> ../releases/mvn-rep/olok/models/olok-models-routing/<VERSION>

