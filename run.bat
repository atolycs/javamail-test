echo "Running Java Program"


set OLD_PATH=%CD%
set DEST=%CD%\src

set RUN_CLASSPATH="..\lib\mail.jar;."
set RUN_PACKAGE="jp.atolycs.mSendTest"

cd /d %DEST%

java -cp %RUN_CLASSPATH% %RUN_PACKAGE%

cd /d %OLD_PATH%

pause