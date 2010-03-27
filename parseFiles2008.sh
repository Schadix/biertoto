#!/bin/bash

# starts at 0 and 34 is the relegation
LIMIT=34

for ((a=1; a <= LIMIT ; a++))
do
  java -cp dist/biertoto.jar:lib/commons-cli-1.0.jar:lib/jtidy.jar de.schadix.biertoto.dom.Test -y 2008 file:///Users/schadix/Documents/workspace/biertoto2/Biertoto/2008/$a.html >> result2008.csv
done

