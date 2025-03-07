#!/bin/sh
#
# This file runs the corresponded demo.
PATHSEP=":"

${WTK_HOME}/bin/emulator -classpath classes${PATHSEP}res -Xdebug -Xrunjdwp:transport=dt_socket,address=4711,server=y Sonic