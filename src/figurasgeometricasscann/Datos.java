/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricasscann;
import java.util.Scanner;
/**
 *
 * @author edgar
 */
public class Datos 
{
    Scanner Scan = new Scanner(System.in);
    static int lado,radio,base,altura;
    
    public void intro()
    {
        System.out.println("AREA DE FIGURAS GEOMETRICAS-----");
        Figuras Fig = new Figuras();
        
        System.out.print("Dame el lado del cuadrado: ");
        lado = Scan.nextInt();
        Fig.Cuadrado(lado);
        
        System.out.print("Dame la base del rectangulo: ");
        base = Scan.nextInt();
        System.out.print("Dame la altura del rectangulo: ");
        altura = Scan.nextInt();
        Fig.Rectangulo(base,altura);
        
        System.out.print("Dame la base del triangulo: ");
        base = Scan.nextInt();
        System.out.print("Dame la altura del triangulo: ");
        altura = Scan.nextInt();
        Fig.Triangulo(base,altura);
        
        System.out.print("Dame el radio del circulo: ");
        radio = Scan.nextInt();
        Fig.Circulo(radio);
        
        System.out.print("Dame el lado del cubo: ");
        lado = Scan.nextInt();
        Fig.Cubo(lado);
        
        System.out.print("Dame el radio del esfera: ");
        radio = Scan.nextInt();
        Fig.Esfera(radio);
    }
}
