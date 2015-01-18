package com.andremanuelbarbosa.reversedependencies;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * Stores the Reverse Dependencies of the Project
 * 
 * @goal store
 * @requiresProject true
 * @author Andre Barbosa <andremanuelbarbosa@gmail.com>
 */
public class ReverseDependenciesStoreMojo extends AbstractMojo {

  /**
   * The Maven Project
   * 
   * @parameter expression="${project}"
   * @required
   * @readonly
   */
  private MavenProject mavenProject;

  /**
   * The Neo4J Location
   * 
   * @parameter expression="${neo4j.location}"
   *            default-value="http://localhost:7474"
   */
  private String neo4jLocation;

  public ReverseDependenciesStoreMojo() {
    //
  }

  protected ReverseDependenciesStoreMojo(MavenProject mavenProject, String neo4jLocation) {

    this.mavenProject = mavenProject;
    this.neo4jLocation = neo4jLocation;
  }

  public void execute() throws MojoExecutionException, MojoFailureException {

    getLog().info("running plugin");

    mavenProject.getDependencies();

    // TODO Auto-generated method stub
  }
}
