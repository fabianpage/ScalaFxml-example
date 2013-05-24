resolvers += "Sonatype snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += Classpaths.sbtPluginReleases

resolvers += "Nuriaion Snapshots" at "http://nuriaion.github.io/maven-repo/maven-repo/snapshots"

resolvers += "Nuriaion Releases" at "http://nuriaion.github.io/maven-repo/maven-repo/snapshots"

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.4.0")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.6.2")

addSbtPlugin("me.lessis" % "sbt-growl-plugin" % "0.1.3")

addSbtPlugin("com.github.nuriaion" % "scalafxml-sbt" % "0.1.2-SNAPSHOT")
