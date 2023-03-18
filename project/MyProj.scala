import com.github.ghik.sbt.nosbt.ProjectGroup
import sbt.Keys._
import sbt._

object MyProj extends ProjectGroup("myproj") {
  override def commonSettings: Seq[Def.Setting[_]] = Seq(
    scalaVersion := "3.2.2",
  )

  lazy val root: Project = mkRootProject
  
  lazy val commons: Project = Commons.root
  lazy val fooservice: Project = FooService.root
  lazy val barservice: Project = BarService.root
}

