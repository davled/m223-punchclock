Die Applikation lässt einem die Checkin und Checkout Datum und Zeit erfassen. Es gibt zusätzlich Kategorien und Zimmer welche man auswählen kann. Das Ganze ist mit einem JWT Login gesichert. 



************************************************************************************
Innstallation der Applikation:

Voraussetzzungen:
	-IDE die gradel importieren kann.
	-Java 11.09 OpenJDK auf Computer.

Ordner erstellen wo die Applikation hin soll.
	Bsp.: /home/zli/workspace/Applikation

Terminal öffnen

In Terminal zu Ordner navigieren, wo mann die app haben möchte.
	Bsp.: cd /home/zli/workspace/Applikation
	
Dort den Befehl über Git ausführen:
	git clone https://github.com/davled/m223-punchclock.git

Den Ordner mit einer Belibingen IDE Projekt importieren.
	Bsp.: /home/zli/workspace/Applikation
	
In der IDE auf Build drucken.
	In Intellij CTRL+F9
	
Die Applikation starten.
	In Intellij SHIFT+F10
	
Die Applikation ist jetzt aufrufbar über den Browser unter:
	http://localhost:8081/

************************************************************************************

Um einen User zu erstellen auf die Seite navigieren: 
	http://localhost:8081/sign-up

Die Userverwaltung erreicht man unter:
	http://localhost:8081/users
	
Um die Entries zu erfassen, bearbeiten oder zubetrachten die Seite navigieren:
	http://localhost:8081/entries
	
Um die Categories zu erfassen, bearbeiten oder zubetrachten die Seite navigieren: 
	http://localhost:8081/category
	
	
	
	
	
	
	
	
	
