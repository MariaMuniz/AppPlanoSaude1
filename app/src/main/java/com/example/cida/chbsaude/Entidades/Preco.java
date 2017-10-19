package com.example.cida.chbsaude.Entidades;


    public class Preco implements  EntidadePersistivel{

        private int id;
        private Double valor;
        private int idPlano;
        private int idOperadora;
        private int idSuboperadora;


        public Preco() {
        }

        public Preco(int id, Double valor, int idPlano, int idOperadora,int idSuboperadora) {
            super();
            this.id = id;
            this.valor = valor;
            this.idPlano = idPlano;
            this.idOperadora = idOperadora;
            this.idOperadora = idSuboperadora;

        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public int getIdPlano() {
            return idPlano;
        }

        public void setIdPlano(int idPlano) {
            this.idPlano = idPlano;
        }

        public int getIdOperadora() {
            return idOperadora;
        }

        public void setIdOperadora(int idOperadora) {
            this.idOperadora = idOperadora;
        }

        public int getIdSuboperadora() {
            return idSuboperadora;
        }

        public void setIdSuboperadora(int idSuboperadora) {
            this.idSuboperadora = idSuboperadora;
        }

        @Override
        public String toString() {
            return  " Id: "+id +" valor: " + valor +  "idPlano:" + idPlano + " idOperadora:" + idOperadora + " idSuboperadora:" + idSuboperadora;
        }


    }





