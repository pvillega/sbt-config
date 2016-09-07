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
// Use `test:console` to launch as it is in test context
//libraryDependencies += "com.lihaoyi" %% "ammonite-repl" % "0.5.2" % "test" cross CrossVersion.full

//initialCommands in (Test, console) := """ammonite.repl.Main.run("")"""

