package com.example.cida.chbsaude.Banco;

import android.content.ContentValues;
import android.content.Context;

import com.example.cida.chbsaude.Entidades.Suboperadora;


public class SuboperadoraDAO extends DAOBasico<Suboperadora> {


        public static final String NOME_TABELA = "Suboperadora";
        public static final String COLUNA_ID = "id";
        public static final String COLUNA_NOME = "nome";
        public static final String COLUNA_ID_PLANO = "id_plano";
        public static final String COLUNA_ID_OPERADORA = "id_operadora";


        public static final String SCRIPT_CRIACAO_TABELA_SUBOPERADORA = "CREATE TABLE " + NOME_TABELA + "("
                + COLUNA_ID + " INTEGER PRIMARY KEY," + COLUNA_NOME + " TEXT," + COLUNA_ID_PLANO + " INTEGER," + COLUNA_ID_OPERADORA + " INTEGER" + ") ";

        public static final String SCRIPT_DELECAO_TABELA = "DROP TABLE IF EXISTS " + NOME_TABELA;

        private static SuboperadoraDAO instance;


        public static SuboperadoraDAO getInstance(Context context) {
            if (instance == null)
                instance = new SuboperadoraDAO(context);
            return instance;

        }

        public SuboperadoraDAO(Context context) {
            super(context);
        }

        @Override
        public String getNomeTabela() {
            return NOME_TABELA;
        }

        @Override
        public String getNomeColunaPrimaryKey() {
            return COLUNA_ID;
        }

        public ContentValues entidadeParacontentValues(Suboperadora suboperadora) {
            ContentValues values = new ContentValues();
            if (suboperadora.getId() > 0) {
                values.put(COLUNA_ID, suboperadora.getId());
            }

            values.put(COLUNA_NOME, suboperadora.getNome());
            values.put(COLUNA_ID_PLANO, suboperadora.getIdPlano());
            values.put(COLUNA_ID_OPERADORA, suboperadora.getIdOperadora());


            return values;
        }


        @Override
        public Suboperadora contentValuesParaEntidade(ContentValues contentValues) {
            Suboperadora suboperadora = new Suboperadora();
            suboperadora.setId(contentValues.getAsInteger(COLUNA_ID));
            suboperadora.setNome(contentValues.getAsString(COLUNA_NOME));
            suboperadora.setIdPlano(contentValues.getAsInteger(COLUNA_ID_PLANO));
            suboperadora.setIdOperadora(contentValues.getAsInteger(COLUNA_ID_OPERADORA));


            return suboperadora;
        }

    }



