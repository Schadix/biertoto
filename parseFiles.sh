#!/bin/bash

# starts at 0 and 34 is the relegation
LIMIT=33

for ((a=0; a <= LIMIT ; a++))
do
  java -cp dist/biertoto.jar:lib/commons-cli-1.0.jar:lib/jtidy.jar de.schadix.biertoto.dom.Test file:///Users/schadix/Documents/workspace/biertoto2/Biertoto/2009/$a.html >> result.csv
done

