package com.andremanuelbarbosa.reversedependencies;

import org.apache.maven.plugin.testing.MojoRule;
import org.junit.Rule;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.graphdb.factory.GraphDatabaseSettings;

abstract class ReverseDependenciesIntegrationTest {

  static GraphDatabaseService graphDatabaseService = new GraphDatabaseFactory()
      .newEmbeddedDatabaseBuilder("target/neo4j").setConfig(GraphDatabaseSettings.allow_store_upgrade, "true")
      .newGraphDatabase();

  static {

    registerShutdownHook();
  }

  private static void registerShutdownHook() {

    Runtime.getRuntime().addShutdownHook(new Thread() {

      @Override
      public void run() {

        graphDatabaseService.shutdown();
      }
    });
  }

  @Rule
  protected MojoRule mojoRule = new MojoRule() {

    @Override
    protected void before() throws Throwable {
      //
    }

    @Override
    protected void after() {
      //
    }
  };
}
