public class Matriz {
        private int[][] matriz;
        private int dimension;

        public Matriz(int dimension) {
            this.dimension = dimension;
            matriz = new int[dimension][dimension];
        }

        public void asignarDatos(int[] vector) {
            if (vector.length != dimension * dimension) {
                throw new IllegalArgumentException("El tamaño del vector no coincide con la capacidad de la matriz.");
            }
            int index = 0;
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    matriz[i][j] = vector[index++];
                }
            }
        }

        public void suma(Matriz m) {
            if (m.dimension != this.dimension) {
                throw new IllegalArgumentException("Las matrices deben tener la misma dimensión para poder sumarse.");
            }
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    this.matriz[i][j] += m.matriz[i][j];
                }
            }
        }

        public void producto(Matriz m) {
            if (m.dimension != this.dimension) {
                throw new IllegalArgumentException("Las matrices deben tener la misma dimensión para poder multiplicarse.");
            }

            int[][] resultado = new int[dimension][dimension];

            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    resultado[i][j] = 0; // Inicializa el valor de la posición (i, j)
                    for (int k = 0; k < dimension; k++) {
                        resultado[i][j] += this.matriz[i][k] * m.matriz[k][j];
                    }
                }
            }

            this.matriz = resultado;
        }

        public void mostrar() {
            for (int i = 0; i < dimension; i++) {
                for (int j = 0; j < dimension; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
