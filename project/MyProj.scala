import com.github.ghik.plainsbt.ProjectGroup
import sbt.Keys._
import sbt._

object MyProj extends ProjectGroup("myproj") {
  override def buildSettings: Seq[Def.Setting[_]] = Seq(
    scalaVersion := "3.2.2",
  )

  lazy val root: Project = mkRootProject
  
  lazy val commons: Project = Commons.root
  lazy val fooservice: Project = FooService.root
  lazy val barservice: Project = BarService.root
    
  // mandatory boilerplate that collects the subprojects
  protected def enumerateSubprojects: Seq[Project] = discoverProjects
}

