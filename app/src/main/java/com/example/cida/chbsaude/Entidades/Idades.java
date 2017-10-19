package com.example.cida.chbsaude.Entidades;


    public class Idades  implements EntidadePersistivel {
        private int id;


        public Idades(int id) {
            super();
            this.id = id;

        }
        public Idades() {
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        @Override
        public String toString() {
            return id + " ";
        }
    }



