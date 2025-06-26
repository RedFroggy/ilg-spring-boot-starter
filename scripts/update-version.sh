#!/bin/bash
set -e

# Version fournie par Semantic Release
VERSION=$1

# Utiliser le plugin Maven Versions pour mettre à jour le pom.xml
mvn versions:set -DnewVersion=$VERSION -DgenerateBackupPoms=false

# Facultatif : valider que le pom.xml contient bien la version.
grep "<version>$VERSION</version>" pom.xml
