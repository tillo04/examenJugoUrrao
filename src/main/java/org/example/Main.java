package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String usuario;
        String usuarioBD="tomaswndy";
        int contadorIntentos=0;
        int opcionMenuPrincipal;
        int opcionMenuSecundario;
        int[] precios={1,2,3,4,5,6}; 
        int[] cantidades=new int[6];
        int opcionCantidadesDos;
        int opcionCantidades;
        int opcionModificar;
        double total=0.0;
        while(contadorIntentos<3){
            System.out.println("ingrese el usuario : ");
            usuario=sc.nextLine();
            if (usuario.equals(usuarioBD)){
                System.out.println("autenticacion exitosa");
                System.out.println("bienvenido a restaurante");
                do {
                    System.out.println("1.ingresar orden");
                    System.out.println("2.total");
                    System.out.println("3.modificar orden");
                    System.out.println("4.salir ");
                    System.out.println("ingrese la opcion");
                    opcionMenuPrincipal=sc.nextInt();
                    if (opcionMenuPrincipal==1){
                        while (true){
                            System.out.println("1. plato 1");
                            System.out.println("2. plato 2");
                            System.out.println("3. plato 3");
                            System.out.println("4. plato 4");
                            System.out.println("5. plato 5");
                            System.out.println("6. plato 6");
                            System.out.println("7.salir");
                            System.out.println("digite una opcion ");
                            opcionMenuSecundario=sc.nextInt();
                            if (opcionMenuSecundario==1){
                                System.out.println("cuantas cantidades quiere de plato1");
                                opcionCantidades=sc.nextInt();
                                cantidades[0]=cantidades[0]+opcionCantidades;
                            } else if(opcionMenuSecundario==2) {
                                System.out.println("cuantas cantidades quiere de plato2");
                                opcionCantidades=sc.nextInt();
                                cantidades[1]=cantidades[1]+opcionCantidades;
                            } else if (opcionMenuSecundario==3) {
                                System.out.println("cuantas cantidades quiere de plato3");
                                opcionCantidades=sc.nextInt();
                                cantidades[2]=cantidades[2]+opcionCantidades;
                            } else if (opcionMenuSecundario==4) {
                                System.out.println("cuantas cantidades quiere de plato4");
                                opcionCantidades=sc.nextInt();
                                cantidades[3]=cantidades[3]+opcionCantidades;
                            } else if (opcionMenuSecundario==5) {
                                System.out.println("cuantas cantidades quiere de plato5");
                                opcionCantidades=sc.nextInt();
                                cantidades[4]=cantidades[4]+opcionCantidades;
                            } else if (opcionMenuSecundario==6) {
                                System.out.println("cuantas cantidades quiere de plato6");
                                opcionCantidades=sc.nextInt();
                                cantidades[5]=cantidades[5]+opcionCantidades;
                            } else if (opcionMenuSecundario==7) {
                                System.out.println("volviendo al menu anterior");
                                break;

                            }else{
                                System.out.println("opcion incorrecta");
                            }
                        }

                    } else if (opcionMenuPrincipal==2) {

                        System.out.println("calculando total");
                        total=(cantidades[0]*precios[0])+(cantidades[1]*precios[1])+(cantidades[2]*precios[2])+
                                (cantidades[3]*precios[3]+(cantidades[4]*precios[4])+(cantidades[5]*precios[5]));
                        System.out.println("el total es :" +total);

                    } else if (opcionMenuPrincipal==3) {
                        System.out.println("1. plato 1");
                        System.out.println("2. plato 2");
                        System.out.println("3. plato 3");
                        System.out.println("4. plato 4");
                        System.out.println("5. plato 5");
                        System.out.println("6. plato 6");
                        System.out.println("digite el plato que quiere modificar la cantidad: ");
                        opcionModificar=sc.nextInt();
                        if (opcionModificar==1){
                            System.out.println("cuantos platos quiere del plato 1");
                            opcionCantidadesDos=sc.nextInt();
                            cantidades[0]=opcionCantidadesDos;
                        } else if (opcionModificar==2) {
                            System.out.println("cuantos platos quiere del plato 2");
                            opcionCantidadesDos=sc.nextInt();
                            cantidades[1]=opcionCantidadesDos;
                        } else if (opcionModificar==3) {
                            System.out.println("cuantos platos quiere del plato 3");
                            opcionCantidadesDos=sc.nextInt();
                            cantidades[2]=opcionCantidadesDos;
                        } else if (opcionModificar==4) {
                            System.out.println("cuantos platos quiere del plato 4");
                            opcionCantidadesDos=sc.nextInt();
                            cantidades[3]=opcionCantidadesDos;
                        } else if (opcionModificar==5) {
                            System.out.println("cuantos platos quiere del plato 5");
                            opcionCantidadesDos=sc.nextInt();
                            cantidades[4]=opcionCantidadesDos;
                        } else if (opcionModificar==6) {
                            System.out.println("cuantos platos quiere del plato 6");
                            opcionCantidadesDos=sc.nextInt();
                            cantidades[5]=opcionCantidadesDos;
                        }else {
                            System.out.println("opcion incorrecta");
                        }


                    } else if (opcionMenuPrincipal==4) {
                        System.out.println("hasta luego");
                    }else {
                        System.out.println("opcion incorrecta");
                    }

                }while (opcionMenuPrincipal!=4);
                break;
            }else {
                System.out.println("incorrecto");
                contadorIntentos++;
            }
        }
    }
}