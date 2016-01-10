// allow control + c to cancel tasks
cancelable in Global := true

// cleans console when we start a run in a triggered execution, like  ~test:compile
triggeredMessage in ThisBuild := Watched.clearWhenTriggered

// Handy `clear` command:
def clearConsoleCommand = Command.command("clear") { state =>
  val cr = new jline.console.ConsoleReader()
  cr.clearScreen
  state
}

commands += clearConsoleCommand

// Use Ammonite REPL instead of default scala repl
libraryDependencies += "com.lihaoyi" % "ammonite-repl" % "latest.integration" % "test" cross CrossVersion.full

initialCommands in (Test, console) := """ammonite.repl.Repl.run("")"""

// Shows dependency graph of project. Run `dependencyTree` or `dependencyBrowseGraph`
// See https://github.com/jrudolph/sbt-dependency-graph
// net.virtualvoid.sbt.graph.Plugin.graphSettings
