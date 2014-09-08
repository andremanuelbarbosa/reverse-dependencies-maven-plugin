package com.andremanuelbarbosa.reverse.dependencies.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.project.MavenProject;

/**
 * Stores the Reverse Dependencies of the Project
 * 
 * @goal store
 * @requiresProject true
 * @author andremanuelbarbosa
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

  public ReverseDependenciesStoreMojo() {

  }

  protected ReverseDependenciesStoreMojo(MavenProject mavenProject) {

    this.mavenProject = mavenProject;
  }

  public void execute() throws MojoExecutionException, MojoFailureException {
    
     mavenProject.getDependencies();
    
    // TODO Auto-generated method stub

    getLog().info("running plugin");
  }
}
