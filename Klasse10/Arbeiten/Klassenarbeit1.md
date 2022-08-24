# Aufgabe 1: Algorythmen und deren Eigenschaften
## a) Was versteht man unter Algorithmen?
## b) Nenne und beschreibe kurz die Eigenschaften eines Algorythmus

# Aufgabe 2
Erstelle und implementiere das untere Formular mithilfe von VBA-Editor
![Formular](https://user-images.githubusercontent.com/101984195/186473426-ede87b1b-35ef-4653-8830-5836073d66b6.jpg)

# Aufgabe 3: Geometrie - Funktionale Programmierung
Erstelle eine Java-Klasse "Geometrie" und implementiere folgende Methoden:
__1.__ ```getVolumenZylinder()``` und ```getOberflaecheZylinder()```, die aus der Höhe und einem Radius das Volumen und die Oberfläche eines Zylinder berechnen.
__2.__ ```getUmfangKugel()```, ```getVolumenKugel()``` und ```getOberflaecheKugel()```, die anhand vom Radius ```r``` Umfang, Volumen und Oberfläche einer Kugel berechnen.

## Formelsammlung:
* Zylinder
  * V = (Pi*h*d²) / 4
  * O = (d * Pi * (2h + d)) / 2
  * d = 2r
* Kugel
  * V = (Pi * d³) / 6
  * O = Pi * d²
  * d = 2r
  * u = 2 * Pi * r


### Merke: Achten sie bitte auf eine _ordentliche Darstellung_ und Code eben mit Kommentaren zu versehen.


---
# Lösungen

## Aufgabe 1
### a)
> Ein Algorithmus ist eine Verarbeitungsvorschrift, die zum Lösen gleichartiger Probleme genutzt werden kann.
### b)
> __Endlichkeit__: Ein Algorythmus besteht aus endlich vielen Anweisungen  
> __Eindeutigkeit__: Die Anweisungen folgen einer _festgelegten, nicht willkürlichen_ Reihenfolge, sodass die gleiche Eingabe immer zur gleichen Ausgabe führt  
> __Ausführbarkeit__: Jede Anweisung muss ausführbar sein  
> __Allgemeingültigkeit__: Der Algorithmus muss auf alle Aufgaben gleicher Art anwendbar sein  

## Aufgabe 2
Auf korrekte Benennung der Elemente ist zu Achten
```vba
Private Sub cmdCalc1_Click()
Dim a As Double 'Deklaration
Dim b As Double 'Deklaration
Dim ergebnis As Double 'Deklaration
a = txtA.Value 'Zuweisung aus dem Eingabefeld
b = txtB.Value 'Zuweisung aus dem Eingabefeld

ergebnis = a * a + b * b 'Berechnung

txtErgebnis.Value = ergebnis 'Ausgabe
End Sub

Private Sub cmdCalc2_Click()
Dim a As Double 'Deklaration
Dim b As Double 'Deklaration
Dim ergebnis As Double 'Deklaration
a = txtA.Value 'Zuweisung aus dem Eingabefeld
b = txtB.Value 'Zuweisung aus dem Eingabefeld

ergebnis = (a + a) * (b + b) 'Berechnung

txtErgebnis.Value = ergebnis 'Ausgabe
End Sub

Private Sub cmdCalc3_Click()
Dim a As Double 'Deklaration
Dim b As Double 'Deklaration
Dim ergebnis As Double 'Deklaration
a = txtA.Value 'Zuweisung aus dem Eingabefeld
b = txtB.Value 'Zuweisung aus dem Eingabefeld

ergebnis = (a - b) * (a - b) * (a - b) 'Berechnung

txtErgebnis.Value = ergebnis 'Ausgabe
End Sub

Private Sub cmdCalc4_Click()
Dim a As Double 'Deklaration
Dim b As Double 'Deklaration
Dim ergebnis As Double 'Deklaration
a = txtA.Value 'Zuweisung aus dem Eingabefeld
b = txtB.Value 'Zuweisung aus dem Eingabefeld

If b = 0 Then               'Test auf Division durch 0
MsgBox "Division durch 0!"  'bei Erfolg: Warnung
Else                        'sonst
ergebnis = a / b            'Berechnung und
txtErgebnis.Value = ergebnis 'Ausgabe
End If
End Sub

Private Sub cmdExit_Click()
End 'Beenden des Programms
End Sub

Private Sub cmdReset_Click()
txtA.Value = "" 'Löschen der Felder
txtB.Value = "" 'Löschen der Felder
txtErgebnis.Value = "" 'Löschen der Felder
End Sub
```

## Aufgabe 3
```java
package Klassenarbeit;

public class Geometrie {
  
  public static double getVolumenZylinder(double h, double r) {
    double volume; // Deklaration
    double d = 2 * r; // Deklaration mit Zuweisung
    volume = Math.PI * h * d * d * 0.25; // Berechnung
    return volume; // Rückgabe
  }
  
  public static double getOberflächeZylinder(double h, double r) {
    double oberflaeche;  // Deklaration
    double d = 2 * r; // Deklaration mit Zuweisung
    oberflaeche = Math.PI * d * (2 * h + d) * 0.5; // Berechnung
    return oberflaeche; // Rückgabe
  }
  
  public static double getUmfangKugel(double r) {
    double umfang;  // Deklaration
    umfang = 2 * Math.PI * r; // Berechnung
    return umfang; // Rückgabe
  }
  
  public static double getVolumenKugel(double r) {
    double volume;  // Deklaration
    double d = 2 * r; // Deklaration mit Zuweisung
    volume = math.PI * d * d * d * 1/6; // Berechnung
    return volume; // Rückgabe
  }
  
  public static double getOberflaecheKugel(double r) {
    double oberflaeche;  // Deklaration
    double d = 2 * r; // Deklaration mit Zuweisung
    oberflaeche = Math.PI * d * d; // Berechnung
    return oberflaeche; // Rückgabe
  }
  
  public static void main(String[] args) {
    // Test der Methoden
    System.out.println("Zylinder:");
    System.out.println(Geometrie.getVolumenZylinder(5, 2));
    System.out.println(Geometrie.getOberflaecheZylinder(5, 2));
    System.out.println("Kugel:");
    System.out.println(Geometrie.getUmfangKugel(2)));
    System.out.println(Geometrie.getVolumenKugel(2));
    System.out.println(Geometrie.getOberflaecheKugel(2));
  }
}
```
