echo Start %time%
echo Create test.txt
gradlew build
echo Stop %time%
echo test>test.txt
echo Copy Test.txt to Old_test.txt
copy test.txt Old_test.txt
pause