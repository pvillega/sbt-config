resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.ensime" % "ensime-sbt" % "latest.integration")

addCompilerPlugin("org.scalamacros" % "paradise" % "latest.integration" cross CrossVersion.full)

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "latest.integration")

