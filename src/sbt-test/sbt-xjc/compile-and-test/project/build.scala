import com.github.retronym.sbtxjc.SbtXjcPlugin
import sbt._

object build extends Build {
  lazy val root = Project("main", file("."), settings = Defaults.defaultSettings ++ SbtXjcPlugin.xjcSettings ++ Seq(
    SbtXjcPlugin.xjcCommandLine += "-verbose"
  ))
}
