import com.github.ghik.plainsbt.ProjectGroup
import sbt.Keys._
import sbt._

object FooService extends ProjectGroup("fooservice", MyProj) {
  lazy val root: Project = mkRootProject
  
  lazy val api: Project = mkSubProject.dependsOn(Commons.api)
  lazy val impl: Project = mkSubProject.dependsOn(api, Commons.db)
  
  // mandatory boilerplate that collects the subprojects
  protected def enumerateSubprojects: Seq[Project] = discoverProjects
}

