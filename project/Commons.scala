import com.github.ghik.sbt.nosbt.crossproject.CrossProjectGroup
import sbt._
import sbtcrossproject.{CrossProject, JVMPlatform}
import scalajscrossproject.JSPlatform

object Commons extends CrossProjectGroup("commons", MyProj) {
  lazy val root: Project = mkRootProject

  lazy val db: Project = mkSubProject
  lazy val api: Project = mkSubProject

  lazy val utils: CrossProject = mkCrossSubProject(JSPlatform, JVMPlatform)
}
