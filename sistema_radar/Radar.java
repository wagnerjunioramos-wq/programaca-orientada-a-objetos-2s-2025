package sistema_radar;

public class Radar {
    private Integer limitevelocidade;
    private String localizacao;

     void avaliarVelocidade(Carro carro){
        if(carro.getVelocidade() >this.limitevelocidade){
            // emitir notificação
            emitirNotificacao(carro.getPlaca(), carro.getVelocidade());
        }
    }
        public Radar (Integer limitevelocidade, String localizacao){
            this.limitevelocidade = limitevelocidade;
            this.localizacao = localizacao;

        }

        public void setLimiteVelocidade(Integer limitevelocidade){
            this.limitevelocidade = limitevelocidade;
        }

        public Integer getLimiteVelocidade(){
            return this.limitevelocidade;

        }

        public void setLocalizacao(String localizacao){
            this.localizacao = localizacao;

        }

        public String getLocalizacao(){
            return this.localizacao;
        }
        

    
        


    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("placa:"+placa);
        System.out.println("Velocidade observada:"+ velocidadeObservada);
        System.out.println("Limite da Via:"+this.limitevelocidade);
    }
}
