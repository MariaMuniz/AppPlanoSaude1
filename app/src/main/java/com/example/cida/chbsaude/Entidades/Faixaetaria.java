package com.example.cida.chbsaude.Entidades;



    public class Faixaetaria implements EntidadePersistivel {

        private int id;
        private int idIdades;
        private  int inicio;
        private int fim;

        public Faixaetaria() {
        }

        public Faixaetaria (int id, int idIdades,int inicio, int fim) {
            super();
            this.id = id;
            this.idIdades = idIdades;
            this.inicio = inicio;
            this.fim = fim;


        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getIdIdades() {
            return idIdades;
        }

        public void setIdIdades(int idIdades) {
            this.idIdades = idIdades;
        }

        public int getInicio() {
            return inicio;
        }

        public void setInicio(int inicio) {
            this.inicio = inicio;
        }

        public int getFim() {
            return fim;
        }

        public void setFim(int fim) {
            this.fim = fim;
        }


        @Override
        public String toString() {
            return" Id:"+ id +" IdIdades:"+ idIdades +  "inicio:"+ inicio + " " + fim + " ";}


    }



