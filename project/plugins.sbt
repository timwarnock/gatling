resolvers += Resolver.bintrayIvyRepo("gatling", "sbt-plugins")
resolvers += Resolver.jcenterRepo

addSbtPlugin("io.gatling"         % "gatling-build-plugin"  % "2.3.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-native-packager"   % "1.3.2")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"               % "0.3.3")
addSbtPlugin("net.aichler"        % "sbt-jupiter-interface" % "0.7.0")
addSbtPlugin("com.typesafe.sbt"   % "sbt-site"              % "1.3.2")
