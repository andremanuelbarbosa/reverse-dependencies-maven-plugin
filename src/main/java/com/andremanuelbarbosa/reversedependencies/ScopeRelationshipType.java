package com.andremanuelbarbosa.reversedependencies;

import org.neo4j.graphdb.RelationshipType;

public enum ScopeRelationshipType implements RelationshipType {

  COMPILE, TEST
}
