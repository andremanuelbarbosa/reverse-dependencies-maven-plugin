package com.andremanuelbarbosa.reverse.dependencies.maven.plugin;

import org.apache.maven.project.MavenProject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ReverseDependenciesStoreMojoTest {

  @Mock
  private MavenProject mavenProject;

  private ReverseDependenciesStoreMojo reverseDependenciesStoreMojo;

  @Before
  public void setUp() {

    reverseDependenciesStoreMojo = new ReverseDependenciesStoreMojo(mavenProject);
  }

  @Test
  public void shouldExecute() throws Exception {

    reverseDependenciesStoreMojo.execute();
  }
}
