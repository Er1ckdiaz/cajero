import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class cajero {

    String usuario;
    int password;
    String password1;
    int intentos = 0;
    int saldo;
    String cliente;

    public static void main(String[] args) {
        int usuarios;
        int contraseña;
        String contraseña1;
        int seleccion = 0;
        int termino = 0;
        int total = 0;
        int cobro = 0;

        cajero usuario1 = new cajero();
        usuario1.usuario = "carolina";
        usuario1.password = 123;
        usuario1.saldo = 1000;
        usuario1.cliente = "frecuente";

        cajero usuario2 = new cajero();
        usuario2.usuario = "perla";
        usuario2.password = 321;
        usuario2.saldo = 1500;
        usuario2.cliente = "plus";

        cajero usuario3 = new cajero();
        usuario3.usuario = "maria";
        usuario3.password1 = "abc";
        usuario3.saldo = 500;
        usuario3.cliente = "casual";

        System.out.print("usuarios:\n1. carolin" + "\n2. perla" + "\n3. maria");
        System.out.print("\nque usuario eres: ");
        Scanner teclado = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        usuarios = teclado.nextInt();

        if (usuarios == 1) {
            do {
                System.out.print("contraseña: ");
                contraseña = teclado.nextInt();

                if (contraseña == usuario1.password) {
                    System.out.println(" --------- ");
                    System.out.println("bienvenido.");
                    System.out.println(" --------- ");
                    termino = 20;

                    do {
                        do {
                            System.out.println("Porfavor seleccione una opcion:  ");
                            System.out.println("  1. servicios. ");
                            System.out.println("  2. retirar efectivo.");
                            System.out.println("  3. salir.");
                            System.out.println("                  saldo disponible: " + usuario1.saldo);
                            seleccion = teclado.nextInt();

                            if (seleccion >= 1 && seleccion <= 3) {
                                termino = 1;
                            } else {
                                System.out.println(" --------------------------------------------------- ");
                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                System.out.println(" --------------------------------------------------- ");
                            }

                        } while (termino == 0);

                        if (seleccion == 1) {

                            do {
                                do {
                                    System.out.println("Porfavor seleccione el servicio:  ");
                                    System.out.println("  1. Comprar tiempo aire. ");
                                    System.out.println("  2. Pagar luz.");
                                    System.out.println("  3. Pagar agua.");
                                    System.out.println("  4. Canselar servicio.");
                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                    seleccion = teclado.nextInt();

                                    if (seleccion >= 1 && seleccion <= 4) {
                                        termino = 1;
                                    } else {
                                        System.out.println(" --------------------------------------------------- ");
                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                        System.out.println(" --------------------------------------------------- ");
                                    }

                                } while (termino == 0);
                                if (seleccion == 1) {

                                    do {
                                        do {
                                            System.out.println("Porfavor seleccione el monto a comprar:  ");
                                            System.out.println("  1. $50. ");
                                            System.out.println("  2. $100.");
                                            System.out.println("  3. $200.");
                                            System.out.println("  4. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario1.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 4) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario1.saldo = usuario1.saldo - 50;
                                                    termino = 3;
                                                } else if (seleccion == 2) {
                                                    termino = 3;
                                                }

                                            } while (termino != 3);

                                        } else if (seleccion == 2) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario1.saldo = usuario1.saldo - 100;
                                                    termino = 5;
                                                } else if (seleccion == 2) {
                                                    termino = 5;
                                                }

                                            } while (termino != 5);

                                        } else if (seleccion == 3) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario1.saldo = usuario1.saldo - 200;
                                                    termino = 6;
                                                } else if (seleccion == 2) {
                                                    termino = 6;
                                                }

                                            } while (termino != 6);

                                        } else if (seleccion == 4) {
                                            termino = 7;
                                        }

                                    } while (termino != 7);

                                } else if (seleccion == 2) {

                                    do {
                                        do {
                                            System.out.println("Pagar luz:  ");
                                            System.out.println("  1. pagar el monto de $250. ");
                                            System.out.println("  2. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario1.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 2) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario1.saldo = usuario1.saldo - 250;
                                                    termino = 8;
                                                } else if (seleccion == 2) {
                                                    termino = 8;
                                                }

                                            } while (termino != 8);

                                        } else if (seleccion == 2) {
                                            termino = 9;
                                        }
                                    } while (termino != 9);

                                } else if (seleccion == 3) {
                                    do {
                                        do {
                                            System.out.println("Pagar agua:  ");
                                            System.out.println("  1. Pagar 100. ");
                                            System.out.println("  2. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario1.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 2) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {
                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario1.saldo = usuario1.saldo - 100;
                                                    termino = 15;
                                                }
                                            } while (termino != 15);

                                        } else if (seleccion == 2) {
                                            termino = 10;
                                        }

                                    } while (termino != 10);

                                } else if (seleccion == 4) {
                                    termino = 11;
                                }
                            } while (termino != 11);

                        } else if (seleccion == 2) {

                            do {
                                do {
                                    System.out.println("desea retirar alguna cantidad");

                                    System.out.println("  1. Si. ");
                                    System.out.println("  2. regresar.");
                                    System.out.println("                  saldo disponible: " + usuario1.saldo);
                                    seleccion = teclado.nextInt();

                                    if (seleccion >= 1 && seleccion <= 2) {
                                        termino = 13;
                                    } else {
                                        System.out.println(" --------------------------------------------------- ");
                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                        System.out.println(" --------------------------------------------------- ");
                                    }

                                } while (termino != 13);

                                if (seleccion == 1);
                                {
                                    System.out.println("Ingrese el monto a retirar");
                                    System.out.println("Solo se acepta multiplos de 50");
                                    cobro = teclado.nextInt();

                                    if (cobro % 50 == 0) {
                                        System.out.println("desea confirmar la accion: ");
                                        System.out.println("    1. Si. ");
                                        System.out.println("    2. No. ");
                                        seleccion = teclado.nextInt();

                                        if (seleccion == 1) {
                                            usuario1.saldo = usuario1.saldo - cobro;
                                            termino = 12;
                                        }
                                    } else {
                                        System.out.println(" -------------------------");
                                        System.out.println(" no se admite esa cantidad ");
                                        System.out.println(" -------------------------");
                                    }
                                }

                            } while (termino != 12);

                        } else if (seleccion == 3) {

                            System.out.println(" ----------------------- ");
                            System.out.println(" Gracias, vuelva pronto.");
                            System.out.println(" ----------------------- ");
                            termino = 2;

                        }

                    } while (termino != 2);//aqui llegua
                    termino = 20;

                } else if (contraseña != usuario1.password) {
                    System.out.println("--------------------------------");
                    System.out.println("usuario o contraseña incorrecta.");
                    System.out.println("vuelva a intentarlo. ");
                    System.out.println("-------------------------------");
                }
            } while (termino != 20);
        } else if (usuarios == 2) {
            do {

                System.out.print("contraseña: ");
                contraseña = teclado.nextInt();
                if (contraseña == usuario2.password) {
                    System.out.println(" --------- ");
                    System.out.println("bienvenido.");
                    System.out.println(" --------- ");
                    termino = 20;

                    do {
                        do {
                            System.out.println("Porfavor seleccione una opcion:  ");
                            System.out.println("  1. servicios. ");
                            System.out.println("  2. retirar efectivo.");
                            System.out.println("  3. salir.");
                            System.out.println("                  saldo disponible: " + usuario2.saldo);
                            seleccion = teclado.nextInt();

                            if (seleccion >= 1 && seleccion <= 3) {
                                termino = 1;
                            } else {
                                System.out.println(" --------------------------------------------------- ");
                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                System.out.println(" --------------------------------------------------- ");
                            }

                        } while (termino == 0);

                        if (seleccion == 1) {

                            do {
                                do {
                                    System.out.println("Porfavor seleccione el servicio:  ");
                                    System.out.println("  1. Comprar tiempo aire. ");
                                    System.out.println("  2. Pagar luz.");
                                    System.out.println("  3. Pagar agua.");
                                    System.out.println("  4. Canselar servicio.");
                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                    seleccion = teclado.nextInt();

                                    if (seleccion >= 1 && seleccion <= 4) {
                                        termino = 1;
                                    } else {
                                        System.out.println(" --------------------------------------------------- ");
                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                        System.out.println(" --------------------------------------------------- ");
                                    }

                                } while (termino == 0);
                                if (seleccion == 1) {

                                    do {
                                        do {
                                            System.out.println("Porfavor seleccione el monto a comprar:  ");
                                            System.out.println("  1. $50. ");
                                            System.out.println("  2. $100.");
                                            System.out.println("  3. $200.");
                                            System.out.println("  4. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario2.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 4) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario2.saldo = usuario2.saldo - 50;
                                                    termino = 3;
                                                } else if (seleccion == 2) {
                                                    termino = 3;
                                                }

                                            } while (termino != 3);

                                        } else if (seleccion == 2) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario2.saldo = usuario2.saldo - 100;
                                                    termino = 5;
                                                } else if (seleccion == 2) {
                                                    termino = 5;
                                                }

                                            } while (termino != 5);

                                        } else if (seleccion == 3) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario2.saldo = usuario2.saldo - 200;
                                                    termino = 6;
                                                } else if (seleccion == 2) {
                                                    termino = 6;
                                                }

                                            } while (termino != 6);

                                        } else if (seleccion == 4) {
                                            termino = 7;
                                        }

                                    } while (termino != 7);

                                } else if (seleccion == 2) {

                                    do {
                                        do {
                                            System.out.println("Pagar luz:  ");
                                            System.out.println("  1. pagar el monto de $250. ");
                                            System.out.println("  2. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario2.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 2) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario2.saldo = usuario2.saldo - 250;
                                                    termino = 8;
                                                } else if (seleccion == 2) {
                                                    termino = 8;
                                                }

                                            } while (termino != 8);

                                        } else if (seleccion == 2) {
                                            termino = 9;
                                        }
                                    } while (termino != 9);

                                } else if (seleccion == 3) {
                                    do {
                                        do {
                                            System.out.println("Pagar agua:  ");
                                            System.out.println("  1. Pagar 100. ");
                                            System.out.println("  2. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario2.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 2) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {
                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario2.saldo = usuario2.saldo - 100;
                                                    termino = 15;
                                                }
                                            } while (termino != 15);

                                        } else if (seleccion == 2) {
                                            termino = 10;
                                        }

                                    } while (termino != 10);

                                } else if (seleccion == 4) {
                                    termino = 11;
                                }
                            } while (termino != 11);

                        } else if (seleccion == 2) {

                            do {
                                do {
                                    System.out.println("desea retirar alguna cantidad");

                                    System.out.println("  1. Si. ");
                                    System.out.println("  2. regresar.");
                                    System.out.println("                  saldo disponible: " + usuario2.saldo);
                                    seleccion = teclado.nextInt();

                                    if (seleccion >= 1 && seleccion <= 2) {
                                        termino = 13;
                                    } else {
                                        System.out.println(" --------------------------------------------------- ");
                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                        System.out.println(" --------------------------------------------------- ");
                                    }

                                } while (termino != 13);

                                if (seleccion == 1);
                                {
                                    System.out.println("Ingrese el monto a retirar");
                                    System.out.println("Solo se acepta multiplos de 50");
                                    cobro = teclado.nextInt();

                                    if (cobro % 50 == 0) {
                                        System.out.println("desea confirmar la accion: ");
                                        System.out.println("    1. Si. ");
                                        System.out.println("    2. No. ");
                                        seleccion = teclado.nextInt();

                                        if (seleccion == 1) {
                                            usuario2.saldo = usuario2.saldo - cobro;
                                            termino = 12;
                                        }
                                    }
                                }

                            } while (termino != 12);

                        } else if (seleccion == 3) {

                            System.out.println(" ----------------------- ");
                            System.out.println(" Gracias, vuelva pronto.");
                            System.out.println(" ----------------------- ");
                            termino = 2;

                        }

                    } while (termino != 2);
                    termino = 20;
                } else if (contraseña != usuario2.password) {
                    System.out.println("--------------------------------");
                    System.out.println("usuario o contraseña incorrecta.");
                    System.out.println("vuelva a intentarlo. ");
                    System.out.println("-------------------------------");
                }
            } while (termino != 20);

        } else if (usuarios == 3) {

            do {
                System.out.print("contraseña: ");
                contraseña1 = input.nextLine();
                if (contraseña1 == usuario3.password1) {

                    System.out.println(" --------- ");
                    System.out.println("bienvenido.");
                    System.out.println(" --------- ");
                    termino = 20;

                    do {
                        do {
                            System.out.println("Porfavor seleccione una opcion:  ");
                            System.out.println("  1. servicios. ");
                            System.out.println("  2. retirar efectivo.");
                            System.out.println("  3. salir.");
                            System.out.println("                  saldo disponible: " + usuario3.saldo);
                            seleccion = teclado.nextInt();

                            if (seleccion >= 1 && seleccion <= 3) {
                                termino = 1;
                            } else {
                                System.out.println(" --------------------------------------------------- ");
                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                System.out.println(" --------------------------------------------------- ");
                            }

                        } while (termino == 0);

                        if (seleccion == 1) {

                            do {
                                do {
                                    System.out.println("Porfavor seleccione el servicio:  ");
                                    System.out.println("  1. Comprar tiempo aire. ");
                                    System.out.println("  2. Pagar luz.");
                                    System.out.println("  3. Pagar agua.");
                                    System.out.println("  4. Canselar servicio.");
                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                    seleccion = teclado.nextInt();

                                    if (seleccion >= 1 && seleccion <= 4) {
                                        termino = 1;
                                    } else {
                                        System.out.println(" --------------------------------------------------- ");
                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                        System.out.println(" --------------------------------------------------- ");
                                    }

                                } while (termino == 0);
                                if (seleccion == 1) {

                                    do {
                                        do {
                                            System.out.println("Porfavor seleccione el monto a comprar:  ");
                                            System.out.println("  1. $50. ");
                                            System.out.println("  2. $100.");
                                            System.out.println("  3. $200.");
                                            System.out.println("  4. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario3.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 4) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario3.saldo = usuario3.saldo - 50;
                                                    termino = 3;
                                                } else if (seleccion == 2) {
                                                    termino = 3;
                                                }

                                            } while (termino != 3);

                                        } else if (seleccion == 2) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario3.saldo = usuario3.saldo - 100;
                                                    termino = 5;
                                                } else if (seleccion == 2) {
                                                    termino = 5;
                                                }

                                            } while (termino != 5);

                                        } else if (seleccion == 3) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario3.saldo = usuario3.saldo - 200;
                                                    termino = 6;
                                                } else if (seleccion == 2) {
                                                    termino = 6;
                                                }

                                            } while (termino != 6);

                                        } else if (seleccion == 4) {
                                            termino = 7;
                                        }

                                    } while (termino != 7);

                                } else if (seleccion == 2) {

                                    do {
                                        do {
                                            System.out.println("Pagar luz:  ");
                                            System.out.println("  1. pagar el monto de $250. ");
                                            System.out.println("  2. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario3.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 2) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {

                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario3.saldo = usuario3.saldo - 250;
                                                    termino = 8;
                                                } else if (seleccion == 2) {
                                                    termino = 8;
                                                }

                                            } while (termino != 8);

                                        } else if (seleccion == 2) {
                                            termino = 9;
                                        }
                                    } while (termino != 9);

                                } else if (seleccion == 3) {
                                    do {
                                        do {
                                            System.out.println("Pagar agua:  ");
                                            System.out.println("  1. Pagar 100. ");
                                            System.out.println("  2. regresar.");
                                            System.out.println("                  saldo disponible: " + usuario3.saldo);
                                            seleccion = teclado.nextInt();

                                            if (seleccion >= 1 && seleccion <= 2) {
                                                termino = 1;
                                            } else {
                                                System.out.println(" --------------------------------------------------- ");
                                                System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                System.out.println(" --------------------------------------------------- ");
                                            }

                                        } while (termino == 0);
                                        if (seleccion == 1) {
                                            do {
                                                do {
                                                    System.out.println("Porfavor confirme su opcion:  ");
                                                    System.out.println("  1. Si. ");
                                                    System.out.println("  2. No.");
                                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                                    seleccion = teclado.nextInt();

                                                    if (seleccion >= 1 && seleccion <= 2) {
                                                        termino = 1;
                                                    } else {
                                                        System.out.println(" --------------------------------------------------- ");
                                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                                        System.out.println(" --------------------------------------------------- ");
                                                    }

                                                } while (termino == 0);
                                                if (seleccion == 1) {
                                                    usuario3.saldo = usuario3.saldo - 100;
                                                    termino = 15;
                                                }
                                            } while (termino != 15);

                                        } else if (seleccion == 2) {
                                            termino = 10;
                                        }

                                    } while (termino != 10);

                                } else if (seleccion == 4) {
                                    termino = 11;
                                }
                            } while (termino != 11);

                        } else if (seleccion == 2) {

                            do {
                                do {
                                    System.out.println("desea retirar alguna cantidad");

                                    System.out.println("  1. Si. ");
                                    System.out.println("  2. regresar.");
                                    System.out.println("                  saldo disponible: " + usuario3.saldo);
                                    seleccion = teclado.nextInt();

                                    if (seleccion >= 1 && seleccion <= 2) {
                                        termino = 13;
                                    } else {
                                        System.out.println(" --------------------------------------------------- ");
                                        System.out.println(" Opcion no disponible, porfavor vuelva a intentarlo. ");
                                        System.out.println(" --------------------------------------------------- ");
                                    }

                                } while (termino != 13);

                                if (seleccion == 1);
                                {
                                    System.out.println("Ingrese el monto a retirar");
                                    System.out.println("Solo se acepta multiplos de 50");
                                    cobro = teclado.nextInt();

                                    if (cobro % 50 == 0) {
                                        System.out.println("desea confirmar la accion: ");
                                        System.out.println("    1. Si. ");
                                        System.out.println("    2. No. ");
                                        seleccion = teclado.nextInt();

                                        if (seleccion == 1) {
                                            usuario3.saldo = usuario3.saldo - cobro;
                                            termino = 12;
                                        }
                                    } else {
                                        System.out.println(" -------------------------");
                                        System.out.println(" no se admite esa cantidad ");
                                        System.out.println(" -------------------------");
                                    }
                                }

                            } while (termino != 12);

                        } else if (seleccion == 3) {

                            System.out.println(" ----------------------- ");
                            System.out.println(" Gracias, vuelva pronto.");
                            System.out.println(" ----------------------- ");
                            termino = 2;

                        }

                    } while (termino != 2);
                    termino = 20;
                } else if (contraseña1 != usuario3.password1) {
                    System.out.println("--------------------------------");
                    System.out.println("usuario o contraseña incorrecta.");
                    System.out.println("vuelva a intentarlo. ");
                    System.out.println("-------------------------------");
                }
            } while (termino != 20);

        }

    }

}
