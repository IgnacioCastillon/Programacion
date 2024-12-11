import java.util.Random;
import java.util.Scanner;

public class trivial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String tirada = "";
        String tematica = "";
        float ronda = 1;
        boolean ganador = false;
        boolean repetirtirada;
        String respuesta;
        String correcta;
        int repeticion = 0;
        System.out.print("Cuantos jugadores van a participar: ");
        int jugadores = sc.nextInt();
        sc.nextLine();
        String[] nombre = new String[jugadores];
        int[] casilla = new int[jugadores];
        int[] puntos = new int[jugadores];
        for (int i = 0; i < jugadores; i++) {
            System.out.println("Nombre jugador " + i + ":");
            nombre[i] = sc.nextLine();
        }
        while (!ganador && !tirada.equalsIgnoreCase("Fin")) {
            System.out.println();
            System.out.println("Ronda: " + ronda);
            if (ronda >= 2) {
                for (int i = 0; i < jugadores; i++) {
                    System.out.println(nombre[i] + " está en la casilla " + casilla[i] + ".");
                    System.out.println(nombre[i] + " lleva " + puntos[i] + " puntos.");
                }
            }
            System.out.println();
            for (int i = 0; i < jugadores; i++) {
                do {
                    ronda = ronda + 0.5F;
                    System.out.println(nombre[i] + " Pulsa enter para tirar los dados");
                    tirada = sc.nextLine();
                    int dado1 = rd.nextInt(6) + 1;
                    int dado2 = rd.nextInt(6) + 1;
                    int sumadados = dado1 + dado2;
                    System.out.println("Primer dado: "+dado1);
                    System.out.println("Segundo dado: "+dado2);
                    System.out.println("Has sacado un " + sumadados);
                    casilla[i] = casilla[i] + sumadados;
                    if (casilla[i] > 30) {
                        casilla[i] -= 30;
                    }
                    System.out.println("Has avanzado desde la casilla " + (casilla[i] - sumadados) + " a la casilla " + casilla[i]);

                    if (casilla[i] % 6 == 1) {
                        tematica = "Entretenimiento";
                    } else if (casilla[i] % 6 == 2) {
                        tematica = "Ciencia";
                    } else if (casilla[i] % 6 == 3) {
                        tematica = "Geografia";
                    } else if (casilla[i] % 6 == 4) {
                        tematica = "Arte";
                    } else if (casilla[i] % 6 == 5) {
                        tematica = "Deporte";
                    } else if (casilla[i] % 6 == 0) {
                        tematica = "Libre elección";
                    }
                    System.out.println("Te ha tocado pregunta de " + tematica);
                    if (tematica.equalsIgnoreCase("Libre elección")) {
                        System.out.println("Has tenido suerte, puedes elegir la categoría que prefieras");
                        System.out.println("A) Entretenimiento");
                        System.out.println("B) Ciencia");
                        System.out.println("C) Geografía");
                        System.out.println("D) Arte");
                        System.out.println("E) Deporte");
                        String tematicaelegida = sc.nextLine().toLowerCase();
                        switch (tematicaelegida) {
                            case "a" -> tematica = "Entretenimiento";
                            case "b" -> tematica = "Ciencia";
                            case "c" -> tematica = "Geografia";
                            case "d" -> tematica = "Arte";
                            case "e" -> tematica = "Deporte";
                        }
                        System.out.println("Has elegido " + tematica + " vamos allá.");
                        System.out.println("Pregunta sobre " + tematica);
                    }
                    if (tematica.equalsIgnoreCase("Entretenimiento")) {
                        int entretenimiento = rd.nextInt(10) + 1;
                        if (entretenimiento == 1) {
                            System.out.println("¿Cuál es el nombre del videojuego en el que debes sobrevivir en un mundo postapocalíptico luchando contra infectados y otros peligros, protagonizado por Ellie y Joel?");
                            System.out.println("A) World of war");
                            System.out.println("B) Project Zomboi");
                            System.out.println("C) The last of Us");
                            System.out.println("D) Minecraft");
                            respuesta = sc.nextLine();
                            correcta = "C) The last of Us";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 2) {
                            System.out.println("En la serie Stranger Things, ¿cómo se llama el mundo alternativo y oscuro al que los personajes se refieren cuando encuentran portales en Hawkins?");
                            System.out.println("A) Linea oscura");
                            System.out.println("B) Dimensión fantasma");
                            System.out.println("C) Mundo perdido");
                            System.out.println("D) El otro lado");
                            respuesta = sc.nextLine();
                            correcta = "D) El otro lado";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 3) {
                            System.out.println("¿Qué hechizo usa Harry Potter para repeler a los dementores en la saga de películas?");
                            System.out.println("A) Expecto Patronum");
                            System.out.println("B) Engorgio");
                            System.out.println("C) Avada Kedavra");
                            System.out.println("D) Alohomora");
                            respuesta = sc.nextLine();
                            correcta = "A) Expecto Patronum";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 4) {
                            System.out.println("¿Cuál es el nombre del videojuego de supervivencia de 2020 en el que controlas a un personaje en una nave espacial mientras intentas descubrir al impostor?");
                            System.out.println("A) Ark Survival Evolved");
                            System.out.println("B) Among Us");
                            System.out.println("C) Town of Salem");
                            System.out.println("D) Happy Wheels");
                            respuesta = sc.nextLine();
                            correcta = "B) Among Us";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 5) {
                            System.out.println("En la película El Rey León, ¿cómo se llama el malvado tío de Simba que conspira para tomar el trono?");
                            System.out.println("A) Jorge");
                            System.out.println("B) Mufasa");
                            System.out.println("C) Scar");
                            System.out.println("D) Pumba");
                            respuesta = sc.nextLine();
                            correcta = "C) Scar";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 6) {
                            System.out.println("¿Cuál es el nombre del héroe de videojuego que viaja por mundos de ensueño con una llave espada y tiene amigos como Donald y Goofy?");
                            System.out.println("A) Sora");
                            System.out.println("B) Mickie Mouse");
                            System.out.println("C) Rocky");
                            System.out.println("D) Buky");
                            respuesta = sc.nextLine();
                            correcta = "A) Sora";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 7) {
                            System.out.println("En Breaking Bad, ¿cuál es el alias que usa Walter White cuando se convierte en un famoso fabricante de metanfetaminas?");
                            System.out.println("A) Señor White");
                            System.out.println("B) Heisenberg");
                            System.out.println("C) Walter");
                            System.out.println("D) Peluso");
                            respuesta = sc.nextLine();
                            correcta = "B) Heisenberg";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 8) {
                            System.out.println("¿Qué actor interpreta al personaje de Iron Man en el Universo Cinematográfico de Marvel?");
                            System.out.println("A) Mark Ruffalo");
                            System.out.println("B) Brad Pitt");
                            System.out.println("C) Robert Downey Jr");
                            System.out.println("D) Tom Hanks");
                            respuesta = sc.nextLine();
                            correcta = "C) Robert Downey Jr";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 9) {
                            System.out.println("¿Cómo se llama el videojuego en el que los jugadores asumen el rol de un cazador en un mundo lleno de enormes monstruos que deben derrotar, popularizado por Capcom?");
                            System.out.println("A) Minecraft");
                            System.out.println("B) Unturned");
                            System.out.println("C) State of Decay 2");
                            System.out.println("D) Monster Hunter");
                            respuesta = sc.nextLine();
                            correcta = "D) Monster Hunter";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (entretenimiento == 10) {
                            System.out.println("¿En qué película de Pixar los personajes son emociones dentro de la mente de una niña llamada Riley?");
                            System.out.println("A) Up");
                            System.out.println("B) Inside Out");
                            System.out.println("C) Cars");
                            System.out.println("D) Toy Story");
                            respuesta = sc.nextLine();
                            correcta = "B) Inside Out";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        }
                    }
                    if (tematica.equalsIgnoreCase("Ciencia")) {
                        int ciencia = rd.nextInt(10) + 1;
                        if (ciencia == 1) {
                            System.out.println("¿Cuál es el planeta más grande del sistema solar?");
                            System.out.println("A) Venus");
                            System.out.println("B) Saturno");
                            System.out.println("C) Júpiter");
                            System.out.println("D) Tierra");
                            respuesta = sc.nextLine();
                            correcta = "C) Júpiter";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 2) {
                            System.out.println("¿Cuál es el nombre del proceso mediante el cual las plantas producen su propio alimento usando luz solar?");
                            System.out.println("A) Absorción");
                            System.out.println("B) Transpiración");
                            System.out.println("C) Nutrición");
                            System.out.println("D) Fotosíntesis");
                            respuesta = sc.nextLine();
                            correcta = "D) Fotosíntesis";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 3) {
                            System.out.println("¿Qué mineral se necesita para que nuestros huesos se mantengan fuertes?");
                            System.out.println("A) Calcio");
                            System.out.println("B) Hierro");
                            System.out.println("C) Yodo");
                            System.out.println("D) Potasio");
                            respuesta = sc.nextLine();
                            correcta = "A) Calcio";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 4) {
                            System.out.println("¿A qué velocidad aproximada viaja la luz en el vacío?");
                            System.out.println("A) 3.000 km/s");
                            System.out.println("B) 300.000 km/s");
                            System.out.println("C) 300 km/s");
                            System.out.println("D) 30.000 km/s");
                            respuesta = sc.nextLine();
                            correcta = "B) 300,000 km/s";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 5) {
                            System.out.println("¿Cuál es el nombre del único satélite natural de la Tierra?");
                            System.out.println("A) Titán");
                            System.out.println("B) Ganímedes");
                            System.out.println("C) Luna");
                            System.out.println("D) Calisto");
                            respuesta = sc.nextLine();
                            correcta = "C) Luna";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 6) {
                            System.out.println("¿Cómo se llama el famoso científico que desarrolló la teoría de la relatividad?");
                            System.out.println("A) Albert Einstein");
                            System.out.println("B) Galileo Galilei");
                            System.out.println("C) Isaac Newton");
                            System.out.println("D) Charles Darwin");
                            respuesta = sc.nextLine();
                            correcta = "A) Albert Einstein";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 7) {
                            System.out.println("¿Cuál es el metal que, a temperatura ambiente, se encuentra en estado líquido?");
                            System.out.println("A) Estaño");
                            System.out.println("B) Mercurio");
                            System.out.println("C) Platino");
                            System.out.println("D) Zinc");
                            respuesta = sc.nextLine();
                            correcta = "B) Mercurio";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 8) {
                            System.out.println("¿Cuántos planetas en el sistema solar tienen anillos?");
                            System.out.println("A) Cinco");
                            System.out.println("B) Dos");
                            System.out.println("C) Cuatro");
                            System.out.println("D) Seis");
                            respuesta = sc.nextLine();
                            correcta = "C) Cuatro";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 9) {
                            System.out.println("¿Qué elemento químico tiene el símbolo \"O\" en la tabla periódica?");
                            System.out.println("A) Hidrogeno");
                            System.out.println("B) Radio");
                            System.out.println("C) Oro");
                            System.out.println("D) Oxigeno");
                            respuesta = sc.nextLine();
                            correcta = "D) Oxigeno";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (ciencia == 10) {
                            System.out.println("¿Cómo se llama el órgano del cuerpo humano que es responsable de bombear la sangre?");
                            System.out.println("A) Pulmones");
                            System.out.println("B) Corazón");
                            System.out.println("C) Riñones");
                            System.out.println("D) Higado");
                            respuesta = sc.nextLine();
                            correcta = "B) Corazón";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        }
                    }
                    if (tematica.equalsIgnoreCase("Geografia")) {
                        int geografia = rd.nextInt(10) + 1;
                        if (geografia == 1) {
                            System.out.println("¿Cuál es el país más grande del mundo en términos de superficie?");
                            System.out.println("A) ESPAÑA");
                            System.out.println("B) India");
                            System.out.println("C) Rusia");
                            System.out.println("D) China");
                            respuesta = sc.nextLine();
                            correcta = "C) Rusia";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 2) {
                            System.out.println("¿En qué continente se encuentra el desierto del Sahara?");
                            System.out.println("A) Asia");
                            System.out.println("B) America");
                            System.out.println("C) Europa");
                            System.out.println("D) África");
                            respuesta = sc.nextLine();
                            correcta = "D) África";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 3) {
                            System.out.println("¿Cuál es la capital de Japón?");
                            System.out.println("A) Tokio");
                            System.out.println("B) Pekín");
                            System.out.println("C) París");
                            System.out.println("D) Oslo");
                            respuesta = sc.nextLine();
                            correcta = "A) Tokio    ";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 4) {
                            System.out.println("¿Cuántos océanos existen en el planeta Tierra?");
                            System.out.println("A) Cinco");
                            System.out.println("B) Tres");
                            System.out.println("C) Cuatro");
                            System.out.println("D) Dos");
                            respuesta = sc.nextLine();
                            correcta = "A) Cinco";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 5) {
                            System.out.println("¿En qué país se encuentran las ruinas de Machu Picchu?");
                            System.out.println("A) Bolivia");
                            System.out.println("B) Colombia");
                            System.out.println("C) Perú");
                            System.out.println("D) Mexico");
                            respuesta = sc.nextLine();
                            correcta = "C) Perú";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 6) {
                            System.out.println("¿Qué río es el más largo del mundo?");
                            System.out.println("A) Amazonas");
                            System.out.println("B) Nilo");
                            System.out.println("C) Guadalquivir");
                            System.out.println("D) Jaboneros");
                            respuesta = sc.nextLine();
                            correcta = "A) Amazonas";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 7) {
                            System.out.println("¿Cuál es el país más pequeño del mundo, tanto en superficie como en población?");
                            System.out.println("A) Mónaco");
                            System.out.println("B) Ciudad del Vaticano");
                            System.out.println("C) Malta");
                            System.out.println("D) San Marino");
                            respuesta = sc.nextLine();
                            correcta = "B) Ciudad del Vaticano";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 8) {
                            System.out.println("¿Qué montaña es la más alta de la Tierra?");
                            System.out.println("A) Mulhacén");
                            System.out.println("B) K2");
                            System.out.println("C) Everest");
                            System.out.println("D) Kangchenjunga");
                            respuesta = sc.nextLine();
                            correcta = "C) Everest";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 9) {
                            System.out.println("¿En qué continente está ubicada la Gran Barrera de Coral?");
                            System.out.println("A) América");
                            System.out.println("B) Asia");
                            System.out.println("C) Europa");
                            System.out.println("D) Oceanía");
                            respuesta = sc.nextLine();
                            correcta = "D) Oceanía";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (geografia == 10) {
                            System.out.println("¿Qué país tiene la mayor cantidad de islas en el mundo?");
                            System.out.println("A) Grecia");
                            System.out.println("B) Suecia");
                            System.out.println("C) Holanda");
                            System.out.println("D) Paises Bajos");
                            respuesta = sc.nextLine();
                            correcta = "B) Suecia";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        }
                    }
                    if (tematica.equalsIgnoreCase("Arte")) {
                        int arte = rd.nextInt(10) + 1;
                        if (arte == 1) {
                            System.out.println("¿Quién pintó la famosa obra La última cena?");
                            System.out.println("A) Vincent Van Gogh");
                            System.out.println("B) Pablo Picasso");
                            System.out.println("C) Leonardo da Vinci");
                            System.out.println("D) Salvador Dalí");
                            respuesta = sc.nextLine();
                            correcta = "C) Leonardo da Vinci";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 2) {
                            System.out.println("¿En qué país se encuentra el Museo del Louvre, uno de los museos más famosos del mundo?");
                            System.out.println("A) Suecia");
                            System.out.println("B) Alemania");
                            System.out.println("C) España");
                            System.out.println("D) Francia");
                            respuesta = sc.nextLine();
                            correcta = "D) Francia";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 3) {
                            System.out.println("¿Cuál es el nombre de la escultura de mármol que representa a una figura masculina desnuda, esculpida por Miguel Ángel?");
                            System.out.println("A) El David");
                            System.out.println("B) Cristo Redentor");
                            System.out.println("C) El pensador");
                            System.out.println("D) Discóbolo");
                            respuesta = sc.nextLine();
                            correcta = "A) El David    ";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 4) {
                            System.out.println("¿A qué movimiento artístico pertenecen obras como Noche estrellada de Vincent van Gogh?");
                            System.out.println("A) Postimpresionismo");
                            System.out.println("B) Surrealismo");
                            System.out.println("C) Barroco");
                            System.out.println("D) Realismo");
                            respuesta = sc.nextLine();
                            correcta = "A) Postimpresionismo";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 5) {
                            System.out.println("¿Qué arquitecto español diseñó la Sagrada Familia en Barcelona?");
                            System.out.println("A) Mariano Calvo Pereira");
                            System.out.println("B) Juan Daura");
                            System.out.println("C) Antoni Gaudí");
                            System.out.println("D) Mario Camiña");
                            respuesta = sc.nextLine();
                            correcta = "C) Antoni Gaudí";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 6) {
                            System.out.println("Quién pintó la obra La persistencia de la memoria, famosa por sus relojes derretidos?");
                            System.out.println("A) Salvador Dalí");
                            System.out.println("B) Pablo Picasso");
                            System.out.println("C) Vincent Van Gogh");
                            System.out.println("D) Leonardo da Vinci");
                            respuesta = sc.nextLine();
                            correcta = "A) Salvador Dalí";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 7) {
                            System.out.println("¿En qué país surgió el movimiento artístico conocido como Impresionismo?");
                            System.out.println("A) España");
                            System.out.println("B) Francia");
                            System.out.println("C) Alemania");
                            System.out.println("D) Italia");
                            respuesta = sc.nextLine();
                            correcta = "B) Francia";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 8) {
                            System.out.println("¿Cuál es el nombre del famoso pintor neerlandés que perdió una oreja y es autor de Los girasoles?");
                            System.out.println("A) Pablo Picasso");
                            System.out.println("B) Salvador Dalí");
                            System.out.println("C) Vincent Van Gogh");
                            System.out.println("D) Leonardo da Vinci");
                            respuesta = sc.nextLine();
                            correcta = "C) Vincent Van Gogh";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 9) {
                            System.out.println("¿Cómo se llama el estilo artístico de los años 1920 que influenció el diseño de edificios, joyas y muebles con formas geométricas y líneas elegantes?");
                            System.out.println("A) Futurismo ");
                            System.out.println("B) Expresionismo");
                            System.out.println("C) Cubismo");
                            System.out.println("D) Art Decó");
                            respuesta = sc.nextLine();
                            correcta = "D) Art Decó";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (arte == 10) {
                            System.out.println("¿Qué famoso artista fue el creador de la técnica del “dripping”, donde se gotea pintura sobre el lienzo?");
                            System.out.println("A) Gustav Klimt");
                            System.out.println("B) Jackson Pollock");
                            System.out.println("C) Rembrandt");
                            System.out.println("D) Caravaggio");
                            respuesta = sc.nextLine();
                            correcta = "B) Jackson Pollock";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        }
                    }
                    if (tematica.equalsIgnoreCase("Deporte")) {
                        int deporte = rd.nextInt(10) + 1;
                        if (deporte == 1) {
                            System.out.println("¿En qué deporte se utiliza un balón con forma ovalada y se juegan cuatro tiempos llamados cuartos?");
                            System.out.println("A) Pin Pon");
                            System.out.println("B) Baloncesto");
                            System.out.println("C) Fútbol americano");
                            System.out.println("D) Balonmano");
                            respuesta = sc.nextLine();
                            correcta = "C) Fútbol americano";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 2) {
                            System.out.println("¿Cuál es el único país que ha ganado cinco Copas del Mundo de la FIFA en fútbol masculino?");
                            System.out.println("A) Suecia");
                            System.out.println("B) Alemania");
                            System.out.println("C) España");
                            System.out.println("D) Brasil");
                            respuesta = sc.nextLine();
                            correcta = "D) Brasil";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 3) {
                            System.out.println("¿En qué deporte compiten las selecciones por la Copa Davis?");
                            System.out.println("A) Tenis");
                            System.out.println("B) Padel");
                            System.out.println("C) Badminton");
                            System.out.println("D) Baloncesto");
                            respuesta = sc.nextLine();
                            correcta = "A) Tenis";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 4) {
                            System.out.println("¿Cuántos jugadores hay en el campo por equipo en un partido de fútbol tradicional?");
                            System.out.println("A) Once");
                            System.out.println("B) Siete");
                            System.out.println("C) Cinco");
                            System.out.println("D) Quince");
                            respuesta = sc.nextLine();
                            correcta = "A) Once";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 5) {
                            System.out.println("¿En qué ciudad se celebraron los primeros Juegos Olímpicos modernos en 1896?");
                            System.out.println("A) Tokio");
                            System.out.println("B) París");
                            System.out.println("C) Atenas");
                            System.out.println("D) Roma");
                            respuesta = sc.nextLine();
                            correcta = "C) Atenas";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 6) {
                            System.out.println("¿Qué jugador de baloncesto es famoso por sus seis campeonatos ganados con los Chicago Bulls y por el número 23?");
                            System.out.println("A) Michael Jordan");
                            System.out.println("B) Kobe Bryant");
                            System.out.println("C) Stephen Curry");
                            System.out.println("D) LeBron James");
                            respuesta = sc.nextLine();
                            correcta = "A) Michael Jordan";
                            if (respuesta.equalsIgnoreCase("A")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 7) {
                            System.out.println("¿Cuál es el nombre de la competición ciclista más famosa del mundo?");
                            System.out.println("A) Milán-San Remo");
                            System.out.println("B) Tour de Francia");
                            System.out.println("C) Tour de Flandes");
                            System.out.println("D) París-Roubaix");
                            respuesta = sc.nextLine();
                            correcta = "B) Tour de Francia";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 8) {
                            System.out.println("¿Cuántos sets debe ganar un jugador para vencer en un partido de tenis en torneos de Grand Slam masculinos?");
                            System.out.println("A) Cuatro de cinco sets");
                            System.out.println("B) Cuatro de tres sets");
                            System.out.println("C) Tres de cinco sets");
                            System.out.println("D) Dos de cinco sets");
                            respuesta = sc.nextLine();
                            correcta = "C) Tres de cinco sets";
                            if (respuesta.equalsIgnoreCase("C")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 9) {
                            System.out.println("¿Qué boxeador es apodado “El Canelo” y es conocido por su carrera en el boxeo profesional?");
                            System.out.println("A) Marcos Álvarez");
                            System.out.println("B) Brian Álvarez");
                            System.out.println("C) Jon Álvarez");
                            System.out.println("D) Saúl Álvarez");
                            respuesta = sc.nextLine();
                            correcta = "D) Saúl Álvarez";
                            if (respuesta.equalsIgnoreCase("D")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        } else if (deporte == 10) {
                            System.out.println("¿En qué deporte se usan los términos “birdie”, “eagle” y “bogey”?");
                            System.out.println("A) Futbol");
                            System.out.println("B) Golf");
                            System.out.println("C) Badminton");
                            System.out.println("D) Balonmano");
                            respuesta = sc.nextLine();
                            correcta = "B) Golf";
                            if (respuesta.equalsIgnoreCase("B")) {
                                System.out.println("Correcto. Has ganado 5 puntos");
                                puntos[i] = puntos[i] + 5;
                                System.out.println("Tienes " + puntos[i] + " puntos");
                            } else {
                                System.out.println("Fallaste. La respuesta correcta era la " + correcta);
                            }
                        }
                    }

                    repetirtirada = dado1 == dado2;
                    if (repetirtirada) {
                        System.out.println("Como has sacado el mismo numero en los dos dados, tiras de nuevo");
                        repeticion++;
                    }
                } while (repetirtirada && repeticion < 3);
                if (repeticion == 3) {
                    casilla[i] = 0;
                    System.out.println("Has tirado 3 veces seguidas el mismo numero en los dos dados. Vuelve a la casilla de salida y pierdes 5 puntos");
                    puntos[i] = puntos[i] - 5;
                    System.out.println("A veces tanta suerte da mala suerte.");
                }
            }
        }
    }
}