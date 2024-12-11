public class Producto {
    private String fechaCaducidad;
    private int numeroLote;

    public Producto(String fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }
}

    class productoFresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

        public productoFresco(String fechaCaducidad, int numeroLote, String fechaEnvasado, String paisOrigen) {
            super(fechaCaducidad, numeroLote);
            this.fechaEnvasado = fechaEnvasado;
            this.paisOrigen = paisOrigen;
        }

        public String getFechaEnvasado() {
            return fechaEnvasado;
        }

        public void setFechaEnvasado(String fechaEnvasado) {
            this.fechaEnvasado = fechaEnvasado;
        }

        public String getPaisOrigen() {
            return paisOrigen;
        }

        public void setPaisOrigen(String paisOrigen) {
            this.paisOrigen = paisOrigen;
        }

        @Override
        public String toString() {
            return "productoFresco{" +
                    "fechaEnvasado='" + fechaEnvasado + '\'' +
                    ", paisOrigen='" + paisOrigen + '\'' +
                    '}'+super.toString();
        }
    }
    class productoRefrigerado extends Producto{
        private int COSA;

        public productoRefrigerado(String fechaCaducidad, int numeroLote, int COSA) {
            super(fechaCaducidad, numeroLote);
            this.COSA = COSA;

        }

        public int getCOSA() {
            return COSA;
        }

        public void setCOSA(int COSA) {
            this.COSA = COSA;
        }

        @Override
        public String toString() {
            return "productoRefrigerado{" +
                    "COSA=" + COSA +
                    '}'+super.toString();
        }
    }

    class productoCongelado extends Producto{
        private double temprecom;

        public productoCongelado(String fechaCaducidad, int numeroLote, int temprecom) {
            super(fechaCaducidad, numeroLote);
            this.temprecom = temprecom;
        }

        public double getTemprecom() {
            return temprecom;
        }

        public void setTemprecom(int temprecom) {
            this.temprecom = temprecom;
        }

        @Override
        public String toString() {
            return "productoCongelado{" +
                    "temprecom=" + temprecom +
                    '}'+super.toString();
        }
    }
