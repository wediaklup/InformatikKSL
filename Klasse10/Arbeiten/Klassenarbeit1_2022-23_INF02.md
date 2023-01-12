# Daten
<table>
 <tr>
  <th>Klasse</th>
  <td>10</td>
 </tr>
 <tr>
  <th>Kurs</th>
  <td>WPFINF02</td>
 </tr>
 <tr>
  <th>Schuljahr</th>
  <td>2022/23</td>
 </tr>
 <tr>
  <th>Geschrieben</th>
  <td>01. Dez. MMXXII</td>
 </tr>
 <tr>
  <th>Zurückbekommen</th>
  <td>12. Jan. MMXXIII</td>
 </tr>
 <tr>
  <th colspan="2">~ Konstantin “wédiaklup” MMXXIII</th>
</table>

# Aufgabe 1
* **a):** Erstelle und implementiere das untere Formular mithilfe von VBA-Editor. [Bild nicht verfügbar, siehe Lösung]
* **b):** Zeichne für den Befehl `X/Y` ein passendes Flussdiagramm.

# Aufgabe 2: Kleine Programme unter Eclipse und die Programmiersprache Java
1. Was versteht man unter _Deklaration_ und _Definition_ von Variablen?
2. Schreibe ein Programm, welches aus der Höhe und einem Radius das Volumen und die Oberfläche eines Zylinders berechnet. (Erstelle eine Java-Klasse: `Zylinder`)
3. Berechne anhand von `r` Umfang, Volumen und Oberfläche einer Kugel. (Erstelle eine Java-Klasse: `Kugel`)

**Hinweis:** `Math.PI` kann dir hier gute Dienste leisten.

## Formelsammlung:
* Zylinder
  * V = (Pi * h * d²) / 4
  * O = (d * Pi * (2h + d)) / 2
  * d = 2r
* Kugel
  * V = (Pi * d³) / 6
  * O = Pi * d²
  * d = 2r
  * u = 2 * Pi * r

### _Nachtrag_ – Abkürzungserkläuterungen
_Nicht in der Klausur gegeben_
* _Pi_ – π
* _d_ – Durchmesser
* _h_ – Höhe
* _u_ – Umfang
* _r_ – Radius

**Achten Sie bitte auf eine <ins>ordentliche Darstellung</ins> (Deklaration und Definition aller Variablen) und Code eben mit Kommentaren zu versehen.**

# Lösungen
## Aufgabe 1a
### Formular (sobald Bild eingefügt, bitte entfernen)
**Benötigte Elemente:**
* Label: Überschrift – „Taschenrechner“
* Bild eines Taschenrechners
* Input mit Label: Textbox mit Beschriftung `X`
* Input mit Label: Textbox mit Beschriftung `Y`
* Output mit Label: Textbox (`Locked: True`) mit Beschriftung `Ergebnis`
* Buttons: Operationsknöpfe für `X + Y`, `X - Y`, `X * Y` und `X / Y`
* Buttons: „Reset“ zum leeren aller Felder und „Beenden“

### Code
```vba
Private Sub cmdAddieren_Click()
'Deklarationen
Dim x As Double
Dim y As Double
Dim ergebnis As Double

'Definitionen
x = txtInputX.Value
y = txtInputY.value

'Berechnung
ergebnis = x + y

'Anzeigen des Ergebnisses
txtOutput.Value = ergebnis

End Sub

Private Sub cmdDividieren_Click()
'Deklarationen
Dim x As Double
Dim y As Double
Dim ergebnis As Double

'Definitionen
x = txtInputX.Value
y = txtInputY.value

'Überprüfen, ob eine Brechnung möglich ist
If y = 0 Then
    'Falls der Dividend Null ist, wird die Berechnung abgebrochen, da sonst eine Fehlermeldung erscheint
    txtOutput.Value = "ERROR"   'Anzeigen des Fehlers in der Benutzeroberfläche
Else
    'Berechnung wird bei ord[n]ungsgemäßer x- und y-Eingabe durchgeführt
    ergebnis = x / y
    txtOutput.Value = ergebnis    'Anzeigen des Ergebnisses
End If

End Sub

Private Sub cmdMultiplizieren_Click()
'Deklarationen
Dim x As Double
Dim y As Double
Dim ergebnis As Double

'Definitionen
x = txtInputX.Value
y = txtInputY.value

'Berechnung
ergebnis = x * y

'Anzeigen des Ergebnisses
txtOutput.Value = ergebnis

End Sub

Private Sub cmdSubtrahieren_Click()
'Deklarationen
Dim x As Double
Dim y As Double
Dim ergebnis As Double

'Definitionen
x = txtInputX.Value
y = txtInputY.value

'Berechnung
ergebnis = x - y

'Anzeigen des Ergebnisses
txtOutput.Value = ergebnis

End Sub

Private Sub cmdExit_Click()
'Beenden des Programms
End
End Sub

Private Sub cmdReset_Click()
'Leeren sämtlicher Textfelder
txtInputX.Value = ""
txtInputY.Value = ""
txtOutput.Value = ""

End Sub
```
_nach Konstantin 10d_

## Aufgabe 1b
![Flussdiagramm](https://user-images.githubusercontent.com/101984195/212125249-b0e7c08b-8326-42b9-9d4f-42c0d1b29247.png) <br>
_nach Konstantin 10d_

## Aufgabe 2.1
Bei einer Deklaration einer Variable wird der Datentyp und der Variablenname bekanntgegeben. <br> Bei einer Definition wird einer deklarierten Variable ein Wert zugeweisen. <br> _nach Konstantin 10d_

## Aufgabe 2.2
```java
package geometrie;

public class Zylinder {
    public static double getOberflaecheZylinder(double hoehe, double  radius) {
        // Deklarationen und Definitionen
        double pi = Math.PI;    // Konstante für Pi
        double d = radius * 2;  // d steht für Durchmesser, der aus dem Doppelten des Radius errechnet wird
        double ergebnis;        // Leere Variable zum Speichern des Ergebnisses
        
        // Berechnung gemäß folgender Formel: O = (d * pi * (2 * hoehe + d)) / 2
        ergebnis = (d * pi * (2*hoehe + d)) / 2;
        
        // Rückgabe des Ergebnisses
        return ergebnis;
    }
    
    public static double getVolumenZylinder(double hoehe, double radius) {
        double pi = Math.PI;    // Konstante für Pi
        double d = radius * 2;  // d steht für Durchmesser, der aus dem Doppelten des Radius errechnet wird
        double ergebnis;        // Leere Variable zum Speichern des Ergebnisses
        
        // Berechnung gemäß folgender Formel: V = (pi * hoehe * d²) / 4
        ergebnis = (pi * hoehe * (d * d)) / 4;
        
        // Rückgabe des Ergebnisses
        return ergebnis;
    }
    
    [Main-Methode wird nicht aufgeführt]
}
```
_nach Konstantin 10d_

## Aufgabe 2.3
```java
package geometrie;

public class Kugel {
    public static double getUmfangKugel(double radius) {
        // Deklarationen und ggf. Definitionen
        double pi = Math.PI;    // Konstante für Pi
        double ergebnis;        // Leere Variable für das Ergebnis
        
        // Berechnung gemäß folgender Formel: u = 2 * pi * radius
        ergebnis = 2 * pi * radius;
        
        // Rückgabe des Ergebnisses
        return ergebnis;
    }
    
    public static double getVolumenKugel(double radius) {
        // Deklarationen und ggf. Definitionen
        double pi = Math.PI;    // Konstante für Pi
        double d = radius * 2;  // d steht für Durchmesser, der aus dem Doppelten des Radius errechnet wird
        double ergebnis;        // Leere Variable für das Ergebnis
        
        // Berechnung gemäß folgender Formel: V = (pi * d³) / 6
        ergebnis = (pi * (d * d * d)) / 6;
        
        // Rückgabe des Ergebnisses
        return ergebnis;
    }
    
    public static double getOberflaecheKugel(double radius) {
        // Deklarationen und ggf. Definitionen
        double pi = Math.PI;    // Konstante für Pi
        double d = radius * 2;  // d steht für Durchmesser, der aus dem Doppelten des Radius errechnet wird
        double ergebnis;        // Leere Variable für das Ergebnis
        
        // Berechnung gemäß folgender Formel: O = pi * d²
        ergebnis = pi * (d * d);
        
        // Rückgabe des Ergebnisses
        return ergebnis;
        
        [Main-Methode wird nicht aufgeführt]
    }
}
```
_nach Konstantin 10d_
