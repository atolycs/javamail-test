#!/usr/bin/env bash

JAVA=/usr/bin/java

RUN_PACKAGE="jp.atolycs.mSendTest"

# Library
JAVA_LIBS="../lib/mail.jar:."

DIST="$(pwd)/src"

# Move
cd $DIST

# Run Program
$JAVA -cp ${JAVA_LIBS} $RUN_PACKAGE