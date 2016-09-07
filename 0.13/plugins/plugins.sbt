resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("de.heikoseeberger" % "sbt-fresh" % "1.5.7")

addSbtPlugin("org.ensime" % "sbt-ensime" % "latest.integration")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "latest.integration")

