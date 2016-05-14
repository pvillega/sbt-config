resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("de.heikoseeberger" % "sbt-fresh" % "1.0.0")

//addSbtPlugin("org.ensime" % "ensime-sbt" % "0.3.2")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

//addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.1")

