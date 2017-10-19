package com.example.cida.chbsaude.Entidades;

    public class Plano implements EntidadePersistivel {

        private int id;
        private String nome;

        public Plano() {

        }

        public Plano(int id, String nome) {
            super();
            this.id = id;
            this.nome = nome;


        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }



        @Override
        public String toString() {
            return nome + " " + "id: "+id;
        }

    }




