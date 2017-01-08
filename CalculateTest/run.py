#coding=utf-8
import os
import os.path
os.system("adb shell rm -rf sdcard/report.xml")
filename = 'report.xml'
if os.path.exists(filename):
   os.remove(filename)
	
#uninstall APP and test APP
os.system("adb uninstall com.example.add.test")
import os.path
 
#remove previous data
os.system("adb uninstall com.example.add")

#build test APP
os.system("ant build debug")

#install app and test APP
os.system("adb install ../Caculate/bin/Caculate-debug.apk")
os.system("adb install ./bin/CaculateTest-debug.apk")

#start test
os.system("adb shell am instrument -w -e reportDir sdcard -e reportFile report.xml com.example.add.test/com.zutubi.android.junitreport.JunitReportTestRunner")

os.system("adb pull sdcard/report.xml ./report.xml")