package com.example.cida.chbsaude.Entidades;



    public class Suboperadora   implements EntidadePersistivel{

        private int id;
        private String nome;
        private int idPlano;
        private int idOperadora;

        public Suboperadora() {
        }

        public Suboperadora(int id, String nome, int idPlano, int idOperadora) {
            super();
            this.id = id;
            this.nome = nome;
            this.idPlano = idPlano;
            this.idOperadora = idOperadora;


        }

        @Override
        public int getId() {
            return id;
        }

        @Override
        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
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

        @Override
        public String toString() {
            return  " Id: "+id  + nome +  "idPlano:" + idPlano + " idOperadora:" + idOperadora ;
        }

    }





