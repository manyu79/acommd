#!/bin/sh

LCM_JAR=/usr/local/share/java/lcm.jar

lcm-gen -xpj asv_to_auv_gps_owtt_t.lcm
javac -cp $LCM_JAR acomms/asv_to_auv_gps_owtt_t.java
jar cf acomms/asv_to_auv_gps_owtt_t.jar acomms/asv_to_auv_gps_owtt_t.class

lcm-gen -xpj cmd_ping_t.lcm
javac -cp $LCM_JAR acomms/cmd_ping_t.java
jar cf acomms/cmd_ping_t.jar acomms/cmd_ping_t.class

lcm-gen -xpj owtt_t.lcm
javac -cp $LCM_JAR acomms/owtt_t.java
jar cf acomms/owtt_t.jar acomms/owtt_t.class

lcm-gen -xpj auv_to_asv_state_t.lcm
javac -cp $LCM_JAR acomms/auv_to_asv_state_t.java
jar cf acomms/auv_to_asv_state_t.jar acomms/auv_to_asv_state_t.class
