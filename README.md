# netbeans-jemmy

[![Build Status](https://travis-ci.org/madworx/netbeans-jemmy.svg?branch=master)](https://travis-ci.org/madworx/netbeans-jemmy)[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=netbeans-jemmy&metric=alert_status)](https://sonarcloud.io/dashboard?id=netbeans-jemmy)

Fork of the Netbeans Jemmy library, sourced from

  http://central.maven.org/maven2/org/netbeans/jemmy/2.2.7.5/jemmy-2.2.7.5-sources.jar

Reason behind this fork are the following:

* Maven repository  contains only one  version (2.2.7.5) of  the Jemmy
  artifact. The POM file(s) reference now defunct SCM links.

* The Jemmy library "official" sources seem to have been moved to some
  HG instance run by openjdk - unfortunately they imported the library
  without retaining any version history and recent patches against the
  source code is neither tagged or released properly.

* We needed  to extend the  functionality of  the Jemmy library  for a
  Robot Framework / RemoteSwingLibrary project.

* The original Jemmy library would only build with pre-Java-5 target.
