To setup project in Eclipse:

Install Scala IDE  (http://scala-ide.org)

Install m2eclipse-scala (http://scala-ide.org/docs/tutorials/m2eclipse/index.html)

Checkout project into your eclipse workspace

In Eclipse Import > Maven > Existing Maven Projects

Right click on each sub project > Properties > Java Build Path > Add > Select the scala folders in src/main and src/test




Projects can use Java or Scala code... Java code goes in src/main/java and Scala goes in src/main/scala


DB is Cassandra using Astyanax driver (http://cassandra.apache.org/, http://www.datastax.com/, https://github.com/Netflix/astyanax/wiki)



