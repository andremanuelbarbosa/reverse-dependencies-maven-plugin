package com.andremanuelbarbosa.reversedependencies;

import static org.junit.Assert.assertNotNull;

import java.io.File;

import org.junit.Ignore;
import org.junit.Test;
import org.neo4j.graphdb.Transaction;

public class ReverseDependenciesStoreMojoIntegrationTest extends ReverseDependenciesIntegrationTest {

  @Test
  public void shouldExecuteWithMojoRule() throws Exception {

    ReverseDependenciesStoreMojo reverseDependenciesStoreMojo = (ReverseDependenciesStoreMojo) mojoRule.lookupMojo(
        "store", new File("src/test/resources/maven-plugin-testing-harness/single/pom.xml"));

    assertNotNull(reverseDependenciesStoreMojo);

    reverseDependenciesStoreMojo.execute();
  }

  @Test
  @Ignore
  public void shouldCreateNode() {

    Transaction transaction = graphDatabaseService.beginTx();
    assertNotNull(graphDatabaseService.createNode());
    transaction.success();
  }
}
