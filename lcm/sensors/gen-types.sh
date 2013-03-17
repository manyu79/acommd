#!/bin/sh

LCM_JAR=/usr/local/share/java/lcm.jar

lcm-gen -xpj dvl_t.lcm
javac -cp $LCM_JAR sensors/dvl_t.java
jar cf sensors/dvl_t.jar sensors/dvl_t.class

