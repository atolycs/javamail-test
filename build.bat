echo Building java program

set OLD_PATH=%CD%

set SRC="%CD%\src"
set BUILD_CLASSPATH="..\lib\mail.jar;."

cd /d %SRC%

javac -cp %BUILD_CLASSPATH% ./jp/atolycs/mSendTest.java

cd /d %OLD_PATH%

pause