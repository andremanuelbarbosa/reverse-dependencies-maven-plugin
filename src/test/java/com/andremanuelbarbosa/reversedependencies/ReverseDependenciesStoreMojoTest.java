package com.andremanuelbarbosa.reversedependencies;

import static org.mockito.Mockito.when;

import org.apache.maven.project.MavenProject;
import org.junit.After;
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
  public void setUp() throws Exception {

    when(mavenProject.getName()).thenReturn(getClass().getName());

    reverseDependenciesStoreMojo = new ReverseDependenciesStoreMojo(mavenProject, null);
  }

  @After
  public void tearDown() throws Exception {

  }

  @Test
  public void shouldExecute() throws Exception {

    when(mavenProject.getDependencies()).thenReturn(null);

    reverseDependenciesStoreMojo.execute();
  }
}
