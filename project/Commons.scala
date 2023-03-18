import com.github.ghik.plainsbt.ProjectGroup
import sbt.Keys._
import sbt._

object Commons extends ProjectGroup("commons", MyProj) {
  lazy val root: Project = mkRootProject
  
  lazy val db: Project = mkSubProject
  lazy val api: Project = mkSubProject
  
  // mandatory boilerplate that collects the subprojects
  protected def enumerateSubprojects: Seq[Project] = discoverProjects
}

