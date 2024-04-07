#!/usr/bin/env bash

JAVAC="/usr/bin/javac"

JAVA_LIBS="../lib/mail.jar:."

SRC="$(pwd)/src"

cd $SRC

$JAVAC -cp $JAVA_LIBS ./jp/atolycs/mSendTest.java
