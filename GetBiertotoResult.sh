#!/bin/bash

# starts at 0 and 34 is the relegation
LIMIT=34

for ((a=0; a <= LIMIT ; a++))
do
   wget -O $a.html http://www.kicktipp.de/biertoto/tippuebersicht?kt_page=tippuebersicht\&sortBy=gesamtpunkte\&tippspieltagIndex=$a\&submitbutton=anzeigen\&_charset_=
done



