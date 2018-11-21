# Java11SampleApp-Ant-Build

# ====================================
# Setup
# ====================================
version of eclipse used for this is eclipse eclipse-java-2018-09-win32-x86_64)

Make sure Ant apache-ant-1.10.5-bin (supports jdk 11) is downloaded and 

ANT_HOME set to the extracted directory

Also add %ANT_HOME%\bin to PATH env variable

Ensure jdk-11.0.1_windows-x64_bin is downloaded and JAVA_HOME is set to extracted path

There is no separate jre directory in jdk 11 releases

Make sure %JAVA_HOME%\bin is present in PATH env variable

Create a java project in eclipse (JRE is JavaSE-11)

Create build.xml in project location

Add the contents of build.xml in this source code

Right click build.xml -> build path -> Configure build path -> Libraries -> Module Path -> Add library -> JRE system library

Select jdk 11.0.1 from one of the options (Assuming eclipse supports jdk 11)

Make sure java compiler is set to 11 in Window -> preference or right click project -> properties 

# ====================================
# Executing the jar file
# ==================================

1. cd to <Workspace location>\Java11Sample\dist\lib
	
2. Execute below 

	<Extracted jdk11 location>\jdk-11.0.1_windows-x64_bin\jdk-11.0.1\bin\java.exe -jar Java11Sample.jar
